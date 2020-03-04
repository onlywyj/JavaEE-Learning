<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>

<!-- 引入bootstrap核心 CSS文件  本地方式-->
	<link href="bootstrap_plugins/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
	<%-- CDN方式
    <script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
    --%>
    
    <style>
            #mybody{
                /*border: solid1px grey;*/
                width:980px;
                height:500px;             
                margin-top:50px;           
            } 
        </style>

    
</head>
<body>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-center">登录</h3>
			<form class="form-horizontal" role="form">
				<div class="form-group">
					 <label for="inputUsername" class="col-sm-2 control-label">用户名</label>
					<div class="col-sm-10">
						<input class="form-control" type="text" placeholder="Username" id="username" name="username"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input class="form-control" type="password" placeholder="Password" id="password" name="password" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 <label><input type="checkbox" />记住我</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 <button type="submit" class="btn btn-success">登录</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<%-- 
 <form action="UserServlet?type=login" method="post">
    <div class="container-fluid">
     <h3 style="text-align:center">LOGIN</h3>
        <div class="row">
            <div class="form-horizontal col-md-offset-3" id="login_form">
                <div class="col-md-9">
                    <div class="form-group">
                    <i class="fa fa-user fa-lg"></i>
                    <input class="form-control required" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20"/>
                    </div>
                    <div class="form-group">
                     	<i class="fa fa-lock fa-lg"></i>
                        <input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>
                    </div>
	                <div class="form-group col-md-offset-6">
	                    <button type="submit" class="btn btn-success pull-center" name="submit">登录</button>	
	                    <button type="reset" class="btn btn-warning pull-center" name="reset">取消</button>		                   
	                </div>
                </div>
            </div>
        </div>
    </div>
</form>
--%>
<!-- 当账号或密码输入错误时给出提示信息 -->
<hr/>
<c:if test="${message}!=null">
	<c:out value="${message}"/>
</c:if>


			<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		    <script src="bootstrap_plugins/js/jquery-1.11.3.min.js"></script>
		    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    		<script src="bootstrap_plugins/js/bootstrap.min.js"></script>
    		
    		
</body>
</html>