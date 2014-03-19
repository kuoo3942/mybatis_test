package com.mybatis.service;

import java.util.List;

import com.mybatis.conf.Users;

public interface UserService {
	
	public int countAll();
	
	public List<Users> selectAll();
	
	public int insert(Users user);
	
	public int update(Users user);
	
	public int delete(String userName);
	
	public Users findByUserName(String userName);

}
