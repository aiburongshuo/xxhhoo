<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
   
    %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div  style="margin: 0 auto; width: 700px;">
			<table>
			<thead >
			<th>编号&nbsp</th>
			<th>文件名字&nbsp</th>
			<th>描述&nbsp</th>
			<th>操作&nbsp</th>
			</thead>			
			<c:forEach items="${list}" var="li">
				<tr >
				<td>${li.fid}</td>
				<td>${li.fname}</td> 
				<td>${li.fmaoshu}</td>
				<td><a href="Downfilesload?fid=${li.fid}">下载</a></td>
				</tr>	
						
			</c:forEach>
			</table>
				
		</div>
		
</body>
</html>