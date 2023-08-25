package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Usere;
import com.example.demo.repo.UserRepositroy;

@SpringBootApplication
public class NewCurdeProjectApplication {

	public static void main(String[] args) {
	ApplicationContext contex	= SpringApplication.run(NewCurdeProjectApplication.class, args);
//	
//	UserRepositroy userRepositroy = contex.getBean(UserRepositroy.class);
//	
//	 Usere user=new Usere();
//	 
//	 user.setName("Manik Patra");
//	 user.setRole(1);
//	 user.setEmail("patramanik409@gmail.com");
//	 user.setPassword("manik@12345");
//	 
//	 user.setName("kaushik paul");
//	 user.setRole(2);
//	 user.setEmail("kaushik@gmail.com");
//	 user.setPassword("kaushik@12345");
//	 Usere user1=userRepositroy.save(user);
//	 System.out.print(user1);
	}

}
