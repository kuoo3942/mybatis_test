package com.mybatis;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.conf.Users;
import com.mybatis.dao.UserDao;


public class UserDaoTest {
	
	
	public SqlSession getSession() throws Exception{
		String resource = "myBatis-configuration.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        return factory.openSession();
	}
	
	@Test
	public void countAll(){
		SqlSession session = null ;
		try{
			session = getSession() ;
			UserDao userDao = session.getMapper(UserDao.class) ;
			int count = userDao.countAll() ;
			System.out.println("all count : [" + String.valueOf(count) + "]");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if( session != null ){
				session.close(); 
			}
		}
	}
	
	@Test
	public void selectAll(){
		SqlSession session = null ;
		try{
			session = getSession() ;
			UserDao userDao = session.getMapper(UserDao.class) ;
			List<Users> users = userDao.selectAll() ;
			for( Users user : users ){
				System.out.println("username : [" + user.getUsername() + "]");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if( session != null ){
				session.close(); 
			}
		}
	}
	
	@Test
	public void insert(){
		SqlSession session = null ;
		try{
			session = getSession() ;
			UserDao userDao = session.getMapper(UserDao.class) ;
			
			Users user = new Users() ;
			user.setUsername("����+");
			user.setPassword("11111");
			int result = userDao.insert(user) ;
			System.out.println("result : [" + String.valueOf(result) + "]");
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if( session != null ){
				session.close(); 
			}
		}
	}
	
	@Test
	public void update(){
		SqlSession session = null ;
		try{
			session = getSession() ;
			UserDao userDao = session.getMapper(UserDao.class) ;
			
			Users user = new Users() ;
			user.setUsername("����+");
			user.setPassword("22222");
			int result = userDao.update(user) ;
			System.out.println("result : [" + String.valueOf(result) + "]");
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if( session != null ){
				session.close(); 
			}
		}
	}
	
	@Test
	public void delete(){
		SqlSession session = null ;
		try{
			session = getSession() ;
			UserDao userDao = session.getMapper(UserDao.class) ;
			int result = userDao.delete("����+") ;
			System.out.println("result : [" + String.valueOf(result) + "]");
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if( session != null ){
				session.close(); 
			}
		}
	}
	
	@Test
	public void findByUserName(){
		
		SqlSession session = null ;
		try{
			session = getSession() ;
			UserDao userDao = session.getMapper(UserDao.class) ;
			Users user = userDao.findByUserName("����+") ;
			System.out.println("result : [" + String.valueOf(user.getPassword()) + "]");
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if( session != null ){
				session.close(); 
			}
		}
	}

}
