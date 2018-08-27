package com.xiu.designmodel.create.singleton;

/**
 * 饿汉
 * @author xwn
 *
 */
public class SingletonHun {

	private SingletonHun(){}
	//饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
	private static SingletonHun instance = new SingletonHun();

	public static SingletonHun getInstance() {
		return instance;
	}

}
