<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>用户详情</title>
		<meta http-equiv="content-type" content="text/html;charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/global.css">
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
	              <td width="437" valign="bottom"><font color="green">用户详情</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="436">
	        <tr>
	          <td height="243">
	            <div align="center">
	              <table width="600">
	              	<tr height="30">
	              	  <td align="right"><span>用户名：</span></td>
	              	  <td align="center"><span>${user.username }</span></td>
	              	  <td align="right"><span>注册时间：</span></td>
	              	  <td align="center"><span>${user.reg_time }</span></td>
	              	</tr>
	              	<tr height="30">
	              	  <td align="right"><span>最后一次登录时间：</span></td>
	              	  <td align="center"><span>${user.last_login_time }</span></td>
	              	  <td align="right"><span>最后一次登录地址：</span></td>
	              	  <td align="center"><span>${user.last_login_ip }</span></td>
	              	</tr>
	              	<tr>
	              	  <td colspan="4" align="left">
	              	  	<div  style="font-weight:bold; height:30"><span>买过的书籍：</span></div>
	              	  	<table width="100%">
		              	  <tr bgcolor="#99FFFF">
		              	  	<th><span>书名：</span></th>
		              	  	<th><sapn>购买时间：</sapn></th>
		              	  	<th><sapn>购买数量：</sapn></th>
		              	  </tr>
		              	  <s:iterator value="scss" id="scs" status="st">
		              	  <s:if test="#st.odd"><tr bgcolor="#99FFCC"></s:if>
		              	  <s:else><tr bgcolor="#CCFFFF"></s:else>
		              	  	<td align="center"><span>${scs.sellBook }</span></td>
		              	  	<td align="center"><span>${scs.sellTime }</span></td>
		              	  	<td align="center"><span>${scs.buyAmount }</span></td>
		              	  </tr>
		              	  </s:iterator>
	              	  </table></td>
	              	</tr>
	              </table>
	            </div>
	          </td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
	</body>
</html>
