<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="bootstrap_plugin/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="mycss/mycss.css">
<script src="bootstrap_plugin/js/jquery.min.js"></script>
<script src="bootstrap_plugin/js/bootstrap.js"></script>
<title>人力资源管理系统</title>
</head>
<body>
	<div class="container-fluid">
			<div class="col-md-8">
				<div class="table-responsive">
					<!--显示员工表格 -->
					<!-- 以下是table内容 -->
					<table class="table table-border">
					<thead>
						<tr>
							<td><input type="checkbox" />全选</td>
							<th>员工id</th>
							<th>员工姓名</th>
							<th>性别</th>
							<th>密码</th>
							<th>员工等级</th>
							<th>邮箱</th>
							<th>部门</th>
							<th>操作</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach items="${requestScope.employee.recordList}" var="emp">
							<tr>
								<td><input type="checkbox" name="myselect" value="" /></td>
								<td>${emp.empId}</td>
								<td>${emp.empName}</td>
								<td>${emp.empGender}</td>
								<td>******</td>
								<td>${emp.empGrade}</td>
								<td>${emp.empEmail}</td>
								<td>11111</td>
								<td><a onclick="return del()" href="#">删除 </a>&nbsp;&nbsp;<a
									href="#">编 辑</a></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
					<!-- table结束-->
				</div>
			</div>
			<!-- 分页-->
			<div class="row" id="page">
				<div class="col-md-4 col-md-offset-8">
					<nav aria-label="Page navigation">
					<ul class="pagination">
						<li><a href="#" aria-label="Previous"> 
						<span aria-hidden="true">&laquo;</span></a></li>
						<c:forEach begin="${requestScope.employee.beginPageIndex}"
							end="${requestScope.employee.endPageIndex}" var="i">
							<li><a href="getAllEmployee?currentPage=${i}">${i}</a></li>
						</c:forEach>
						<li><a href="#" aria-label="Next"> 
						<span aria-hidden="true">&raquo;</span></a></li>
					</ul>
					</nav>
				</div>
			</div>
			<!-- 分页结束-->
		</div>
	</div>
	<!-- mainbody结束 -->
</body>
</html>