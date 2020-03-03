<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del(){
		return window.confirm("真的要删除该用户吗？");
	}
<%--	
    function select_all(){
        var myselect = document.getElementsByName("myselect");
        var mycheck = document.getElementById("all");
        if(mycheck.checked == false){
            for(var i = 0;i< myselect.length;i++){
                myselect[i].checked = false;
            }
        }else{
            for(var i = 0;i< myselect.length;i++){
                myselect[i].checked = true;
            }
        }
    }  


$(function(){
        $("#mybtn").click(function(){
            var statu = confirm("确认删除选中项！");
            if(!statu)//如果点击的是取消
            {      
            	return false;//返回页面     
            }else{//如果点击确定，继续执行下面的操作
                    $("#doSubmit").click()
            }
            });
        })
--%>
</script>

</head>

<body>

<h1>欢迎<font color="red">${username}</font>登录</h1>
<button type="button" onclick="window.location.href='userAdd.jsp'" >添加用户</button>
<table border=1 cellspacing=0>
		<tr><th>id</th><th>用户名</th><th>密码</th><th>等级</th><th>邮箱</th><th>操作</th></tr>
	<c:forEach items="${allUser}" var="user">
	<tr>
		<td>${user.id}</td>
		<td>${user.username}</td>
		<td>${user.password}</td>
		<td>${user.grade}</td>
		<td>${user.email}</td>
		<td><a onclick="return del()" href="UserServlet?type=delete&id=${user.id}">删除</a>&nbsp;&nbsp;<a href="#">编辑</a></td>
	</tr>
	</c:forEach>
</table>

<%-- 
<buttontype="button" id="mybtn" class="btn btn-primary" onclick="deleteBySelected();" >批量删除</button>

<form id="form" class="form-inline">
    <div class="form-group">
         <input type="text" class="form-control"placeholder="关键字">
         <button type="button" class="btnbtn-primary" >查询</button>
    </div>
 </form>
  <hr/>
  
 <form action="UserServlet?type=delBySelected"method="post">

<h1>欢迎<font color="red">${username}</font>登录</h1>

<table class="tabletable-hover">
        <tr class="info">
          <th><input type="checkbox" id="all" onclick="select_all()"/>全选</th>
           <th>id</th><th>用户名</th><th>密码</th><th>等级</th><th>邮箱</th><th>操作</th>
       </tr>
<c:forEach items="${allUsers }" var="user">
    <tr>                           
        <td><input type="checkbox" name="myselect" value="${user.id}"/></td>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.grade}</td>
        <td>${user.email}</td>
        <td><a onclick = "returndel()"href="UserServlet?type=delete&id=${user.id}">删除</a>&nbsp;&nbsp;<a href="#">编辑</a></td>
    </tr>
</c:forEach>
</table>

    <input type="submit" value="aaa" id="doSubmit" style="display:none"/>

 </form>
--%>

</body>
</html>