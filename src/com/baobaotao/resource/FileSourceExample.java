package com.baobaotao.resource;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
/**
 * P54 代码3-14
 * @ClassName:      FileSourceExample
 * @Description:    
 * @author:         逯其鲁
 * @date:           2017-6-12        上午11:49:40
 */
public class FileSourceExample {
	public static void main(String[] args) throws IOException {
		String filePath="E:/code/java/baobaotao/WebRoot/WEB-INF/classes/conf/file1.txt";
		Resource res1 = new FileSystemResource(filePath);
		Resource res2 = new ClassPathResource("conf/file1.txt");
		InputStream ins1 = res1.getInputStream();
		InputStream ins2 = res2.getInputStream();
		System.out.println("res1:" + res1.getFilename());
		System.out.println("res2:" + res2.getFilename());
	}
}
