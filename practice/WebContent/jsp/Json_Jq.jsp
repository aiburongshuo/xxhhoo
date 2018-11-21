<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
   
    %>
<!DOCTYPE html >
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.2.1.js" type="text/javascript"></script>
<script type="text/javascript">

	$(document).ready(function () {
		$("button").click(function() {
			$.post("Jsonservlet",function(data){
					//JSON.parse()方法 把  字符串转化为对象
				$.each(JSON.parse(data),function(i,stu){
					$("<tr><td>"+stu.stuId+"</td><td>"+stu.stuName+"</td><td>"+stu.stuSex+"</td><td>"+stu.stuAge+"</td></tr>").appendTo("table");
				});
				$("table").fadeIn(3000);
				
				
			})
			
		})
	})





</script>
</head>

<body>
		<div   style="width: 700px;margin: 0 auto; height: 700px;">
			<button>查看学生信息</button>
	
		<table style="width: 600px; display: none;"></table>
	
	</div>
	



</body>
</html>