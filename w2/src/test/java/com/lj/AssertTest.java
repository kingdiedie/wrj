package com.lj;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class AssertTest {
	@Test
	public void fun1Test(){
		 try {
			AsserUitls.isTrue(true, "这不是真的");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void fun2Test(){
		 try {
			AsserUitls.isFalse(true, "这不是假的的");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test(){
		 try {
			AsserUitls.isNotNull("等等", "是空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun4Test(){
		 try {
			AsserUitls.isNull("等等", "不为空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun5Test(){
		 try {
			 ArrayList<Integer> arrayList = new ArrayList<Integer>();
			AsserUitls.collectionNotNull(arrayList, "集合为空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void fun6Test(){
		 try {
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			AsserUitls.mapNotNull(hashMap, "集合为空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void fun7Test(){
		 try {
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			AsserUitls.hhs("    22", "字符串为空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun8Test(){
		 try {
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			AsserUitls.Num(-1, "必须是整数");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
}
