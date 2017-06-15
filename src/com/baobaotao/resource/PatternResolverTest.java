package com.baobaotao.resource;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class PatternResolverTest {
	
	public static void main(String[] args) throws IOException {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		//加载所有类包com.baobaotao(及子孙包)下的以xml为后缀的资源
		Resource resources[] = resolver.getResources("classpath*:com/baobaotao/**/*.xml");
		for (Resource resource : resources) {
			System.out.println(resource.getDescription());
		}
	}

}
