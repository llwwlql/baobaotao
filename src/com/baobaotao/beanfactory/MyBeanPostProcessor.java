package com.baobaotao.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.baobaotao.Car;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if (beanName.equals("car")) {
			Car car = (Car) bean;
			if (car.getColor() == null) {
				System.out
						.println("调用MyBeanPostProcessor.postProcessBeforeInitialization(),color为空，设置为默认颜色");
				car.setColor("黑色");
			}
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if (beanName.equals("car")) {
			Car car = (Car) bean;
			if (car.getMaxSpeed() >= 200) {
				System.out
						.println("调用MyBeanPostProcessor.postProcessBeforeInitialization(),将maxSpeed调整为200");
				car.setMaxSpeed(200);
			}
		}
		return bean;
	}

}
