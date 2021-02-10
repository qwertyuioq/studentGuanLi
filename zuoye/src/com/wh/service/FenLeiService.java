package com.wh.service;

import java.util.List;

import com.wh.bean.FenLei;
import com.wh.bean.Student;
import com.wh.dao.FeiLeiDao;

public class FenLeiService {
	FeiLeiDao dao=new FeiLeiDao();
	public int add(FenLei f) {
		return dao.add(f);
		
	}
	public List<FenLei> searchAll(){
		return dao.searchAll();
	}
	public FenLei findOne(String sname){
		return dao.findOne(sname);
	}
	public int delete(String sname){
		return dao.delete(sname);
	}
	public int update(FenLei f){
		return dao.update(f);
	}
}
