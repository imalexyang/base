package cn.bishiti.base.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.bishiti.base.model.TUser;
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
	private TUserService tUserService;
	
	@RequestMapping("/list")
	public String listPage(){		
		return "/user/list";
	}
	
	@RequestMapping("/userList")
	@ResponseBody
	public Object list(){
		Map<String,Object> map=new HashMap<String,Object>();
		List<TUser> tusers=tUserService.selectByParam(map);
		return tusers;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(TUser user){
		tUserService.insert(user);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "新建成功");
		return map;
	}
	
	@RequestMapping("/update")
	public String update(Model model,Integer id){
		TUser tUser=tUserService.selectByPrimaryKey(id);
		LOGGER.info(JSON.toJSON(tUser));
		model.addAttribute("user", tUser);
		return "/user/update";
	}
}
