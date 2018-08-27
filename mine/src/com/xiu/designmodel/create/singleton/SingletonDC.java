package com.xiu.designmodel.create.singleton;

/**
 * double check
 * @author xwn
 *
 */
public class SingletonDC {

	private SingletonDC(){}
	//volatile 防止指令重排，
	//指令重排导致引用不为空，但是其实初始化尚未完成，直接使用则错误
	private volatile static SingletonDC instance = null;
	
	public static SingletonDC getInstance() throws InterruptedException {
		if(instance == null ) {
			synchronized (SingletonDC.class) {
				if(instance == null ){
					instance = new SingletonDC();
				}
			}
		}
		return instance;
	}
	
}
