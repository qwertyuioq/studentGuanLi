<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h2>学生管理&nbsp;&nbsp;>添加学生信息</h2>
	<hr>
	<br>
	<form action="studentAction?z=add" method="post">
		<table>
			<tr>
				<td>学号</td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					男<input type="radio" name="sex" value="男" >
					女<input type="radio" name="sex" value="女" >
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>出生日期</td>
				<td><input type="text" name="birthday"></td>
			</tr>
			<tr>
				<td>政治面貌</td>
				<td><input type="text" name="party"></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td><input type="submit"  value="添加"></td>
			</tr>
		</table>
	</form>

</body>
</html>