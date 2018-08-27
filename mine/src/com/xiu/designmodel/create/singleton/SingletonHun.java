package com.xiu.designmodel.create.singleton;

/**
 * ����
 * @author xwn
 *
 */
public class SingletonHun {

	private SingletonHun(){}
	//����ʽ���ഴ����ͬʱ���Ѿ�������һ����̬�Ķ���ϵͳʹ�ã��Ժ��ٸı䣬�����������̰߳�ȫ�ġ�
	private static SingletonHun instance = new SingletonHun();

	public static SingletonHun getInstance() {
		return instance;
	}

}
