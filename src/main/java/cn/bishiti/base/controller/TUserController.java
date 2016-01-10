package cn.bishiti.base.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.bishiti.base.commons.page.Page;
import cn.bishiti.base.model.TUser;
import cn.bishiti.base.service.RedisService;
import cn.bishiti.base.service.TUserService;
/**
 * 
* @ClassName: TUserController 
* @Description: 用户管理 
* @author yangyw(yawen.yang@4wtrip.com)
* @date 2015年7月26日 下午9:24:07 
*
 */
@Controller
@RequestMapping("/user")
public class TUserController {
	
	private static final Logger LOGGER = Logger.getLogger(TUserController.class);
	 
	@Autowired
	private RedisService redisService;
	
	@Autowired
	private TUserService tUserService;
	
	@RequestMapping("/list")
	public String listPage(){		
		return "/user/list";
	}
	
	@RequestMapping("/userList")
	@ResponseBody
	public Object list(@RequestParam(required = false, defaultValue = "1") Integer page,  
			  @RequestParam(required = false, defaultValue = "10") Integer rows){
		Page pages = Page.newBuilder(page, rows, "users");
		pages.getParams().put("name", null); 
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("page", pages);
		List<TUser> tusers=tUserService.selectPageByParam(map,pages);
		map.put("total", pages.getTotalRecord());
		map.put("rows", tusers);
		//map.remove("page");
		return map;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(TUser user){
		tUserService.insert(user);
		LOGGER.info(JSON.toJSON("添加用户："+user));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "新建成功");
		return map;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Object update(Model model,TUser user){
		tUserService.updateByPrimaryKeySelective(user);
		LOGGER.info(JSON.toJSON("更新用户："+user));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "修改成功");
		return map;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public Object del(Model model,Integer id){
		tUserService.deleteByPrimaryKey(id);
		LOGGER.info(JSON.toJSON("删除用户:"+id));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "删除成功");
		return map;
	}
	
	@RequestMapping("/redis")
	@ResponseBody
	public Object redis(String key,String val){
		Map<String,Object> map=new HashMap<String,Object>();
		redisService.set(key, val);
		map.put("status", "设置redis成功");
		map.put(key, redisService.get(key));
		return map;
	}
}
