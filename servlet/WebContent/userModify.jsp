<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- 引入bootstrap 本地方式-->
	<link href="bootstrap_plugins/css/bootstrap.min.css" rel="stylesheet">
    <script src="bootstrap_plugins/js/jquery-1.11.3.min.js"></script>
    <script src="bootstrap_plugins/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/style.css">

</head>
<body>

<h2 style="text-align:center">修改用户信息</h2>

<div class="container-fluid">
	<div class="row">
		<form class="form-horizontal" action="UserServlet?type=modify" method="post">
	    <div class="form-group">
			<input type="hidden" value=${user.id} name="id"/>
		    <label for="inputUserName" class="col-sm-2 control-label">姓名：</label>
		    <div class="col-sm-10">
		    <input type="text" class="form-control" name="username" id="inputUserName" value=${user.username} placeholder="姓名">
		    </div>
	    </div>
	    <div class="form-group">
	    	<label for="inputPassword" class="col-sm-2 control-label">密码：</label>
	        <div class="col-sm-10">
	        <input type="password" class="form-control" name="password" id="inputPassword" value=${user.password}  placeholder="密码">
	        </div>
	    </div>
	    <div class="form-group">
	        <label for="inputGrade" class="col-sm-2 control-label">等级：</label>
	        <div class="col-sm-10">
	    		<input type="text" class="form-control" name="grade" id="inputGrade" value=${user.grade} placeholder="等级">
	        </div>
	    </div>
	    <div class="form-group">
	        <label for="inputEmail" class="col-sm-2 control-label">邮箱：</label>
	   		<div class="col-sm-10">
	        <input type="email" class="form-control" name="email" id="inputEmail" value=${user.email} placeholder="邮箱">
	    	</div>
		</div>                    
	    <div class="form-group">
	        <div class="col-sm-offset-2 col-sm-10">
	        <button type="submit" class="btn btn-success pull-center" name="submit">确定</button>
	        <button type="reset" class="btn btn-warning pull-center" name="reset">取消</button>
	        </div>
	    </div>
	</div>
</div>
</form>
</body>
</html>