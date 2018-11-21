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
<%	
			String b=null;
			Cookie[] c=request.getCookies();
			if(c!=null){
				for(int i=0;i<c.length;i++){
					
					Cookie ci=c[i];
					if("zh".equals(ci.getName())){
						
						b=ci.getValue();
						
					}
					
					
					
				}	
				
				
				
				
				
			}
		
		
		
		%>
	
</head>
<body>
		
		<h1>欢迎<%=b %>登录</h1>
		<a href="cook1">退出登录</a>
		
</body>
</html>