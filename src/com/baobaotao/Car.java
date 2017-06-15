package com.baobaotao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{
	private String brand;
	private String color;
	private int maxSpeed;
	
	private BeanFactory beanFactory;
	private String beanName;
	
	public Car() {
		System.out.println("调用Car()构造函数。");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("调用setBrand()设置属性。");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void introduce(){
		System.out.println("brand:" + brand +";color:" + color +";maxSpeed:" + maxSpeed);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("调用DisposableBean.destory()。");		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用InitializingBean.afterPropertiesSet()。");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("调用BeanFactoryAware.setBeanFactory()。");
		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("调用BeanNameAware.setBeanName()。");
		this.beanName = name;
	}
	
	public void myInit(){
		System.out.println("调用init-method所指定的myInit()，将maxSpeed设置为240。");
	}
	
	public void myDestory(){
		System.out.println("调用destory-method所指定的myDestory()。");
	}
}
