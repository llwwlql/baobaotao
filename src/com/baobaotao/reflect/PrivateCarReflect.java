package com.baobaotao.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateCarReflect {
	
	public static void main(String[] args) throws Throwable {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?> clazz = loader.loadClass("com.baobaotao.reflect.PrivateCar");
		PrivateCar pcar = (PrivateCar)clazz.newInstance();
		
		Field colorFld = clazz.getDeclaredField("color");
		//取消访问检查
		colorFld.setAccessible(true);
		colorFld.set(pcar, "红色");
		Method driveMtd = clazz.getDeclaredMethod("drive", (Class[])null);
		//取消访问检查
		driveMtd.setAccessible(true);
		driveMtd.invoke(pcar, (Object[])null);
		
	}

}
