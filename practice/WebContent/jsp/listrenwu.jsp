<%@page import="Pojo.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
   
    %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html >
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>项目管理系统 by www.codefans.net</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.tabfont01 {	
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}
.font051 {font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}
.font201 {font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}
.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}
html { overflow-x: auto; overflow-y: auto; border:0;} 
-->
</style>

<link href="css/css.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript">

</script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<SCRIPT language=JavaScript>
function sousuo(){
	window.open("gaojisousuo.htm","","depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

function unselectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}


function delStu(id) {
	if(confirm("确认要删除该信息吗？")){
		window.location.href="delete?id="+id;
	}
}


function link(){
    document.getElementById("fom").action="addrenwu.htm";
   document.getElementById("fom").submit();
}

</SCRIPT>

<body>
<form  method="post" >
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  
  <tr>
    <td height="30">      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62" background="images/nav04.gif">
            
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
			  <td width="21"><img src="images/ico07.gif" width="20" height="18" /></td>
			  <td width="538">查看内容：按时间：
<input name="textfield" type="text" size="12" readonly="readonly"/>
<span class="newfont06">至</span>
<input name="textfield" type="text" size="12" readonly="readonly"/>
<input name="Submit4" type="button" class="right-button02" value="查 询" /></td>
			   <td width="144" align="left"><a href="#" onclick="sousuo()">
			     <input name="Submit3" type="button" class="right-button07" value="高级搜索" />
			   </a></td>	
		    </tr>
          </table></td>
        </tr>
    </table></td></tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
          	 <tr>
               <td height="20"><span class="newfont07">选择：<a href="#" class="right-font08" onclick="selectAll();">全选</a>-<a href="#" class="right-font08" onclick="unselectAll();">反选</a></span>
	              <input name="Submit" type="button" class="right-button08" value="删除所选任务" />
	              <input name="Submit2" type="button" class="right-button08" value="添加任务" onclick="link();"/></td>
          	 </tr>
              <tr>
                <td height="40" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    	<td height="22" colspan="8" align="center" style="font-size:16px">学员详细列表</td>
                  </tr>
                  <tr bgcolor="#EEEEEE">
				    <td width="4%" align="center" height="30">选择</td>
                    
					<td width="10%">学员姓名</td>
                    <td width="10%">学员密码</td>
					<td width="10%">学员性别</td>
					<td width="5%">学员年龄</td>
					<td width="5%">学员班级</td>
				 	<td width="5%">学员生日</td>
					<td width="12%">操作</td>
					
					
                  </tr>
                  
                   <%--  <%
                    	List<Student> ll=(List)request.getAttribute("list");
                    	for(int i=0;i<ll.size();i++){ %>
                    		<tr bgcolor="#FFFFFF">
				    		<td height="20"><input type="checkbox" name="delid"/></td>
                    		<td><%=ll.get(i).getStuName() %></td>
                            <td><%=ll.get(i).getStuPwd() %></td>
                            <td><%=ll.get(i).getStuSex() %></td>
                            <td><%=ll.get(i).getStuAge() %></td>
                            <td><%=ll.get(i).getC_id() %></td>
                            <td><%=ll.get(i).getStuBirthday() %></td>
                            <td><a href="Edit?uid=<%=ll.get(i).getStuId()%>" >编辑|</a>
        					<a href="javascript:delStu(<%=ll.get(i).getStuId()%>)">删除</a></td>
                    	</tr>
                    	<%
                    	}
                    %> --%>
                    	<c:forEach items="${pb.list}" var="t" >
                    		<tr bgcolor="#FFFFFF">
				    		<td height="20"><input type="checkbox" name="delid"/></td>
                    		<td>${t.stuName}</td>
                            <td>${t.stuPwd}</td>
                            <td>${t.stuSex}</td>
                            <td>${t.stuAge}</td>
                            <td>${t.c_id}</td>
                           	  <td>${t.stuBirthday}"</td>
                            <td><a href="Edit?uid=${t.stuId}">编辑|</a>
        					<a href="javascript:delStu(${t.stuId})">删除</a></td>
                    	</tr>                    	                    	                    	                    	                       	
                    	</c:forEach>
                    
                    
                                      				
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <td width="50%">共 <span class="right-text09">${pb.totalPage}</span> 页 | 第 <span class="right-text09">${pb.pageIndex }</span> 页</td>
                <td width="49%" align="right">[<a href="selectsut" class="right-font08">首页</a> | <c:if test="${pb.pageIndex!=1}"><a href="selectsut?index=${pb.pageIndex-1}" class="right-font08">上一页</a> </c:if>|<c:if test="${pb.pageIndex!=pb.totalPage}"> <a href="selectsut?index=${pb.pageIndex+1}" class="right-font08">下一页</a> </c:if>| <a href="selectsut?index=${pb.totalPage}" class="right-font08">末页</a>] 转至：</td>
                <td width="1%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="1%"><input name="textfield3" type="text" class="right-textfield03" size="1" /></td>
                      <td width="87%"><input name="Submit23222" type="submit" class="right-button06" value=" " />
                      </td>
                    </tr>
                </table></td>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>