<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="UserServlet?type=login" method="post">
	
	<input type="text" name="username"/><br/>
	<input type="password" name="password"/><br/>
	<input type="submit" value="登录"/>
	<input type="reset" value="重置"/>
	
</form>
<hr/>
<c:if test="${message}!=null">
	<c:out value="${message}"/>
</c:if>

</body>
</html>