package com.pratap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratap.service.AccountService;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		AccountService as = context.getBean("accservice", AccountService.class);
		
		System.out.println(as.getClass().getName());
		
		as.deposit(1234, 50000);
		System.out.println("===============");
		
		as.withdraw(1234, 10000);
		System.out.println("===============");
				
		as.transfer(1234, 2345, 10000);
		
	}

}
