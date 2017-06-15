package com.baobaotao.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateCarReflect {
	
	public static void main(String[] args) throws Throwable {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?> clazz = loader.loadClass("com.baobaotao.reflect.PrivateCar");
		PrivateCar pcar = (PrivateCar)clazz.newInstance();
		
		Field colorFld = clazz.getDeclaredField("color");
		//ȡ�����ʼ��
		colorFld.setAccessible(true);
		colorFld.set(pcar, "��ɫ");
		Method driveMtd = clazz.getDeclaredMethod("drive", (Class[])null);
		//ȡ�����ʼ��
		driveMtd.setAccessible(true);
		driveMtd.invoke(pcar, (Object[])null);
		
	}

}
