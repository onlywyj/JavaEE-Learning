<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#mylogin {
	width: 300px;
	height: 150px;
	margin: 0 auto;
	border: solid grey 1px;
}
</style>
</head>
<body>
	<div id="mylogin">
		<form action="${pageContext.request.contextPath}/checkUser"
			method="post">
			<p>
				登录名：<input type="text" name="username" />
			</p>
			<p>
				密   码：<input type="password" name="password" />
			</p>
			<p>
			<center>
				<input type="submit" value="login" />
				<input type="reset" value="reser" />
			</center>
			</p>
		</form>
	</div>
</body>
</html>