package com.mybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.conf.Users;
import com.mybatis.service.UserService;
import com.mybatis.service.impl.UserServiceImpl;

public class UserServiceTest {

	@Test
	public void countAll(){
		
		try {
			ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
	        UserService users = (UserService)context1.getBean("userService");
	        
	        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
	        UserService users2 = (UserService)context1.getBean("userService");
	        
	        System.out.println( users.hashCode()  + ":" + users2.hashCode() );
	        
	        System.out.println( users.toString()  + ":" + users2.toString() );
	        
	        
//	        UserServiceImpl ui1 = new UserServiceImpl();
//	        
//	        UserServiceImpl ui2 = new UserServiceImpl();
//	        
//	        System.out.println( ui1.hashCode()  + ":" + ui2.hashCode() );
//	        
//	        System.out.println( ui1.toString()  + ":" + ui2.toString() );
	        
//	        int result = users.countAll() ;
//	        System.out.println("spring test result: " + String.valueOf(result));
//	        
//	        Users user = users.findByUserName("µ‘¡…¿´") ;
//	        System.out.println("spring test password: " + user.getPassword());
	        
	        
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
