package com.baobaotao.beanfactory;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends
		InstantiationAwareBeanPostProcessorAdapter {
	
	public Object postProcessBeforeInstantiation(Class<?> beanClass,
			String beanName) throws BeansException {
		if ("car".equals(beanName)) {
			System.out
					.println("InstantiationAware BeanPostProcessor.postProcessBeforeInstantiation");
		}
		return null;
	}
	
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if ("car".equals(beanName)) {
			System.out
					.println("InstantiationAware BeanPostProcessor.postProcessAfterInstantiation");
		}
		return true;
	}
	public PropertyValues postProcessPropertyValues(
			PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
			throws BeansException {
		if ("car".equals(beanName)) {
			System.out
					.println("InstantiationAware BeanPostProcessor.postProcessPropertyValues");
		}
		return pvs;
	}
}
