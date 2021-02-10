<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
	<h2>学生信息&nbsp;&nbsp;>&nbsp;&nbsp;查看分类</h2>
	<hr>
	<br><br>
	<table border=1px,solid>
		<tr>
			<td>学生姓名</td>
			<td>班级</td>
			<td>入学时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="f">
			<tr>
				<td>${f.sname }</td>
				<td>${f.banji }</td>
				<td>${f.time }</td>
				<td><a href="fenleiAction?z=edit&id=${f.sname }">修改</a>&nbsp;&nbsp;
					<a href="fenleiAction?z=del&id=${f.sname}"> 删除</a></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>