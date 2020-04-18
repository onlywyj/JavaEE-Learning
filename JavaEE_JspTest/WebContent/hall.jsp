<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.* ,java.sql.*,com.wyj.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center">
	<h1>欢迎购物</h1>
	<form action='/JavaEE_JspTest/ShoppingServlet?type=showMyCart'
		method='post'>
		<table border='1' style="border-collapse: collapse; margin: auto">
			<tr>
				<th>书名</th>
				<th>作者</th>
				<th>出版社</th>
				<th>价格</th>
				<th>剩余数量</th>
				<th>购买</th>
			</tr>
			<%       
	ArrayList al=(ArrayList)request.getAttribute("books");     
	for(int i=0;i<al.size();i++){
		Book book=(Book)al.get(i);      
	%>
			<tr>
				<td><%=book.getBookname()%></td>
				<td><%=book.getAuthor()%></td>
				<td><%=book.getPublishHouse()%></td>
				<td><%=book.getPrice()%></td>
				<td><%=book.getNums()%></td>
				<td><a
					href='/JavaEE_JspTest/ShoppingServlet?type=addBook&id= <%=book.getId() %>'>购买</a></td>
			</tr>
			<%     
	}      
	%>
			<tr>
				<td colspan='6'><input type='submit' value='查看购物车 ' /></td>
			</tr>
		</table>
	</form>
	<a href="/JavaEE_JspTest/GoLogin">返回重新登录</a>
</body>
</html>