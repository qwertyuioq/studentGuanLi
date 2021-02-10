<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		div {
			margin-top: 10%;
			margin-left: 32%
		}
		table{
			border:solid 1px blue;
			width: 450px;
			height: 200PX;
			margin-left: 37%;
			font-size: 12px;
		}
		.textclass{
			height: 35PX;
			width: 250PX;
		}
		.anniu{
			border-radius: 10px;
			background-color: gray;
			width: 70px;
			height: 30px;
		}
		.anniu:hover {
			cursor: pointer;
		}
	</style>
</head>
<body>
	<div><font style="font-size: 30px;">学生管理系统</font></div>
	<p>&nbsp;</p>
	<form action="login" method="post">
		<table>
			<tr>
				<td>登录名：</td><td><input class="textclass" type="text" name="tname"></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;码：</td><td><input class="textclass" type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td><td>${loginmsg}</td>
			</tr>
			
			<tr>
				<td>&nbsp;</td>
				<td align="center"><input type="submit" class="anniu" value="登录"></td>
			</tr>
		</table>
	</form>
</body>
</html>