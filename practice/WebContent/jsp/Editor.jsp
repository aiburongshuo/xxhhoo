<%@page import="DAO.Clas"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
   
    %>
<!DOCTYPE html >
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>项目管理系统 by www.codefans.net</title>
<link rel="stylesheet" rev="stylesheet" href="css/style.css" type="text/css" media="all" />


<script language="JavaScript" type="text/javascript">
function tishi()
{
  var a=confirm('数据库中保存有该人员基本信息，您可以修改或保留该信息。');
  if(a!=true)return false;
  window.open("冲突页.htm","","depended=0,alwaysRaised=1,width=800,height=400,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}

function check()
{
document.getElementById("aa").style.display="";
}
function delStu() {
	
	alert("修改成功");
	
	}


function link(){
alert('保存成功！');
    document.getElementById("fom").action="xuqiumingxi.htm";
   document.getElementById("fom").submit();
}



</script>
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>



</head>

<body class="ContentBody">
  <form action="Comit" method="post"  >
  <input type="hidden" name="uid" value="${uid}">
<div class="MainDiv">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >学员信息修改</th>
  </tr>
  <!-- <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		<tr><td align="left">
		<input type="button" name="Submit" value="保存" class="button" onclick="alert('保存成功！');"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/>
		</td></tr> -->

		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>修改学员信息</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					 
					  <tr>
					    <td nowrap align="right" width="13%">学员名字：</td>
					    <td width="41%"><input name="name" class="text" style="width:154px" type="text" size="40" />
				        <span class="red"> *</span></td>
					    <td align="right" width="19%">性别:</td>
					    <td width="19%">男<input name="sex"   value="男"  type="radio"/>
					    	女<input name="sex" value="女"  type="radio"/></td>
					    </tr>
					  <tr>
					    <td nowrap align="right">密码:</td>
					    <td><input name="pwd" id="" class="text" style="width:154px" /></td>
					    <td align="right">生日:</td>
					    <td><input name="birthday" id="Input" class="text"  type="date";style="width:154px" /></td>
					  </tr>
					   <tr>
					    <td nowrap align="right">班级:</td>
					    <td><select name="classs"  >
                         <%-- 	 <% 
                         		
                         		List<Clas> ss=(List)request.getAttribute("list");
                         		for(int i=0;i<ss.size();i++){%>
                         			<option value="<%=ss.get(i).getC_id() %>">
                         				<%=ss.get(i).getC_name() %>
                         			
                         			</option>
                         			
                         		<%}
                         	
                         	%> --%>
                          		<c:forEach items="${list}" var="l">
                          		<option value="${l.c_id} ">
                         				${l.c_name}
                         			
                         			</option>
                         		</c:forEach>
                         
                        </select></td>
					    <td nowrap align="right">年龄:</td>
					    <td><input  name="age" class="text" style="width:138px" type="text" size="40"></td>
					  </tr>
					  <tr>
					    <td nowrap align="right" height="120px">学员说明:</td>
					    <td colspan="3"><textarea id="textarea" name="text" rows="5" cols="80"></textarea></td>
					    </tr>
					  </table>
			 <br />
				</fieldset>			</TD>
		</TR>
		
		</TABLE>
	
	
	 </td>
  </tr>
  

		
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="submit" name="Submit" value="修改" class="button"style="margin-left: 400px" />　
			
			<input type="button" name="Submit2" value="返回" class="button" /><span>${mes}</span></TD>
		</TR>
		</TABLE>
	
	
	 </td>
  </tr>
  
  
  
  
  </table>

</div>
</form>
</body>
</html>