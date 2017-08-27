package com.njit.demo.service;

import java.util.List;

import com.njit.demo.entity.User;

public interface UserService {

	public void insertUser(User user);

	public List<User> selectUser(User user);

	public boolean existUser(String username);

}
