package com.wh.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wh.bean.FenLei;
import com.wh.service.FenLeiService;

public class FenLeiServlet extends HttpServlet {

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

	private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String banji = req.getParameter("banji");
		String time = req.getParameter("time");
		String sname = req.getParameter("sname");
		FenLeiService fs = new FenLeiService();
		FenLei f = new FenLei();
		f.setBanji(banji);
		f.setTime(time);
		f.setSname(sname);
		int i = fs.update(f);
		if(i>0){
			req.setAttribute("tishi", "保存成功");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}else{
			req.setAttribute("tishi", "保存失败");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}
	}

	private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String s = req.getParameter("id");
		FenLeiService fs = new FenLeiService();	
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
		String s = req.getParameter("id");
		FenLeiService fs = new FenLeiService();
		FenLei f = fs.findOne(s);
		req.setAttribute("f", f);
		req.getRequestDispatcher("edit.jsp").forward(req, resp);

	}

	private void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FenLeiService fs = new FenLeiService();
		List<FenLei> l = fs.searchAll();
		req.setAttribute("list", l);
		req.getRequestDispatcher("SearchFeilei.jsp").forward(req, resp);

	}

	protected void add(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("utf-8");
		String banji = req.getParameter("banji");
		String time = req.getParameter("time");
		String sname = req.getParameter("sname");
		FenLeiService fs = new FenLeiService();
		FenLei f = new FenLei();
		f.setBanji(banji);
		f.setTime(time);
		f.setSname(sname);
		System.out.println(f);
		int i = fs.add(f);
		if(i>0){
			/*resp.setContentType("text/html,charset=utf-8");
			resp.getWriter().print("添加成功");*/
			req.setAttribute("tishi", "添加成功");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}else{
			/*resp.setContentType("text/html,charset=utf-8");
			resp.getWriter().print("添加成功");*/
			req.setAttribute("tishi", "添加失败");
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		}
		
	}
	

}
