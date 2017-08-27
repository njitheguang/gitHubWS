package com.njit.demo.service;

import com.njit.demo.model.User;

public interface UserService {

	public abstract boolean exists(User u) throws Exception;

	public abstract void add(User u) throws Exception;

}