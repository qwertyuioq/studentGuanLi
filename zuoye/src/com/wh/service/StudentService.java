package com.wh.service;

import java.util.List;

import com.wh.bean.FenLei;
import com.wh.bean.Student;
import com.wh.dao.StudentDao;

public class StudentService {
	StudentDao dao=new StudentDao();
	public int add(Student s) {
		return dao.add(s);
		
	}
	public List<Student> searchAll(){
		return dao.searchAll();
	}
	public Student findOne(int i){
		return dao.findOne(i);
	}
	public int delete(String sname){
		return dao.delete(sname);
	}
	public int update(Student s){
		return dao.update(s);
	}
}
