package com.wrj.bean;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

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
		if(str.trim().length()>0){
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
	
	
	/**
	 * 批量关闭流，参数能传无限个,例如传入FileInputStream对象
	 * @param closeables
	 * @throws IOException
	 */
	public static void closeAll(Closeable... closeables) throws IOException{
		for (Closeable c : closeables) {
			if(c!=null){
				c.close();
			}
		}
	}
	
	/**
	 * 拷贝流
	 * @param inp 输入流
	 * @param out 输出流
	 * @param isCloseInputStream
	 * @param isCloseOutputStream
	 * @throws IOException 
	 */
	public static void copy(InputStream inp ,OutputStream out,
							boolean isCloseInputStream,
							boolean isCloseOutputStream) throws IOException{
		
		byte[] b = new byte[1024];
		int len = 0;
		while((len=inp.read(b))>0){			
			out.write(b,0,len);
		}
		if(isCloseOutputStream){
			out.close();
		}
		if(isCloseInputStream){
			out.close();
		}		
	}
	
	/**
	 * 传入一个文本文件对象，默认为UTF-8编码，返回该文件内容，
	 * 要求方法内部调用上面第2个方法拷贝流
	 * @param src
	 * @return
	 * @throws IOException 
	 */
	public static String readTestFile (InputStream src) throws IOException{
		String content="";
		byte[] b = new byte[1024];
		int len = 0;
		while((len=src.read(b))>0){
			content += new String(b,0,len);
		}
		return content;		
	}

	/**
	 * 传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第3个方法
	 * @param txtFile
	 * @return
	 * @throws Exception
	 */
	public static String readTestFile(File txtFile) throws Exception{
		FileInputStream in = new FileInputStream(txtFile);
		String readTestFile = readTestFile(in);
		return readTestFile;
	}
	/**
	 * 从控制台读取用户输入的字符串。 
	 * @param message
	 * @return
	 */
	public static String readStringFromSystemIn(String message){
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		String nextLine = sc.nextLine();
		System.out.println(nextLine);
		if(nextLine.isEmpty()){
			readStringFromSystemIn(message);
			System.exit(0);
		}
		return nextLine;
	}
	/**
	 * 从控制台读取用户输入的数字。 
	 * @param message
	 * @return
	 */
	public static int readIntegetFromSystemIn(String message){
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		String nextLine = sc.nextLine();
		System.out.println(nextLine);
		boolean matches = nextLine.matches("\\d+");
		if(nextLine.isEmpty() || !matches){
			readIntegetFromSystemIn(message);
			System.exit(0);
		}
		return Integer.valueOf(nextLine);
	}
}
