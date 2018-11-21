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

//var xmlhttp;
/* function checkName(name) {
	//1.将name发送到后台去检查
	// 		//构造一个xmlhttprequest请求对象
	if (window.XMLHttpRequest){// code for IE7+, Firefox, Chrome, Opera, Safari
	  xmlhttp=new XMLHttpRequest();
	}else{// code for IE6, IE5
	  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	//指定回调函数
	xmlhttp.onreadystatechange=reback;
	//打开连接 指定提交方式，指定url地址  指定是否异步（true为异步 false同步）
	//js中向后台传中文参数需要转码encodeURI('张三')
	xmlhttp.open("post","checkName?name="+encodeURI(name),true);
	//设置传参方式为表单提交
	xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	//发送请求
	xmlhttp.send();
}


	
//3.js前台获取后台的响应并且刷新网页
function reback() {
	//xmlhttp.readyState状态是请求发送的完成状态   xmlhttp.status是页面响应正常的状态
	if (xmlhttp.readyState==4 && xmlhttp.status==200){
		//xmlhttp.responseText获取后台输出的信息
		if(xmlhttp.responseText=="true"){
			document.getElementById("err").style.color="red";
			document.getElementById("err").innerHTML="用户名已被占用";
		}else {
			document.getElementById("err").style.color="green";
			document.getElementById("err").innerHTML="用户名可用";
		}
	}
}
 */

 $(document).ready(function(){
	 
	 $("#uname").blur(function () {
		 $.post("checkName?name="+encodeURI($("#uname").val()),function(data){
			   console.log(data);
			if(data=="true"){
					$("#err").css("color","red");
					$("#err").html("用户名已被占用");
				
			}else{
				
				$("#err").css("color","blue");
				$("#err").html("用户可用");
			}
			 
			 
			 
		 })
		
	})
	 
	 
	
})



</script>




</head>
<body>
	<form action="">
		      		用户名<input  id="uname" ><span id="err"></span><br>
		    	 	密码:<input><br>
					<input type="submit" value="注册">
	
	
	</form>



</body>
</html>