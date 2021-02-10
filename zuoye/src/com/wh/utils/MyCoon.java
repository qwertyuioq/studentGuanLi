package com.wh.utils;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MyCoon {
	//定义为静态成员变量
	private static Connection coon=null;
	public static Connection getCoon(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    coon=(Connection) DriverManager.getConnection("jdbc:mysql:///zuoye","root","1");
			return coon;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
