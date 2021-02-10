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
		
	</style>
</head>
<body>
	学生查询&nbsp;&nbsp;>&nbsp;&nbsp;以分类查询
	<hr><br><br>
	<FORM action="selectAction?z=selectAll" method="post">
	班级名：<select name="banji" style="width: 100px;">
			<option value="0"> </option>
			<c:forEach items="${list }" var="t">
			
			<option value="${t.sname }">${t.banji }</option>
			</c:forEach>
			
			</select>
	入学时间：<select name="times" style="width: 100px;">
			<option value="0"> </option>
			<c:forEach items="${list }" var="t">
			
			<option value="${t.sname }">${t.time }</option>
			</c:forEach>
			
		  	</select>
		
		<input type="submit"  value="查询">
	</FORM>
</body>
</html>