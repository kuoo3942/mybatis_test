package com.mybatis.dao;

import java.util.List;

import com.mybatis.conf.Users;

public interface UserDao {
	
	public int countAll();
	
	public List<Users> selectAll();
	
	public int insert(Users user);
	
	public int update(Users user);
	
	public int delete(String userName);
	
	public Users findByUserName(String userName);
	
}
