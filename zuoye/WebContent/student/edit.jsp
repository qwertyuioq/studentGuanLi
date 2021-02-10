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
		<h2>学生管理&nbsp;&nbsp;>修改学生信息</h2>
		<hr>
		<br>

	<form action="studentAction?z=update" method="post">
		<table>
			 <input type="hidden" name="id" value="${s.id }"></td>
			<tr>
				<td>学号</td><td><input type="text" value="${s.sid }" name=sid></td>
			</tr>
			<tr>
				<td>姓名</td><td><input type="text" value="${s.sname}" name=sname></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					男<input type="radio" value="男" <c:if test="${s.sex=='男' }"> checked="checked"</c:if> name="sex">
					女<input type="radio" value="女" <c:if test="${s.sex=='女' }"> checked="checked"</c:if> name="sex">
				</td>
			</tr>
			<tr>
				<td>年龄</td><td><input type="text" value="${s.age }" name=age></td>
			</tr>
			<tr>
				<td>生日</td><td><input type="text" value="${s.birthday }" name=birthday></td>
			</tr>
			<tr>
				<td>政治面貌</td><td><input type="text" value="${s.party }" name=party></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>
					<input type="submit" value="保存">
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>