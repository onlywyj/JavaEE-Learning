<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align:center">
	<h1>欢迎登陆购物系统--登录页面</h1>     
	<form action="/JavaEE_JspTest/GoHall" method="post">
    <table border="1" style="border-collapse: collapse;margin: auto">       
    <tr><td>用户名：</td><td><input type="text" name="username"/></td></tr>       
    <tr><td>密 码：</td><td><input type="password" name="password"/></td></tr>       
    <tr><td><input type="submit" value=" 登陆 "/>  </td><td><input type="reset" value=" 清空 "/></td></tr>     
    </table>     
    </form>     
    <%     
    String errinfo=(String)request.getAttribute("errinfo");     
    if(errinfo!=null){      
    	out.println(errinfo);     
    }     
    %>   
</body>
</html>