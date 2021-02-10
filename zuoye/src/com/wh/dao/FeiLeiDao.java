package com.wh.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wh.bean.FenLei;
import com.wh.utils.MyCoon;

public class FeiLeiDao {
	Connection conn = MyCoon.getCoon();;
	public int add(FenLei f) {
		 
		try {
			Statement st = conn.createStatement();
			String sql = "insert into fenlei(sname,banji,time)value('"+f.getSname()+"',"
					+ "'"+f.getBanji()+"','"+f.getTime()+"')";
			int b = st.executeUpdate(sql);
			return b;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public FenLei findOne(String sname){
		FenLei cou=new FenLei();
		try {
			Statement stat = conn.createStatement();
			String sql="select * from fenlei where sname='"+sname+"'";
			 ResultSet rs = stat.executeQuery(sql);
			 while(rs.next()){
				cou.setSname(rs.getString("sname"));
				cou.setBanji(rs.getString("banji"));
				cou.setTime(rs.getString("time"));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cou;
	}
	public List<FenLei> searchAll(){
		List<FenLei> l=new ArrayList<FenLei>();
		try {
			Statement stat = conn.createStatement();
			String sql="select * from fenlei";
			ResultSet rs = stat.executeQuery(sql); 
			while(rs.next()){
				FenLei c=new FenLei();
				c.setSname(rs.getString(1));
				c.setBanji(rs.getString(2));
				c.setTime(rs.getString(3));
				l.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
		
	}
	public int delete(String sname){
		try {
			Statement stat = conn.createStatement();
			String sql="delete from fenlei where sname='"+sname+"'";
			int b = stat.executeUpdate(sql);
			return b;
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("!!!");
		return 0;
		
		
	}
	public int update(FenLei f){
		try{
			Statement stat = conn.createStatement();
			String sql="update fenlei set banji='"+f.getBanji()+"',time='"+f.getTime()+"' where sname='"+f.getSname()+"'";
			int b = stat.executeUpdate(sql);
			return b;
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
		FeiLeiDao dao = new FeiLeiDao();
		FenLei f = new FenLei();
		f.setBanji("2°à");
		f.setTime("2017Äê");
		int i = dao.add(f);
		System.out.println(i);
	}
}
