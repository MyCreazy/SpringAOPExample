package com.sl.SpringAOPExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sl.SpringAOPExample.service.IUser;

/**
 * aop测试
 * 
 * @author Administrator Jan 9, 2018
 */
public class AopTest {
	/**
	 * main函数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUser user = (IUser) factory.getBean("user");
		user.addUser("xukong");
		user.findAll();
	}
}
