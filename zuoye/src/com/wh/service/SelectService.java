package com.wh.service;

import java.util.List;

import com.wh.bean.FenLei;
import com.wh.bean.Student;
import com.wh.dao.SelectDao;

public class SelectService {
	SelectDao dao=new SelectDao();
	
	public List<Student> selectName(String sname){
		return dao.selectName(sname);
	}
	public Student findOne(int i){
		return dao.findOne(i);
	}
	public List<FenLei> searchFenlei(){
		return dao.searchFenlei();
	}
}
