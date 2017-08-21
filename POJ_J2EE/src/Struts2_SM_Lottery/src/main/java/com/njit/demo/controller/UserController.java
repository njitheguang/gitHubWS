package com.njit.demo.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.njit.demo.model.User;
import com.njit.demo.service.UserService;
import com.njit.demo.vo.UserRegisterInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller("user")
@Scope("prototype")
public class UserController extends ActionSupport implements ModelDriven {
	
	private UserRegisterInfo info = new UserRegisterInfo();
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	
	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		User u = new User();
		u.setUsername(info.getUsername());
		u.setPassword(info.getPassword());
		if(userService.existUser(u.getUsername())) {
			return "fail";
		}
		userService.saveUser(u);
		return "success";
	}
	
	
	public String register() throws Exception {
		User u = new User();
		u.setUsername(info.getUsername());
		u.setPassword(info.getPassword());
		ActionContext actionContext = ActionContext.getContext();
		actionContext.put("message", "×¢²á");
		if(userService.existUser(u.getUsername())) {
			return "fail";
		} else {
			userService.saveUser(u);
			return "success";
		}
	}

	public String login() throws Exception {
		User u = new User();
		u.setUsername(info.getUsername());
		u.setPassword(info.getPassword());
		ActionContext actionContext = ActionContext.getContext();
		actionContext.put("message", "µÇÂ¼");
		if(userService.existUser(u.getUsername())) {
			return "success";
		} else {
			return "fail";
		}
	}
	public UserRegisterInfo getInfo() {
		return info;
	}

	public void setInfo(UserRegisterInfo info) {
		this.info = info;
	}
	
	//@Override
	public Object getModel() {
		return info;
	}
}
