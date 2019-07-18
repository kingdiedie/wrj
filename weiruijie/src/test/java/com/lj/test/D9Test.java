package com.lj.test;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.wrj.bean.AssertUtils;

public class D9Test {
	@Test
	public void fun1() throws IOException{
		InputStream in = new FileInputStream(new File("src/1.txt"));
		InputStream in2 = new FileInputStream(new File("src/1.txt"));
		InputStream in3 = new FileInputStream(new File("src/1.txt"));
		InputStream in4 = new FileInputStream(new File("src/1.txt"));
		AssertUtils.closeAll(in,in2,in3,in4);
	}
	@Test
	public void fun2() throws Exception{
		InputStream inp = new FileInputStream(new File("src/1.txt"));
		FileOutputStream out = new FileOutputStream(new File("src/2.txt"));
		AssertUtils.copy(inp, out, true, true);
	}
	@Test
	public void fun3() throws IOException{
		FileInputStream src = new FileInputStream(new File("src/1.txt"));
		String readTestFile = AssertUtils.readTestFile(src);
		System.out.println(readTestFile);
	}
	@Test
	public void fun4() throws Exception{
		File file = new File("src/1.txt");
		
		String readTestFile = AssertUtils.readTestFile(file);
		System.out.println(readTestFile);
	}
	@Test
	public void fun5() throws Exception{
		
		
		 AssertUtils.readStringFromSystemIn("请输入姓名");
		
	}
	
	@Test
	public void fun6() throws Exception{		
		
		 AssertUtils.readIntegetFromSystemIn("年龄");
	}
}
