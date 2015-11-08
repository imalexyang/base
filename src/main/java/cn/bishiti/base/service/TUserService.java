package cn.bishiti.base.service;

import java.util.List;
import java.util.Map;

import cn.bishiti.base.commons.page.Page;
import cn.bishiti.base.model.TUser;

public interface TUserService {
	List<TUser> selectPageByParam(Map<String,Object> map,Page page);
	
	int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);
    
    List<TUser> selectByParam(Map<String,Object> map);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}
