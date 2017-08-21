package com.njit.demo.dao;

import com.njit.demo.model.User;

public interface UserDao {
	public void save(User u);

	public boolean checkUserExistsWithName(String username);

}
