<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>uploadAndDown</title>
<script type="text/javascript">
	function check(){
		var authorName = document.getElementById("authorName").value;
		var fileName = document.getElementById("uploadFile").value;
		if(authorName==""){
			alert("请填写上传用户名");
			return false;
		}
		if(uploadFile.length=0||uploadFile==""){
			alert("请选择上传的文件");
			return false;
		}
		return true;
	}
	
</script>
</head>
<body>
<h2 align="center">文件上传下载</h2>
<div id="main">
	<form action="${pageContext.request.contextPath}/fileUpload"
		method="post" enctype="multipart/form-data" onsubmit="return check()">
		上传用户：<input type="text" id="authorName" name="authorName"/><br/>
		选择文件：<input type="file" id="uploadFile" name="uploadFile" multiple="multiple"/><br/>
		<input type="submit" value="上传"/>
	</form>
</div>

</body>
</html>