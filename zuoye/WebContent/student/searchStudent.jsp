<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<style type="text/css">
		body{
			font-size: 12px;
			background-color: #BFD7EE;
		}
		table{
			border: solid 1px blue;
			font-size: 12px;
			width: 700px;
			border-collapse: collapse;
		}
		td{
			border: solid 1px blue;
		}
	</style>
</head>
<body>
		<h2>学生管理&nbsp;&nbsp;>学生信息</h2>
		<hr>
		<br>
<c:if test="${!empty ls }">
	<table>
		<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>生日</td>
				<td>政治面貌</td>
				<td>操作</td>
		</tr>
		<c:forEach items="${ls }" var="a">
		<tr>
				<td>${a.sid }</td>
				<td>${a.sname }</td>
				<td>${a.sex}</td>
				<td>${a.age }</td>
				<td>${a.birthday }</td>
				<td>${a.party }</td>
				<td>
						<a href="studentAction?z=edit&id=${a.id }">修改</a>
						<a href="studentAction?z=del&id=${a.id }">删除</a>
				</td>
		</tr>
		</c:forEach>
		
	</table>
</c:if>	

</body>
</html>