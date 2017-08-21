package com.njit.demo.mapper;

import java.util.List;

import com.njit.demo.entity.User;

public interface UserMapper {

	public List<User> selectUser(User user);

	public void insertUser(User user);

	public List<User> selectUserByUserName(String username);

}
