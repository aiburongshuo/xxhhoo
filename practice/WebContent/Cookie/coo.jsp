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
</head>
	<%
		 Cookie[] cc=request.getCookies();
		if(cc!=null){
		for(int i=0;i<cc.length;i++){
			Cookie c1=cc[i];
			if("pwd".equals(c1.getName())){
				response.sendRedirect("Cookie/cooki.jsp");
				
			}
			
			
		}
	
		}
	
	%>



<body>
		<form action="cook" method="post" >
				账号-- <input name="zh"><br>
				密码--<input name="pwd" type="password"><br>
				记住密码<input type="radio" name="jz" value="是">是
								<input type="radio" name="jz" value="否">否
						<br>
			<input  type="submit" value="提交">
		
		
		
		</form>



</body>
</html>