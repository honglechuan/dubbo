/**
 * 
 */
package com.hlc.dubbo.consumer.test;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linkapp.hlc.service.TestService;

/** 
 * @ClassName:     Consumer 
 * @Description:   TODO
 * @author:        HongLC 
 * @date:          2018年1月2日 上午10:21:24 
 *  
 */
public class Consumer {

	

	private static ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext( new String[] {"applicationContext.xml"});
			
	public static void main(String[] args) throws IOException {
		testSer();				
	}
	
	public static void testSer(){
		cpx.start();
		
		TestService ts=(TestService)cpx.getBean("testService");
		
		String str=ts.sayHello("hlc");
		
		System.out.println(str);
		
		List users=ts.getUsers();
		
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
	}	
	
}
