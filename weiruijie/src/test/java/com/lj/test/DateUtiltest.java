package com.lj.test;

import java.text.ParseException;


import org.junit.Test;

import com.wrj.bean.DateUtil;

public class DateUtiltest {
	@Test
	public void fun1() throws ParseException{		
		int age = DateUtil.getAge(DateUtil.parse("1998-05-05"));		
		System.out.println(age);
	}
	
	@Test
	public void fun2() throws ParseException{		
		int age = DateUtil.getAge(DateUtil.parse("1998-05-05"));		
		System.out.println(age);
	}
	
	
}
