package com.wh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wh.bean.FenLei;
import com.wh.bean.Student;
import com.wh.utils.MyCoon;

public class SelectDao {
	Connection conn = MyCoon.getCoon();;
	
	public Student findOne(int i){
		Student cou=new Student();
		try {
			Statement stat = conn.createStatement();
			String sql="select * from Student where id='"+i+"'";
			 ResultSet rs = stat.executeQuery(sql);
			 while(rs.next()){
				cou.setId(rs.getInt("id"));
				cou.setSid(rs.getInt("sid"));
				cou.setSname(rs.getString("sname"));
				cou.setAge(rs.getString("age"));
				cou.setSex(rs.getString("sex"));
				cou.setBirthday(rs.getString("birthday"));
				cou.setParty(rs.getString("party"));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cou;
	}
	public List<Student> selectName(String sname){
		List<Student> l=new ArrayList<Student>();
		try {
			String sql="select * from student where sname like ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,"%"+sname+"%");
			 ResultSet rs = ps.executeQuery(); 
			while(rs.next()){
				Student c=new Student();
				c.setId(rs.getInt("id"));
				c.setSname(rs.getString("sname"));
				c.setSid(rs.getInt("sid"));
				c.setSex(rs.getString("sex"));
				c.setAge(rs.getString("age"));
				c.setBirthday(rs.getString("birthday"));
				c.setParty(rs.getString("party"));
				l.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
		
	public List<FenLei> searchFenlei(){
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
		
	/*
	public static void main(String[] args) {
		FeiLeiDao dao = new FeiLeiDao();
		FenLei f = new FenLei();
		f.setBanji("2°à");
		f.setTime("2017Äê");
		int i = dao.add(f);
		System.out.println(i);
	}*/
}
