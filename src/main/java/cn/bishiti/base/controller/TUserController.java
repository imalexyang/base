package cn.bishiti.base.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/userInfo")
	public String ShowUserInfo(Model model,Integer id){
		TUser tUser=tUserService.selectByPrimaryKey(id);
		LOGGER.info(JSON.toJSON(tUser));
		model.addAttribute("user", tUser);
		return "userInfo";
	}
}
