package com.njit.demo.service;

import java.util.List;

import com.njit.demo.model.User;

public interface UserService {

	public void saveUser(User user);

	public List<User> selectUser(User user);

	public boolean existUser(String username);

}