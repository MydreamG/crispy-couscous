package com.guoyiyang.common.utils.test;

import com.guoyiyang.common.utils.StringUtil;

//测试类
public class StringUtilTest {
	//测试方法
	public static void main(String[] args) {
		//测试文本
		String html = StringUtil.toHtml("9月5日一大早,又有了新情况。\n上午9点多，传出中美经贸高级别磋商牵头人通话的消息。\n9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。");
		//输出测试文本
		System.out.println(html);
	}
}
