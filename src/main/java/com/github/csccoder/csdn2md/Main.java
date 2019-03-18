package com.github.csccoder.csdn2md;

import com.github.csccoder.csdn2md.paser.CorePaser;
import com.github.csccoder.csdn2md.util.PropertiesUtil;

import java.io.IOException;


public class Main {

	static String csdn_host = PropertiesUtil.getProperties("csdn_host");

	private static String host = csdn_host;

	public static void main(String args[]) throws IOException {
		String casn_name = PropertiesUtil.getProperties("casn_name");
		String file_Path = PropertiesUtil.getProperties("file_Path");

		String author = casn_name;                           //csdn用户名

		String dirPath = file_Path;   //文件保存路径（绝对路径）

		new CorePaser().parse(host, author, dirPath, true);  //是否爬取图片 默认false


	}
}


