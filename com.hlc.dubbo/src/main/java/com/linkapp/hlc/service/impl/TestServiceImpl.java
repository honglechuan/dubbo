/**
 * 
 */
package com.linkapp.hlc.service.impl;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName:     TestServiceImpl 
 * @Description:   TODO
 * @author:        HongLC 
 * @date:          2017年12月28日 下午4:56:15 
 *  
 */
public class TestServiceImpl {
	public String sayHello(String name) {
		
		return "hello world "+name;
	}

	
	@SuppressWarnings("unchecked")
	public List getUsers() {
		List users=new ArrayList();
		
		users.add(0,"jack");
		users.add(1, "tom");
		users.add(2, "rose");
		return users;
	}
}
