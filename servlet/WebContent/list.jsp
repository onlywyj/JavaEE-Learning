<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据展示</title>
	<!-- 引入bootstrap核心 CSS文件  本地方式-->
	<link href="bootstrap_plugins/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    
<script type="text/javascript">
	function del(){
		return window.confirm("真的要删除该用户吗？此操作不可恢复!");
	}
	//全选和批量删除
    function select_all(){
    	var mycheck = document.getElementById("all");
		var myselect = document.getElementsByName("myselect");
        if(mycheck.checked == false){
            for(var i = 0;i<myselect.length;i++){
                myselect[i].checked = false;
            }
        }else{
            for(var i = 0;i<myselect.length;i++){
                myselect[i].checked = true;
            }
        }
    }  
	
	function deleteBySelected(){
		var deleteId = [];
        var names = document.getElementsByName("myselect");            
        var flag = false ;//标记判断是否选中一个                 
        for(var i=0;i<names.length;i++){  
            if(names[i].checked){ 
            	alert("真的要删除该用户吗？此操作不可恢复!");         	
                    flag = true ;  
                    break ;  
             }  
         }
        if(flag){
        	for(var i=0;i<names.length;i++){
        		if(names[i].checked){
        			
        			deleteId.push(names[i].value);
        			
        		}
        		
        	}       		      	
        	window.location.href="UserServlet?type=delBySelected&myselect="+deleteId;
        }else if(!flag){  
            alert("请最少选择一项！");  
            return false ;  
         }		
	}
	
</script>

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
		<h2 style="text-align:center">用户信息一览</h2>
		<hr/>
		
	 	<form class="form-horizontal" action="UserServlet?type=delBySelected" method="post">
		<div class="col-md-12 column">
			<button type="button" class="btn btn-success" onclick="window.location.href='userAdd.jsp'" >添加用户</button>
			<button type="button" id="btn_del" class="btn btn-warning" onclick="deleteBySelected();" >批量删除</button>
			<hr/>
			<table class="table table-bordered">
				<thead>
					<tr class="info">
					<th><input type="checkbox" id="all" onclick="select_all()"/>全选</th>
					<th>id</th><th>用户名</th><th>密码</th><th>等级</th><th>邮箱</th><th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allUser}" var="user">
					<tr>
						<td><input type="checkbox" name="myselect" value="${user.id}"/></td>
						<td>${user.id}</td>
						<td>${user.username}</td>
						<td>${user.password}</td>
						<td>${user.grade}</td>
						<td>${user.email}</td>
						<td>
						<a href="UserServlet?type=delete&id=${user.id}">
							<button type="button" class="btn btn-default btn-warning" onclick="return del()">删除</button>
						</a>
						<a href="UserServlet?type=userModify&id=${user.id}">
							<button type="button" class="btn btn-default btn-info" >编辑</button>
						</a>
						</td>
						<!--  <td><a onclick="return del()" href="UserServlet?type=delete&id=${user.id}">删除</a>&nbsp;&nbsp;<a href="UserServlet?type=userModify&id=${user.id}">编辑</a></td>-->
					</tr>
					</c:forEach>
				</tbody>
			</table>
			 <input type="submit" value="aaa" id="doSubmit" style="display:none"/>
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