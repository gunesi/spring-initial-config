package com.igunes.java.demo.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.igunes.java.demo.spring.bean.TestBean;

public class MainApp {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		TestBean testBean = context.getBean("testBean", TestBean.class);
		
		System.out.println("Absolute path of created TestBean instance: " + testBean.getClass().getName());
	}

}
