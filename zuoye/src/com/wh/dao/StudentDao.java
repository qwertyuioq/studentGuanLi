package com.wh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wh.bean.Student;
import com.wh.utils.MyCoon;

public class StudentDao {
	Connection conn = MyCoon.getCoon();;
	public int add(Student s) {
		 
		try {
			Statement st = conn.createStatement();
			String sql = "insert into Student(sid,sname,age,sex,birthday,party)value('"+s.getSid()+"','"+s.getSname()+"','"+s.getAge()+"','"+s.getSex()+"','"+s.getBirthday()+"','"+s.getParty()+"')";
			int b = st.executeUpdate(sql);
			return b;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
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
	public List<Student> searchAll(){
		List<Student> l=new ArrayList<Student>();
		try {
			Statement stat = conn.createStatement();
			String sql="select * from Student";
			ResultSet rs = stat.executeQuery(sql); 
			while(rs.next()){
				Student c=new Student();
				c.setId(rs.getInt("id"));
				c.setSname(rs.getString("sname"));
				c.setSid(Integer.valueOf(rs.getString("sid")));
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
	public int delete(String sname){
		try {
			Statement stat = conn.createStatement();
			String sql="delete from student where sname='"+sname+"'";
			int b = stat.executeUpdate(sql);
			return b;
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("!!!");
		return 0;
		
		
	}
	public int update(Student s){
		/*try{
			Statement stat = conn.createStatement();
			String sql="update Student set sid='"+s.getSid()+"',sname='"+s.getSname()+"',sex='"+s.getSex()+"',"
					+ "age='"+s.getAge()+",birthday='"+s.getBirthday()+"',party='"+s.getParty()+"' where sid='"+s.getSid()+"'";
					
			int b = stat.executeUpdate(sql);
			return b;
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		return 0;*/
		try {
		
			String sql = "update student set sid=?,sname=?,sex=?,"
					+ "age=?,birthday=?,party=? where id=?";
			System.out.println(s.getSid()+"--------");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,s.getSid());
			ps.setString(2,s.getSname());
			ps.setString(3,s.getSex());
			ps.setString(4,s.getAge());
			ps.setString(5,s.getBirthday());
			ps.setString(6,s.getParty());
			ps.setInt(7,s.getId());
			int i = ps.executeUpdate();
			System.out.println(i);
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}/*
	public static void main(String[] args) {
		FeiLeiDao dao = new FeiLeiDao();
		FenLei f = new FenLei();
		f.setBanji("2°à");
		f.setTime("2017Äê");
		int i = dao.add(f);
		System.out.println(i);
	}*/
}
