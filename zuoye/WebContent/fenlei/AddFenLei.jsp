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
	<h2>学生分类&nbsp;&nbsp;>&nbsp;&nbsp;增加分类</h2>
	<hr>
	<br>
	<form action="fenleiAction?z=add" method="post"  accept-charset="UTF-8">
		<table>
			<tr>
				<td>学生姓名</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>班级名</td>
				<td><input type="text" name="banji"></td>
			</tr>
			<tr>
				<td>入学时间</td>
				<td><input type="text" name="time"></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td><input type="submit"  value="添加"></td>
			</tr>
		</table>
	</form>

</body>
</html>