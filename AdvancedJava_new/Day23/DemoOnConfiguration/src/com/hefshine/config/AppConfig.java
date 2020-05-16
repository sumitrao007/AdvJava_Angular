package com.hefshine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hefshine.bean.Employee;
import com.hefshine.bean.Person;

@Configuration
@ComponentScan(basePackages = {"com.hefshine.bean"})
public class AppConfig {
	
//	@Bean
//	Person getOBJPerson() {
//		return (new Person());
//	}
//	
//	@Bean
//	Employee getOBJEmployee() {
//		return (new Employee());
//	}

}
