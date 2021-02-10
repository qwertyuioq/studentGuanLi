
	package com.wh.filter;

	import java.io.IOException;

	import javax.servlet.Filter;
	import javax.servlet.FilterChain;
	import javax.servlet.FilterConfig;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class myfilter implements Filter{

		public void init(FilterConfig filterconfig) throws ServletException {
			
		}
			
		public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
				throws IOException, ServletException {
			req.setCharacterEncoding("utf-8");
			HttpServletRequest request= (HttpServletRequest)req;
			HttpServletResponse response = (HttpServletResponse)resp;
			
			Object obj = request.getSession().getAttribute("teacher");
			
			String cp = request.getRequestURI();
//			String serpath = request.getServletPath();
			
			if(this.uricheck(cp)) {
				if(obj==null) {
					response.sendRedirect("index.jsp");
					return;
				}
			}
			chain.doFilter(req, resp);
		}
		public boolean uricheck(String uri) {
			String [] sx = {"/zuoye/","/zuoye/login","/zuoye/index.jsp"};
			for(String s:sx) {
				if(s.equals(uri)) {
					return false;
				}
			}
			return true;
		}

		public void destroy() {
			
		}

	}


