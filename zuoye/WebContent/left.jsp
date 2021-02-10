<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		body{
			font-size:12px;
			background-color: #BFD7EE;
		}
		div{
			line-height: 20px;
			padding-top: 3%;
			padding-left: 5%;
			width: 80%;
			cursor: pointer;
			color: blue;
		}
		div:hover{
			background-color: #BFD7EE;
		}
		li{
			line-height: 25px;
		}
		a{
			text-decoration: none;
			color: gray;
		}
		.xx{}
	</style>
	<script type="text/javascript">
		function shownext(obj){
			var next = obj.nextElementSibling;
			if(next.style.display=="none"){
				next.style.display="block";
			}else{
				next.style.display="none";
			}
		}
	</script>
</head>
<body>
	<div>
		&nbsp;&nbsp;
	</div>
	<div onclick="shownext(this)">
		学生分类
	</div>
	<ul style="display: none;">
		<li><a target="abc" href="fenlei/AddFenLei.jsp" >增加分类</a></li>
		<li><a target="abc" href="fenlei/fenleiAction?z=search" >查询分类</a></li>
	</ul>
	<div onclick="shownext(this)">
		学生管理
	</div>
	<ul style="display: none;">
		<li><a target="abc" href="student/addStudent.jsp" >添加学生信息</a></li>
		<li><a target="abc" href="student/studentAction?z=search" >修改学生信息</a></li>
	</ul>
	<div onclick="shownext(this)">
		学生查询
	</div>
	<ul style="display: none;">
		<li><a target="abc" href="select/xuehao.jsp" >以学号查询</a></li>
		<li><a target="abc" href="select/sname.jsp" >以姓名查询</a></li>
	</ul>
	
	
</body>
</html>