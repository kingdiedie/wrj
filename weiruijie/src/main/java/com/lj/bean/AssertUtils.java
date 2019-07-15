package com.lj.bean;

import java.util.Collection;
import java.util.Map;

/**
 * @author 魏
 * 断言类
 */
public class AssertUtils {
	/**
	 * 1.断言为真，如果为假，则抛出自定义异常
	 * @param b参数
	 * @param message
	 * @throws WeiEx 
	 */
	public static void isTrue(boolean b,String message) throws WeiEx{
		if(b!=true){
			throw new WeiEx(message);
		}
	}
	
	/**
	 * 2.断言为假，如果为真，则抛出自定义异常
	 * @param b参数
	 * @param message
	 * @throws WeiEx 
	 */
	public static void isFalse(boolean b,String message) throws WeiEx{
		if(b!=false){
			throw new WeiEx(message);
		}
	}
	
	/**
	 * 3.断言对象不为空，如果为空，则抛出自定义异常，
	 * @param b参数
	 * @param message
	 * @throws WeiEx 
	 */
	public static void notNull(Object b,String message) throws WeiEx{
		if(b==null){
			throw new WeiEx(message);
		}
	}
	/**
	 * 4.断言对象必须为空，如果不为空，则抛出自定义异常，
	 * @param b参数
	 * @param message
	 * @throws WeiEx 
	 */
	public static void isNull(Object b,String message) throws WeiEx{
		if(b!=null){
			throw new WeiEx(message);
		}
	}
	
	/**
	 * 5.断言集合不为空，对象不能空，以及必须包含1个元素。
	 * @param b参数
	 * @param message
	 * @throws WeiEx 
	 */
	public static void notEmpty(Collection<?> b,String message) throws WeiEx{
		if(b==null || b.size()<1){
			throw new WeiEx(message);
		}
	}
	
	/**
	 * 6.断言Map集合不为空，对象不能空，以及必须包含1个元素。
	 * @param map参数
	 * @param message
	 * @throws WeiEx 
	 */
	public static void notEmpty(Map<?,?>  map,String message) throws WeiEx{
		if(map==null || map.size()<1){
			throw new WeiEx(message);
		}
	}
	
	/**
	 * 7.断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，
	 * @param map参数
	 * @param message
	 * @throws WeiEx 
	 */
	public static void hasTest(String str,String message) throws WeiEx{
		if(str.length()<0 || str==" " || str==null){
			throw new WeiEx(message);
		}
	}
	/**
	 * 8.断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，
	 * @param map参数
	 * @param message
	 * @throws WeiEx 
	 */
	public static void sumZhi(int num,String message) throws WeiEx{
		if(num<=0){
			throw new WeiEx(message);
		}
	}
}
