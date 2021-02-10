package com.wh.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.wh.bean.Teacher;
import com.wh.utils.MyCoon;


public class LoginServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String param = req.getParameter("e");
		if(param!=null){
			this.loginOut(req,resp);
			return;
		}
		String tname = req.getParameter("tname");
		String pwd=req.getParameter("pwd");
		Connection co=new MyCoon().getCoon();
		
		try{
		Statement stat = co.createStatement();
		ResultSet rs = stat.executeQuery("select * from teacher where tname='"+tname+"' and pwd='"+pwd+"' ");
		
		if(rs.next()){
			Teacher c=new Teacher();
			c.setTid(rs.getInt("tid"));
			c.setTname(rs.getString("tname"));
			c.setPwd(rs.getInt("pwd"));
			c.setLastlogin(rs.getString("lastLogin"));
			req.getSession().setAttribute("teacher", c);//��session��Χ���ñ���
			
			//�����ݿ��������ݣ���ѯ����������ʱ��Ϊϵͳ��ǰʱ��
			//����ʱ���ʽ
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dtime = sdf.format(new Date());
			stat.execute("update teacher set lastlogin='"+dtime+"' where tid='"+rs.getInt("tid")+"'");
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		}else{
			req.setAttribute("loginmsg", "��¼ʧ��");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	protected void loginOut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().invalidate();//��session����
		req.getRequestDispatcher("index.jsp").forward(req, resp);//����ת��
	}
	
}
