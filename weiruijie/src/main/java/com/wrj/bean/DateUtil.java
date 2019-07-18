package com.wrj.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 魏
 *
 */
public class DateUtil {
	
	
	/**
	 * 字符串类型转换成日期类型
	 * @param src
	 * @return
	 * @throws ParseException
	 */
	public static Date parse(String src) throws ParseException{
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		return sim.parse(src);
		
	} 	
	
	/**
	 * 根据传入的日期获取年龄
	 * @param src
	 * @return
	 */
	public static int getAge(Date birthDay){
		// 使用默认时区和语言环境获得一个日历。
		Calendar cal = Calendar.getInstance();
		if(cal.before(birthDay)){//出生日期晚于当前时间无法计算
			//抛出的异常表明向方法传递了一个不合法或不正确的参数。 
			throw new IllegalArgumentException("出生日期晚于当前时间无法计算");
		}
		int yearNow = cal.get(Calendar.YEAR);//当前年份
		int monthNow = cal.get(Calendar.MONTH);//当前月份
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);//当前日期
		cal.setTime(birthDay);
		int yearBirth = cal.get(Calendar.YEAR);//当前年份
		int monthBirth = cal.get(Calendar.MONTH);//当前月份
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);//当前日期
		//计算整岁数
		int age = yearNow - yearBirth;
		if(monthNow <= monthBirth){
			if(monthNow == monthBirth){
				if(dayOfMonthNow < dayOfMonthBirth ){
					age--;//当前日期在年龄之前减一
				}
			}else{
				age--;//当前月份在生日之前,年龄减一
			}
		}return age;
	}
	
	/**
	 * 根据传入的参数获取该日期的月初日期，
	 * @param src
	 * @return
	 */
	public static Date getDateByMonthInit(Date src){
		
		
	}
	
	/**
	 * 根据传入的参数获取该日器的月末日期
	 * @param src
	 * @return
	 */
	public static Date getDateByMonthLast(Date src){
		Date date = new Date();
		return src;
		
	}
	
	/**
	 * 求未来日期离今天还剩的天数
	 * @param src
	 * @return
	 */
	public static Date getDaysByFuture (Date future){
		Date date = new Date();
		
		
		return future;
		
	}
	
	/**
	 * 求过去日期离今天过去的天数
	 * @param src
	 * @return
	 */
	public static Date getDaysByDeparted  (Date departed){
		return departed;
		
	}
}
