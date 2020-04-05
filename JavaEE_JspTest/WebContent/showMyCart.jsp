<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.* ,java.sql.*,com.wyj.domain.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align:center">
  <h1>我的购物车</h1>
  <a href="/JavaEE_JspTest/GoHall"> 返回购物大厅 </a>
  <form action="/JavaEE_JspTest/ShoppingServlet?type=updateBook&" method="post">
   <table border="1" style="border-collapse: collapse;margin: auto">
    <tr><th>bookID</th><th>书名</th><th>价格</th><th>出版社</th><th>数量</th><th>刪除</th></tr>
    
	<%       
	ArrayList al=(ArrayList)request.getAttribute("bookList");     
	for(int i=0;i<al.size();i++){
		Book book=(Book)al.get(i);      
	%>      
		<tr>
			<td><%=book.getId() %>      
			<td><%=book.getBookname()%></td>             
			<td><%=book.getPublishHouse()%></td>       
			<td><%=book.getPrice()%></td>       
			<td><input type="text" name="booknum" value="<%=book.getBuyNums() %>" />本</td>
            <td><a href="/JavaEE_JspTest/ShoppingServlet?type=deleteBook&id=<%=book.getId() %>">刪除</a></td> 
		</tr>     
	<%     
	}      
	%>
	   
    <tr>
        <td colspan="6"><input type="submit" value="更新购物车"></td>
    </tr>
    <tr>
        <td colspan="6">购物车的总价:${totalPrice} 元</td>
    </tr> 
   </table>
  </form>
  	<td><a href="/JavaEE_JspTest/ShoppingServlet?type=clearBook">清空购物车</a></td>
   	<td><a href="">提交订单</a></td>
</body>
</html>