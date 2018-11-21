<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
   
    %>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript"  src="js/jquery-3.2.1.js"></script>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		$(document).ready(function () {
			$("#d1").click(function () {
				$.post("json",function(data){
					$.each(data,function(i,u){
						if($("#p").html()==""){
							
					$("<p>"+u.uname+"</p>").appendTo("#p");
						}		
					})
					
						$("#p").fadeToggle(3000);
					
				})
				
			})
			
			
			
		})
		


</script>
</head>
<body>
		<form action="Login" method="post">
		
			用户名:<input name="name"  type="text" ><br/>
			密码    :<input name="pwd"  type="password"><br/>  
			日期    :<input name="dat" type="date">			
					<button > 登录 </button>	
		</form>
		<div>
		
			<a href="shaonian">我也不知道是啥东西</a><br/>
		
			${MESS.uname}
		</div>
		<div>
		
			<a href="mav">看一看，瞧一瞧</a><br/>
		
			${mess.my_time}
		</div>
		
		<div>
		
			<a href="re">看一看，瞧一瞧</a><br/>
		
			${sessionScope.nel.uname}
			
			
		</div>
		
		<div >
		
			<button id=d1 style="color: red;">路过的勇士过来瞧一瞧</button><br/>
		
			<p id=p></p>
			
		</div>
		<div >			
		
			<form action="upload" method="post"enctype="multipart/form-data">
		
			请选择文件:<input name="file"  type="file" ><br/>
			   描述:<input name="miaoshu"  type="text"><br/>  
					<button > 上传 </button>	
		</form>
		</div>
		
</body>
</html>