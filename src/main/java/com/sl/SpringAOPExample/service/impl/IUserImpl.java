package com.sl.SpringAOPExample.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.sl.SpringAOPExample.service.IUser;

/**
 * 实现用户类
 * 
 * @author Administrator Jan 9, 2018
 */
public class IUserImpl implements IUser {
	/**
	 * map(键值对，非线程安全的)
	 */
	public static Map map = null;

	/**
	 * 静态构造函数初始化人名等相关信息
	 */
	IUserImpl() {
		String[] list = { "Lucy", "Tom", "小明", "Smith", "Hello" };
		Map tmp = new HashMap();
		for (int i = 0; i < list.length; i++) {
			tmp.put(list[i], list[i] + i);
		}
		map = tmp;
	}

	/**
	 * 查找指定用户
	 */
	public String findUser(String username) {
		// TODO Auto-generated method stub
		String password = "没查到该用户";
		if (map.containsKey(username)) {
			password = map.get(username).toString();
		}
		System.out.println("-----------------【findUser】-----------------");
		System.out.println("-----------------Username:" + username + "-----------------");
		System.out.println("-----------------【Result】:" + password + "------------------");
		return password;
	}

	/**
	 * 添加用户名
	 */
	public void addUser(String username) {
		// TODO Auto-generated method stub
		map.put(username, username + "11");
		System.out.println("--------------【addUser】: " + username + " --------------");
		System.out.println("【The new List:" + map + "】");
	}

	/**
	 * 查询所有用户名
	 */
	public void findAll() {
		// TODO Auto-generated method stub
		System.out.println("---------------【findAll】: " + map + " ------------------");
	}
}
