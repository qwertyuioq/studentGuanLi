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
		<h2>分类管理&nbsp;&nbsp;>&nbsp;&nbsp;修改分类</h2>
		<hr>
		<br>
		<br>
		<form action="fenleiAction?z=update" method="post">
		<!-- 没有table标签，行并列排 -->
			<input type="hidden" name="sname" value="${f.sname}"><!-- hidden隐藏域 -->
			<tr>&nbsp;&nbsp;${f.sname}:&nbsp;&nbsp;</tr>
			<tr>
				<td>班级</td>
				<td><input type="text" name="banji" value="${f.getBanji()}"/></td>
			</tr>
			<tr>
				<td>入学时间</td>
				<td><input type="text" name="time" value="${f.getTime()}"/></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="保存"/></td>
			</tr>
		
		
		
		
		
		</form>

</body>
</html>