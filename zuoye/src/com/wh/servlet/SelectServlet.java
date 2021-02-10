package com.wh.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wh.bean.FenLei;
import com.wh.bean.Student;
import com.wh.service.SelectService;
import com.wh.service.StudentService;

public class SelectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String z = req.getParameter("z");
		if(z.equals("xuehao")){
			try {
				this.selectXuehao(req,resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(z.equals("fenlei")){
			try {
				this.selectFenlei(req,resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(z.equals("sname")){
			try {
				this.selectName(req,resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(z.equals("searchFenlei")){
			try {
				this.searchFenlei(req,resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void selectXuehao(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int i = Integer.valueOf(req.getParameter("sid"));
		SelectService ss = new SelectService();
		Student stu = ss.findOne(i);
		req.setAttribute("a", stu);
		System.out.println(stu);
		req.getRequestDispatcher("xuehao.jsp").forward(req, resp);
	}
	private void searchFenlei(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		SelectService ss = new SelectService();
		List<FenLei> list = ss.searchFenlei();
		req.setAttribute("list", list);
		req.getRequestDispatcher("fenlei.jsp").forward(req, resp);

	}
	private void selectFenlei(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int i = Integer.valueOf(req.getParameter("id"));
		System.out.println(i);
		StudentService ss = new StudentService();
		Student stu = ss.findOne(i);
		req.setAttribute("s", stu);
		System.out.println(stu);
		req.getRequestDispatcher("edit.jsp").forward(req, resp);

	}
	private void selectName(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String sname = req.getParameter("sname");
		SelectService ss = new SelectService();
		List<Student> ls = ss.selectName(sname);
		req.setAttribute("ls", ls);
		req.getRequestDispatcher("sname.jsp").forward(req, resp);

	}
	

}
