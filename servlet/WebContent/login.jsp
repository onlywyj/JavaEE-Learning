<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Login</title>

	<link rel="stylesheet" type="text/css" href="bootstrap_plugins/css/style.css">
	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script type="text/javascript" src="bootstrap_plugins/js/jquery.min.js"></script>
    <!-- 引入二维向量vector库 -->
    <script type="text/javascript" src="bootstrap_plugins/js/vector.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  	<script type="text/javascript" src="bootstrap_plugins/js/bootstrap.min.js"></script>

	<%-- CDN方式
    <script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
    --%>
      
	<script type="text/javascript">
	    $(function(){
	        Victor("container", "output");   //登录背景函数
	        $("#username").focus();
	        $(document).keydown(function(event){
	            if(event.keyCode==13){
	                $("#submit_btn").click();
	            }
	        });
	    });
	</script>

</head>
<body>

<div id="container">
	<div id="output">
		<div class="containerT">
			<h1>用户登录</h1>
			<form class="form" action="UserServlet?type=login" method="post">
				<input type="text" placeholder="用户名" id="username" name="username">
				<input type="password" placeholder="密码" id="password" name="password">
				<button type="submit" id="submit_btn">登录</button>
				<div id="prompt" class="prompt"></div>
			</form>
		</div>
	</div>
</div>
<div style="text-align:center;">
</div>
</body>
</html>

<!-- 当账号或密码输入错误时给出提示信息 -->
<hr/>
<c:if test="${message}!=null">
	<c:out value="${message}"/>
</c:if>  		
    		
</body>
</html>