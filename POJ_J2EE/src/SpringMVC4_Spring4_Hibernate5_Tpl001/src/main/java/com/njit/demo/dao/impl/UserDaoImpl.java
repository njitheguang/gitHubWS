package com.njit.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.njit.demo.dao.UserDao;
import com.njit.demo.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate; 
	public void save(User u) {
		hibernateTemplate.save(u);
		
	}

	public boolean checkUserExistsWithName(String username) {
		List<?> users = hibernateTemplate.find("from User u where u.username = '" + username + "'");
		
		if(users != null && users.size() > 0) {
			return true;
		}
		return false;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
