package com.njit.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.njit.demo.model.User;
import com.njit.demo.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/login.do")
	public ModelAndView login(String username, String password, HttpServletRequest request) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		boolean existsFlg = userService.exists(user);
		request.setAttribute("message", "µÇÂ¼");
		if (existsFlg) {
			return new ModelAndView("success");
		} else
			return new ModelAndView("fail");
	}

	@RequestMapping("/register.do")
	public ModelAndView register(String username, String password, HttpServletRequest request) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		boolean flag = true;
		flag = userService.exists(user);
		request.setAttribute("message", "×¢²á");
		if (!flag) {
			userService.add(user);
			return new ModelAndView("success");
		} else {
			return new ModelAndView("fail");
		}
	}
}
