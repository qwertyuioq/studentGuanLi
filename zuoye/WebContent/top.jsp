<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
</script>
<title>Insert title here</title>
	<style type="text/css">
		body {
			background-color: #BFD7EE;
			background-repeat: repeat-x;
		}
		div{
			width: 50%;
			height: 90px;
			float: left;
			padding-top: 30px;
		}
		a{
			text-decoration: none;
			color: black;
		}
		a:hover {
			font-size: 13px;
		}
	</style>
</head>
<body>
	<div style="font-size: 35px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生管理系统</div>
	<div style="font-size: 12px;padding-top: 50px;">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		欢迎用户：${teacher.tname }
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		上次登录时间：${teacher.lastlogin }
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a target="login?e=login" href="index.jsp">退出登录</a> 
	</div>
</body>
</html>