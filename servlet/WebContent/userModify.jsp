<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户修改</title>

	<!-- 引入bootstrap 本地方式-->
	<link href="bootstrap_plugins/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">

</head>
<body>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12" style="background:#1E90FF;color:white">
	            <h1 style="text-align:center">用户信息管理系统</h1>          
	    </div> 
	    <div class="col-md-2 col-md-offset-10" >           
	        	<h3>欢迎您，<font color="red">${username}</font></h3>
	        	<h3><a href="#">安全退出</a></h3>
	    </div>
	    <h2 style="text-align:center">修改用户信息</h2>
	    <hr/>
	    
		<form class="form-horizontal" action="UserServlet?type=modify" method="post">
		<div class="col-sm-offset-2">
	    <div class="form-group">
			<input type="hidden" value=${user.id} name="id"/>
		    <label for="inputUserName" class="col-sm-2 control-label">姓名：</label>
		    <div class="col-sm-6">
		    <input type="text" class="form-control" name="username" id="inputUserName" value=${user.username} placeholder="姓名">
		    </div>
	    </div>
	    <div class="form-group">
	    	<label for="inputPassword" class="col-sm-2 control-label">密码：</label>
	        <div class="col-sm-6">
	        <input type="password" class="form-control" name="password" id="inputPassword" value=${user.password}  placeholder="密码">
	        </div>
	    </div>
	    <div class="form-group">
	        <label for="inputGrade" class="col-sm-2 control-label">等级：</label>
	        <div class="col-sm-6">
	    		<input type="text" class="form-control" name="grade" id="inputGrade" value=${user.grade} placeholder="等级">
	        </div>
	    </div>
	    <div class="form-group">
	        <label for="inputEmail" class="col-sm-2 control-label">邮箱：</label>
	   		<div class="col-sm-6">
	        <input type="email" class="form-control" name="email" id="inputEmail" value=${user.email} placeholder="邮箱">
	    	</div>
		</div>                    
	    <div class="form-group">
	        <div class="col-sm-offset-4 col-sm-10">
	        <button type="submit" class="btn btn-success pull-center" name="submit">确定</button>
	        <button type="reset" class="btn btn-warning pull-center" name="reset">取消</button>
	        </div>
	    </div>
	    </div>
	    </form>
	</div>
</div>



			<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		    <script src="bootstrap_plugins/js/jquery-1.11.3.min.js"></script>
		    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    		<script src="bootstrap_plugins/js/bootstrap.min.js"></script>
    		

</body>
</html>