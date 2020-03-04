<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入bootstrap核心 CSS文件  本地方式-->
	<link href="bootstrap_plugins/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
<script type="text/javascript">
	function del(){
		return window.confirm("真的要删除该用户吗？");
	}
		
</script>

</head>

<body>

<h1>欢迎<font color="red">${username}</font>登录</h1>
<button type="button" onclick="window.location.href='userAdd.jsp'" >添加用户</button>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<table class="table table-bordered">
				<thead>
					<tr>
					<th>id</th><th>用户名</th><th>密码</th>
					<th>等级</th><th>邮箱</th><th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allUser}" var="user">
					<tr>
						<td>${user.id}</td>
						<td>${user.username}</td>
						<td>${user.password}</td>
						<td>${user.grade}</td>
						<td>${user.email}</td>
						<td><a onclick="return del()" href="UserServlet?type=delete&id=${user.id}">删除</a>&nbsp;&nbsp;<a href="UserServlet?type=userModify&id=${user.id}">编辑</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>


			<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		    <script src="bootstrap_plugins/js/jquery-1.11.3.min.js"></script>
		    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    		<script src="bootstrap_plugins/js/bootstrap.min.js"></script>
    		
 
</body>
</html>