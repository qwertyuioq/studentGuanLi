package com.wh.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wh.bean.FenLei;
import com.wh.bean.Student;
import com.wh.service.FenLeiService;
import com.wh.service.StudentService;

public class StudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String z = req.getParameter("z");
		if(z.equals("add")){
			try {
				this.add(req,resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(z.equals("search")){
			try {
				this.search(req,resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(z.equals("edit")){
			try {
				this.searchOne(req,resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(z.equals("del")){
			try {
				this.delete(req,resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(z.equals("update")){
			try {
				this.update(req,resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

	private void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String sid = req.getParameter("sid");
		String sex = req.getParameter("sex");
		String sname = req.getParameter("sname");
		String age = req.getParameter("age");
		String birthday = req.getParameter("birthday");
		String party = req.getParameter("party");
		StudentService ss = new StudentService();
		Student s = new Student();
		s.setSid(Integer.valueOf(sid));
		s.setSex(sex);
		s.setSname(sname);
		s.setAge(age);
		s.setBirthday(birthday);
		s.setParty(party);
		int i = ss.add(s);
		if(i>0){
			req.setAttribute("tishi", "添加成功");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}else{
			req.setAttribute("tishi", "添加失败");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}
	}

	private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String s = req.getParameter("id");
		StudentService fs = new StudentService();	
		int i = fs.delete(s);
		if(i>0){
			req.setAttribute("tishi", "删除成功");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}else{
			req.setAttribute("tishi", "删除失败");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}
	}

	private void searchOne(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int i = Integer.valueOf(req.getParameter("id"));
		StudentService ss = new StudentService();
		Student stu = ss.findOne(i);
		req.setAttribute("s", stu);
		req.getRequestDispatcher("edit.jsp").forward(req, resp);

	}

	private void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService fs = new StudentService();
		List<Student> l = fs.searchAll();
		System.out.println(l);
		req.setAttribute("ls", l);
		req.getRequestDispatcher("searchStudent.jsp").forward(req, resp);

	}

	protected void update(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("utf-8");
		int id =Integer.parseInt(req.getParameter("id"));
		int sid = Integer.parseInt(req.getParameter("sid"));
		String sex = req.getParameter("sex");
		String sname = req.getParameter("sname");
		String party = req.getParameter("party");
		String birthday = req.getParameter("birthday");
		String age = req.getParameter("age");
		StudentService fs = new StudentService();
		Student f = new Student();
		f.setId(id);
		f.setSid(sid);
		f.setSex(sex);
		f.setSname(sname);
		f.setParty(party);
		f.setBirthday(birthday);
		f.setAge(age);
		System.out.println(f);
		int i = fs.update(f);
		if(i>0){
			/*resp.setContentType("text/html,charset=utf-8");
			resp.getWriter().print("添加成功");*/
			req.setAttribute("tishi", "修改成功");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}else{
			/*resp.setContentType("text/html,charset=utf-8");
			resp.getWriter().print("添加成功");*/
			req.setAttribute("tishi", "修改失败");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}
		
	}
	

}
