package com.baobaotao.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.baobaotao.Car;

public class BeanLifeCycle {

	private static void LifeCycleInBeanFactory() {

		Resource res = new ClassPathResource("com/baobaotao/beanfactory/beans.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		((ConfigurableBeanFactory) bf)
				.addBeanPostProcessor(new MyBeanPostProcessor());
		((ConfigurableBeanFactory) bf)
				.addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
		Car car1 = (Car) bf.getBean("car");
		car1.introduce();
		car1.setColor("红色");

		Car car2 = (Car) bf.getBean("car");
		car1.introduce();

		System.out.println("car1==car2:" + (car1 == car2));
		((XmlBeanFactory) bf).destroySingletons();
	}

	public static void main(String[] args) {
		LifeCycleInBeanFactory();
	}
}
