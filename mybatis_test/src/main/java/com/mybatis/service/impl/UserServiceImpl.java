package com.mybatis.service.impl;

import java.util.List;

import com.mybatis.conf.Users;
import com.mybatis.dao.UserDao;
import com.mybatis.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao ;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public int countAll() {
		return userDao.countAll() ;
	}
	public List<Users> selectAll() {
		return userDao.selectAll();
	}
	public int insert(Users user) {
		return userDao.insert(user);
	}
	public int update(Users user) {
		return userDao.update(user);
	}
	public int delete(String userName) {
		return userDao.delete(userName);
	}
	public Users findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

}
