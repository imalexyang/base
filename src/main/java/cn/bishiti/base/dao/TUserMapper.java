package cn.bishiti.base.dao;

import java.util.List;
import java.util.Map;

import cn.bishiti.base.model.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);
    
    List<TUser> selectByParam(Map<String,Object> map);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}