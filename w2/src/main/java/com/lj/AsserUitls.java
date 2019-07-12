package com.lj;

import java.util.Collection;
import java.util.Map;

public class AsserUitls {
	/**
	 * 断言为真
	 * @param b 代表true或者false
	 * @param message 错误信息
	 */
	public static void isTrue(boolean b,String message){
		if(!Boolean.TRUE.equals(b)){
			throw new WRuntimeException(message);
		}
	}
	/**
	 * 断言为假
	 * @param exp 代表true或者false
	 * @param message 错误信息
	 */
	public static void isFalse(boolean exp,String message){
		if(Boolean.TRUE.equals(exp)){
			throw new WRuntimeException(message);
		}
	}
	/**
	 * 断言不为空
	 * @param exp 代表字符处对象
	 * @param message 错误信息
	 */
	public static void isNotNull(String exp,String message){
		if(exp == null || exp.length()==0){
			throw new WRuntimeException(message);
		}
	}
	
	public static void isNotNull2(Object exp,String message){
		if(exp == null){
			throw new WRuntimeException(message);
		}
	}
	
	/**
	 * 4.断言必须为空
	 * @param exp 代表字符处对象
	 * @param message 错误信息
	 */
	public static void isNull(String exp,String message){
		if(exp.length()>0){
			throw new WRuntimeException(message);
		}
	}
	
	public static void isNull2(Object exp,String message){
		if(exp!=null){
			throw new WRuntimeException(message);
		}
	}
	
	/**
	 * 断言集合不为空
	 * @param 集合对象
	 * @param message 错误信息
	 */
	public static void collectionNotNull(Collection<?> col,String message){
		if(col == null || col.size()==0){
			throw new WRuntimeException(message);
		}
	}
	
	/**
	 * 6断言map集合不为空
	 * @param 集合对象
	 * @param message 错误信息
	 */
	public static void mapNotNull(Map<?, ?> map,String message){
		if(map == null || map.size()==0){
			throw new WRuntimeException(message);
		}
	}
	
	/**
	 * 字符串必须有值,去掉空格后
	 * 7@param src
	 * @param message
	 */
	public static void hhs(String src,String message){
		if(!(src.trim().length()>0)){
			throw new WRuntimeException(message);
		}
	}
	
	/**
	 * 必须是整数大于0
	 * 8@param src
	 * @param message
	 */
	public static void Num(int num,String message){
		if(num<=0){
			throw new WRuntimeException(message);
		}
	}
}
