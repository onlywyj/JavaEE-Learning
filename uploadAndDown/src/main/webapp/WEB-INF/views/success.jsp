<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>文件管理</title>
<style>
			.define-table{
				border-collapse:collapse;
				border-spacing:0;
				border-left:1px solid #888;
				border-top:1px solid #888;
			}
			.define-table th,.define-table td{
				border-right:1px solid #888;
				border-bottom:1px solid #888;
				padding:5px 15px;
			}
			.define-table th{
				font-weight:bold;background:#ccc;
			}	
			#nav{
				width:1650px;
				height:70px;
				background:#CCCCCC;
				color:#002FF2;
				margin-bottom:40px;
				
			}
			
</style>
<script type="text/javascript">
		function deleteFile(){			
			var msg="真的要删除该文件吗？";
			if(confirm(msg)==true)
			{
				return true;
			}
			else
			{
				return false;
			}			
		}

</script>

</head>
<body>
<center><h2>文件列表</h2></center>
<div id="nav">
	<p>剩余空间：35G    已用空间：1G</p>
	<h4>欢迎<font color="#F78B1B">admin</font>使用</h4>
</div>
	<center>
	<table class="define-table">
		<tr><th>上传用户名</th><th>文件名</th><th>文件大小</th><th>删除</th><th>下载</th></tr>
		<c:forEach items="${requestScope.allFile}" var="file">
		<tr>
			<td>${file.authorname}</td>
			<td>${file.filename}</td>
			<td>${file.filesize}</td>
			<td><a href="${pageContext.request.contextPath}/delete?id=${file.id}" onclick="return deleteFile();">删除</a></td>
			<td><a href="${pageContext.request.contextPath}/downLoad?filename=${file.filename}">下载</a></td>
		</tr>
		</c:forEach>
	</table>
	</center>			 
			
</body>
</html>