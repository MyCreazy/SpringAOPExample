package com.sl.SpringAOPExample.service;

/**
 * 用户接口类
 * 
 * @author Administrator Jan 9, 2018
 */
public interface IUser {
	/**
	 * 查询用户
	 * 
	 * @param username
	 *            用户名称
	 * @return 返回查询结果
	 */
	public String findUser(String username);

	/**
	 * 添加用户
	 * 
	 * @param username
	 *            添加的用户名
	 */
	public void addUser(String username);

	/**
	 * 查询所有
	 */
	public void findAll();
}
