package com.baobaotao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.baobaotao.Car;

public class ReflectTest {
	
	public static Car initByDefaultConst() throws Throwable{
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?> clazz = loader.loadClass("com.baobaotao.reflect.Car");
		Constructor<?> cons = clazz.getDeclaredConstructor();	
		//ʵ�����
		Car car = (Car) cons.newInstance();
		
		Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "����CA72");
		Method setColor = clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "��ɫ"); 
		Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 200);
		return car;
	}
	public static void main(String[] args) throws Throwable {
		Car car = initByDefaultConst();
		System.out.println(car);
	}
}