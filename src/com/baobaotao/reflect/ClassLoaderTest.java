package com.baobaotao.reflect;

public class ClassLoaderTest {
	
	public static void main(String[] args) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		System.out.println("current loader:" + loader);
		System.out.println("parent loader:" + loader.getParent());
		//根装载器在java中访问不到
		System.out.println("grandparent loader:" + loader.getParent().getParent());
	}
}
