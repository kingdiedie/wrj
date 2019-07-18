package com.lj;

import java.util.Collection;
import java.util.Map;

public class AsserUitls {
	/**
	 * ����Ϊ��
	 * @param b ����true����false
	 * @param message ������Ϣ
	 */
	public static void isTrue(boolean b,String message){
		if(!Boolean.TRUE.equals(b)){
			throw new WRuntimeException(message);
		}
	}
	/**
	 * ����Ϊ��
	 * @param exp ����true����false
	 * @param message ������Ϣ
	 */
	public static void isFalse(boolean exp,String message){
		if(Boolean.TRUE.equals(exp)){
			throw new WRuntimeException(message);
		}
	}
	/**
	 * ���Բ�Ϊ��
	 * @param exp �����ַ�������
	 * @param message ������Ϣ
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
	 * 4.���Ա���Ϊ��
	 * @param exp �����ַ�������
	 * @param message ������Ϣ
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
	 * ���Լ��ϲ�Ϊ��
	 * @param ���϶���
	 * @param message ������Ϣ
	 */
	public static void collectionNotNull(Collection<?> col,String message){
		if(col == null || col.size()==0){
			throw new WRuntimeException(message);
		}
	}
	
	/**
	 * 6����map���ϲ�Ϊ��
	 * @param ���϶���
	 * @param message ������Ϣ
	 */
	public static void mapNotNull(Map<?, ?> map,String message){
		if(map == null || map.size()==0){
			throw new WRuntimeException(message);
		}
	}
	
	/**
	 * �ַ���������ֵ,ȥ���ո��
	 * 7@param src
	 * @param message
	 */
	public static void hhs(String src,String message){
		if(!(src.trim().length()>0)){
			throw new WRuntimeException(message);
		}
	}
	
	/**
	 * ��������������0
	 * 8@param src
	 * @param message
	 */
	public static void Num(int num,String message){
		if(num<=0){
			throw new WRuntimeException(message);
		}
	}
}
