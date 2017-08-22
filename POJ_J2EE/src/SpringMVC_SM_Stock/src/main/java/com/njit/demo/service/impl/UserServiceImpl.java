package com.njit.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njit.demo.entity.User;
import com.njit.demo.mapper.UserMapper;
import com.njit.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public List<User> selectUser(User user) {
		return userMapper.selectUser(user);
	}

	@Override
	public boolean existUser(String username) {
		List<User> userList = userMapper.selectUserByUserName(username);
		if (userList.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
