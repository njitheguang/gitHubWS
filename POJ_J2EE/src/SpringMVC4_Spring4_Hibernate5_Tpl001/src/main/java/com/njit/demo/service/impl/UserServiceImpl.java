package com.njit.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.njit.demo.dao.UserDao;
import com.njit.demo.model.User;
import com.njit.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean exists(User u){
		return userDao.checkUserExistsWithName(u.getUsername());

	}

	public void add(User u) {
		userDao.save(u);
	}
}
