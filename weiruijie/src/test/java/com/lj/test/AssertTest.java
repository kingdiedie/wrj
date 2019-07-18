package com.lj.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.wrj.bean.AssertUtils;
import com.wrj.bean.WeiEx;



public class AssertTest{
	@Test
	public void isTrue(){
		try {
			AssertUtils.isTrue(false, "必须为真");
		} catch (WeiEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void isTrue2() throws WeiEx{
		AssertUtils.isTrue(true, "必须为真");
	}
	@Test
	public void isFalse() throws WeiEx{
		AssertUtils.isFalse(true, "必须为假的");
	}
	@Test
	public void isFalse2() throws WeiEx{
		AssertUtils.isFalse(false, "必须为假的");
	}
	@Test
	public void isobjnull() throws WeiEx{
		String aa = "地方";
		AssertUtils.isNull(aa, "不能为空");
	}
	@Test
	public void isobjnull2() throws WeiEx{
	
		AssertUtils.isNull(null, "不能为空");
	}
	@Test
	public void notobjnull() throws WeiEx{
		String aa = "地方";
		AssertUtils.notNull(aa, "不能为空");
	}
	@Test
	public void notobjnull2() throws WeiEx{
	
		AssertUtils.notNull(null, "不能为空");
	}
	@Test
	public void jh() throws WeiEx{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		AssertUtils.notEmpty(arrayList, "不能为空");
	}
	@Test
	public void jh2() throws WeiEx{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(22);
		AssertUtils.notEmpty(arrayList, "不能为空");
	}
	@Test
	public void map() throws WeiEx{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		AssertUtils.notEmpty(map, "不能为空");
	}
	@Test
	public void map2() throws WeiEx{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		AssertUtils.notEmpty(map, "不能为空");
	}
	@Test
	public void zf() throws WeiEx{
		
		AssertUtils.hasTest("发放给发个", "不能为空");
	}
	@Test
	public void zf2() throws WeiEx{
		
		AssertUtils.hasTest(" ", "不能为空");
	}
	@Test
	public void num() throws WeiEx{
		
		AssertUtils.sumZhi(25, "必须大于0");
	}
	
	@Test
	public void num2() throws WeiEx{
		
		AssertUtils.sumZhi(-2, "必须大于0");
	}
}
