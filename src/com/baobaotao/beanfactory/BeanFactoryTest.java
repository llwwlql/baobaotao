package com.baobaotao.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.baobaotao.Car;

public class BeanFactoryTest {
	
	public static void main(String[] args) {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		//已过时
		//Resource res = resolver.getResource("classpath:com/baobaotao/beanfactory/beans.xml");
		//BeanFactory bf = new XmlBeanFactory(res);
		BeanFactory bf = new ClassPathXmlApplicationContext("classpath:com/baobaotao/beanfactory/beans.xml");
		System.out.println("init BeanFactory");
		
		Car car = bf.getBean("car",Car.class);
		System.out.println("car bean is ready for use!");
		System.out.println(car);
	}
	
}
