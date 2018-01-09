package com.sl.SpringAOPExample.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 面向切面编程，声明切面类
 * 
 * @author Administrator Jan 9, 2018
 */
@Aspect
public class CheckUser {
	/**
	 * 针对用户查找进行切入
	 */
	@Pointcut("execution(* com.sl.SpringAOPExample.service.impl.*.find*(..))")
	public void checkUser() {
		System.out.println("**************The System is Searching Information For You****************");
	}

	/**
	 * 用户添加进行切入
	 */
	@Pointcut("execution(* com.sl.SpringAOPExample.service.impl.*.add*(..))")
	public void checkAdd() {
		System.out.println("**************<< Add User >> Checking.....***************");
	}

	/**
	 * 用户查找前发生的处理逻辑
	 */
	@Before("checkUser()")
	public void beforeCheck() {
		System.out.println(">>>>>>>> 准备搜查用户..........");
	}

	/**
	 * 用户查找后发生的处理逻辑
	 */
	@After("checkUser()")
	public void afterCheck() {
		System.out.println(">>>>>>>>　搜查用户完毕..........");
	}

	/**
	 * 添加用户前发生的逻辑处理
	 */
	@Before("checkAdd()")
	public void beforeAdd() {
		System.out.println(">>>>>>>>　增加用户--检查ing..........");
	}

	/**
	 * 添加用户后发生的逻辑处理
	 */
	@After("checkAdd()")
	public void afterAdd() {
		System.out.println(">>>>>>>>　增加用户--检查完毕！未发现异常!..........");
	}

	/**
	 * 声明环绕通知
	 * 
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around("checkUser()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("进入方法---环绕通知");
		Object o = pjp.proceed();
		System.out.println("退出方法---环绕通知");
		return o;
	}
}
