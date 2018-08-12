<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>商品修改</title>
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
	              <td width="437" valign="bottom"><font color="green">商品修改</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="436">
	        <tr>
	          <td align="center">
	          	<table width="200" height="150">
	          	<tr>
	          	  <td><img src="${pageContext.request.contextPath}/images/admin/ok.gif" width="25" height="25"></td>
	          	  <td><span>修改成功！</span><br><a href="HandleProd_toProd?id=${book.bid }">查看详情</a></td>
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