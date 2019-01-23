package com;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.entity.Customer;
import com.jpa.service.CustomerService;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource  = (DataSource)ctx.getBean("dataSource");
		System.out.println(dataSource);
		
		Customer entity = new Customer("大姐H", 80);
		CustomerService service = (CustomerService)ctx.getBean("customerImpl");
		service.save(entity);
	}
}
