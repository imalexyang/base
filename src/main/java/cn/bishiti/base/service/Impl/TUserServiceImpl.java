package cn.bishiti.base.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bishiti.base.commons.page.Page;
import cn.bishiti.base.dao.TUserMapper;
import cn.bishiti.base.model.TUser;
import cn.bishiti.base.service.TUserService;

@Service
public class TUserServiceImpl implements TUserService{

	@Autowired
	private TUserMapper tUserMapper;
	
	public List<TUser> selectPageByParam(Map<String,Object> map,Page page){
		return tUserMapper.selectByParam(map);
	}
	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tUserMapper.deleteByPrimaryKey(id);
	}

	public int insert(TUser record) {
		// TODO Auto-generated method stub
		return tUserMapper.insert(record);
	}

	public int insertSelective(TUser record) {
		// TODO Auto-generated method stub
		return tUserMapper.insertSelective(record);
	}

	public TUser selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tUserMapper.selectByPrimaryKey(id);
	}

	public List<TUser> selectByParam(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return tUserMapper.selectByParam(map);
	}
	
	public int updateByPrimaryKeySelective(TUser record) {
		// TODO Auto-generated method stub
		return tUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TUser record) {
		// TODO Auto-generated method stub
		return tUserMapper.updateByPrimaryKey(record);
	}

}
