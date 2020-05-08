<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="js/jquery-1.11.3.min.js"></script>
<title>json</title>

<script>
   $(document).ready(function(){   
	   $("#mybutton").click(function(){
		
      $.ajax({
       type:"POST",
       contentType:"application/json;charset=utf-8",
       url:"getAllEmployee",      
       dataType:"json",   
       success:function(emp){   
    	   console.log(emp);
    	   var table = '<table style="border:1px solid"><tr><th>id</th><th>姓名</th><th>性别</th></tr>';
           for(var i = 0; i < emp.length; i++){
                 table += '<tr><td>'+emp[i].empId+'</td><td>'+emp[i].empName+'</td><td>'+emp[i].empGender+'</td></tr>';
           }
           table += '</table>';
           $("#showtab").append(table);       
       },
       error:function(e){
         console.log(e.status)
       }
      });
      });
   });
</script>
</head>
<body>	
<div id="showtab"></div>
 <button id="mybutton">ajax测试</button>
		
</body>
</html>
