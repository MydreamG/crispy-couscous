package com.guoyiyang.common.utils;
//工具类
public class StringUtil {
	//将文本转换成html文本方法
	public static String toHtml(String text){
		//实现代码
		//定义一个返回数组类型
		String text1 = "";
		//定义一个切割数组
		String[] split = text.split("\n");
		//循环判断
		if(split.length>2){
			//循环数组
			for (String string : split) {
				//循环给数组加上html标签
				text1+="<p>"+string+"</p>\n";
			}
		}
		//输出结果
		return text1;
	}
	//判断是否为中国地区手机号码
	public static String isPhone(String text){
		// 实现方法
		
		
		//返回值
		return text;
		
	}
	//判断是否为邮箱
	public static String isEmail(String text){
		//实现方法
		
		
		//返回值
		return text;
		
	}
}
