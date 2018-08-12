<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>订单处理</title>
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
	              <td width="437" valign="bottom"><font color="green">订单处理</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="436">
	        <tr>
	          <td align="center">
	          	<div align="center">
	          	  <table width="550" align="center">
	          	 	<tr bgcolor="#99FFCC"><th width="150" align="right"><span>订单编号：</span></th><td width="400" align="center"><span>${item.ord_num }</span></td></tr>
	          	 	<tr bgcolor="#CCFFFF"><th align="right"><span>订单内容：</span></th><td  align="center"><table><tr><td>
	          	 	  <s:iterator value="item.ordits" id="ordit">
	          	 	  	<tr>
	          	 	  	  <td width="100"><span>产品名称：</span></td><td width="130"><span>${ordit.proname }</span></td>
	          	 	  	  <td width="100"><span>产品数量：</span></td><td width="50"><span>${ordit.pro_num }</span></td>
	          	 	  	</tr>
	          	 	  </s:iterator></td></tr></table></td>
	          	 	</tr>
	          	 	<tr bgcolor="#99FFCC"><th align="right"><span>订单价格：</span></th><td align="center"><span>${item.total_price }</span></td></tr>
	          	 	<tr bgcolor="#CCFFFF"><th align="right"><span>收货人名字：</span></th><td align="center"><span>${item.receive_name }</span></td></tr>
	          	 	<tr bgcolor="#99FFCC"><th align="right"><span>收货地址：</span></th><td align="center"><span>${item.address }</span></td></tr>
	          	 	<tr bgcolor="#CCFFFF"><th align="right"><span>邮政编码：</span></th><td align="center"><span>${item.zipCode }</span></td></tr>
	          	  </table><br><br>
	          	  <hr>
	          	  <a href="ItemDetail_doItem?id=${item.oid }"><input type="button" value="处理订单"></a>&nbsp;
	          	  <a href="ItemDetail_toItList"><input type="button" value="反回列表"></a>
	          	</div>
	          </td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
	</body>
</html>