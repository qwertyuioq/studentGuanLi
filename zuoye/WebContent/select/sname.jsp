<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
	学生查询&nbsp;&nbsp;>&nbsp;&nbsp;以姓名查询
	<hr>
	<form action="selectAction?z=sname" method="post">
		姓名：<input type="text" name="sname">
		<input type="submit" value="查询"> 
	</form>
	<br><br>
	<c:if test="${!empty ls }">
		<table>
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>性别</td>
				<td>生日</td>
				<td>政治面貌</td>
			</tr>
			<c:forEach items="${ls }" var="a">
				<tr>
					<td>${a.sid }</td>
					<td>${a.sname }</td>
					<td>${a.age }</td>
					<td>${a.sex=="男"?"男":"女" }</td>
					<td>${a.birthday }</td>
					<td>${a.party }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>