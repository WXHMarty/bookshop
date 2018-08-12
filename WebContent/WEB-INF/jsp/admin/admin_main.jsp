<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>管理员主页</title>
		<meta http-equiv="content-type" content="text/html;charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/global.css">
	</head>

	<body>
		<table id="table1">
	  <tr>
	    <td align="center">
	    	<%@include file="/WEB-INF/jsp/admin/top.jsp" %>
			<table align="center" id="table2">
	        <tr>
	          <td valign="top"><table width="494">
	            <tr>
	              <td width="45" height="25">&nbsp;</td>
	              <td width="437" valign="bottom"><font color="green">首页</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="436">
	        <tr>
	          <td height="243"><table width="547" align="center">
	            <tr align="center"><!-- 新增管理员 --><!-- 处理订单 -->
	              <td width="261" height="100"><a href="Admin_toAddAdm"><img src="../images/admin/main1.gif" width="175" height="33" border="0"></a></td>
	              <td width="274"><a href="ItemDetail_toItList"><img src="../images/admin/main2.gif" width="175" height="33" border="0"></a></td>
	            </tr>
	            <tr align="center"><!-- 新增商品 --><!-- 商品列表 -->
	              <td height="100"><a href="HandleProd_toAddPro"><img src="../images/admin/main3.gif" width="175" height="33" border="0"></a></td>
	              <td><a href="HandleProd_toupAndDe"><img src="../images/admin/main4.gif" width="175" height="33" border="0"></a></td>
	            </tr>
	            <tr align="center"><!-- 销售统计 --><!-- 用户查询 -->
	              <td height="100"><a href="ProdSellCensus_toSellBList"><img src="../images/admin/main5.gif" width="175" height="33" border="0"></a></td>
	              <td><a href="UserDeal_tousList"><img src="../images/admin/main6.gif" width="175" height="33" border="0"></a></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
	</body>
</html>
