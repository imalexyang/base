package cn.bishiti.base.commons.page;

/**
 * 分页用拦截器
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathNotFoundException;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.MappedStatement.Builder;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

@Intercepts({@Signature(type=Executor.class,method="query",args={ MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class })})
public class PageInterceptor implements Interceptor{

  public Object intercept(Invocation invocation) throws Throwable {
    
    //当前环境 MappedStatement，BoundSql，及sql取得
    MappedStatement mappedStatement=(MappedStatement)invocation.getArgs()[0];    
    Object parameter = invocation.getArgs()[1]; 
    BoundSql boundSql = mappedStatement.getBoundSql(parameter); 
    String originalSql = boundSql.getSql().trim();
    Object parameterObject = boundSql.getParameterObject();

    //Page对象获取，“信使”到达拦截器！
    Page page = searchPageWithXpath(boundSql.getParameterObject(),".","page","*/page");

    if(page!=null ){
      //Page对象存在的场合，开始分页处理
      String countSql = getCountSql(originalSql);
      Connection connection=mappedStatement.getConfiguration().getEnvironment().getDataSource().getConnection()  ;          
      PreparedStatement countStmt = connection.prepareStatement(countSql);  
      BoundSql countBS = copyFromBoundSql(mappedStatement, boundSql, countSql);
      DefaultParameterHandler parameterHandler = new DefaultParameterHandler(mappedStatement, parameterObject, countBS);
      parameterHandler.setParameters(countStmt);
      ResultSet rs = countStmt.executeQuery();
      int totpage=0;
      if (rs.next()) {  
        totpage = rs.getInt(1);  
      }
      rs.close();  
      countStmt.close();  
      connection.close();
      
      //分页计算
      page.setTotalRecord(totpage);
      
      //对原始Sql追加limit
      int offset = (page.getPageNo() - 1) * page.getPageSize();
      StringBuffer sb = new StringBuffer();
      sb.append(originalSql).append(" limit ").append(offset).append(",").append(page.getPageSize());
      BoundSql newBoundSql = copyFromBoundSql(mappedStatement, boundSql, sb.toString());
      MappedStatement newMs = copyFromMappedStatement(mappedStatement,new BoundSqlSqlSource(newBoundSql));  
      invocation.getArgs()[0]= newMs;  
    }
    return invocation.proceed();
    
  }
  
  /**
   * 根据给定的xpath查询Page对象
   */
  private Page searchPageWithXpath(Object o,String... xpaths) {
    JXPathContext context = JXPathContext.newContext(o);
    Object result;
    for(String xpath : xpaths){
      try {
        result = context.selectSingleNode(xpath);
      } catch (JXPathNotFoundException e) {
        continue;
      }
      if ( result instanceof Page ){
        return (Page)result;
      }
    }
    return null;
  }

  /**
   * 复制MappedStatement对象
   */
  private MappedStatement copyFromMappedStatement(MappedStatement ms,SqlSource newSqlSource) {
    Builder builder = new Builder(ms.getConfiguration(),ms.getId(),newSqlSource,ms.getSqlCommandType());
    
    builder.resource(ms.getResource());
    builder.fetchSize(ms.getFetchSize());
    builder.statementType(ms.getStatementType());
    builder.keyGenerator(ms.getKeyGenerator());
    /* 下面这句ms.getKeyProperty()报错，原因是新包修改了MappedStatement类中keyProperty的数据类型， 
    `* 将String改为String[]，相应的get方法由getKeyProperty()改为getKeyProperties() 
     * 因此，这里我是如下修改的，原因是在分页查询时，我跟踪此处的keyProperties为null，而其他查询并未使用此处 
     *  */ 
    String[] s = ms.getKeyProperties(); 
    if(s == null){ 
       builder.keyProperty(null); 
    }else{ 
       builder.keyProperty(s[0]); 
    }     
    //builder.keyProperty(ms.getKeyProperty());
    builder.timeout(ms.getTimeout());
    builder.parameterMap(ms.getParameterMap());
    builder.resultMaps(ms.getResultMaps());
    builder.resultSetType(ms.getResultSetType());
    builder.cache(ms.getCache());
    builder.flushCacheRequired(ms.isFlushCacheRequired());
    builder.useCache(ms.isUseCache());
    
    return builder.build();
  }

  /**
   * 复制BoundSql对象
   */
  private BoundSql copyFromBoundSql(MappedStatement ms, BoundSql boundSql, String sql) {
    BoundSql newBoundSql = new BoundSql(ms.getConfiguration(),sql, boundSql.getParameterMappings(), boundSql.getParameterObject());
    for (ParameterMapping mapping : boundSql.getParameterMappings()) {
        String prop = mapping.getProperty();
        if (boundSql.hasAdditionalParameter(prop)) {
            newBoundSql.setAdditionalParameter(prop, boundSql.getAdditionalParameter(prop));
        }
    }
    return newBoundSql;
  }

  /**
   * 根据原Sql语句获取对应的查询总记录数的Sql语句
   */
  private String getCountSql(String sql) {
    return "SELECT COUNT(*) FROM (" + sql + ") aliasForPage";
  }

  public class BoundSqlSqlSource implements SqlSource {  
      BoundSql boundSql;  
      public BoundSqlSqlSource(BoundSql boundSql) {  
        this.boundSql = boundSql;  
      }  
      public BoundSql getBoundSql(Object parameterObject) {  
        return boundSql;  
      }  
    }  
  public Object plugin(Object arg0) {
     return Plugin.wrap(arg0, this);
  }
  public void setProperties(Properties arg0) {
  }
}
