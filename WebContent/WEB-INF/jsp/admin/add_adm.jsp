<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>新增管理员</title>
		<meta http-equiv="content-type" content="text/html;charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/global.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/addadm.js"></script>
	</head>

	<body>
		<table id="table1">
	  <tr>
	    <td align="center">
	    	<%@include file="/WEB-INF/jsp/admin/top.jsp" %>
			<table id="table2">
	        <tr>
	          <td valign="top"><table width="494">
	            <tr>
	              <td width="45" height="25">&nbsp;</td>
	              <td width="437" valign="bottom"><font color="green">新增管理员</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="436">
	        <tr>
	          <td height="243">
		          <table width="547" align="center">
	          	 <tr>
	          	  <td>
	          		<form action="Admin_add" method="post">
	          			<table width="55%" align="center" cellpadding="1" cellspacing="1">
	          			 <tr>
	          			  <th width="30%" hight="50"><div align="right">用户名：</div></th>
	          			  <td width="70%"><input name="admin.name" id="txtname" type="text"><br>
	          			  	<span id="nameinfo" style="color:red;font-size:2px;"></span></td>
	          			 </tr>
	          			 <tr>
	          			  <th hight="30"><div align="right">密&nbsp;码：</div></th>
	          			  <td width="183"><input name="admin.password" id="txtpassword" type="password"><br>
	          			  	<span id="passwordinfo" style="color:red;font-size:2px;"></span></td>
	          			 </tr>
	          			 <tr>
	          			  <th hight="30"><div align="right">确认密码：</div></th>
	          			  <td width="183"><input name="rePassword" id="txtrepassword" type="password"><br>
	          			  	<span id="repasswordinfo" style="color:red;font-size:2px;"></span></td>
	          			 </tr>
	          			</table>
	          			<br>
	          			  <div align="center">
		          			<input type="submit" id="addAdmsbm" name="Submit1" value="保存">
	              		<input type="reset" name="Submit2" value="重置"><br>
	              		<span style="color:red;font-size:2px;">${add_error }</span>
		              	  </div>
	          		</form>
	          	  </td>
	          	 </tr>
	          	</table>
	          </td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
	</body>
</html>
