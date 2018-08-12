<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>商品详情</title>
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
	              <td width="437" valign="bottom"><font color="green">商品详情</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="436">
	        <tr>
	          <td>
	          	<table width="80%" align="center">
	              <tr height="30" bgcolor="#99FFCC">
	              	 <td width="15%"><span>书名：</span></td>
	              	 <td width="25%"><span>${book.bname }</span></td>
	              	 <td width="15%"><span>作者：</span></td>
	              	 <td width="25%"><span>${book.author }</span></td>
	              </tr>
	              <tr height="30" bgcolor="#CCFFFF">
	              	 <td><span>图片编号：</span></td>
	              	 <td><span>${book.picture }</span></td>
	              	 <td><span>出版社：</span></td>
	              	 <td><span>${book.publishing }</span></td>
	              </tr>
	              <tr height="30" bgcolor="#99FFCC">
	              	 <td><span>出版时间：</span></td>
	              	 <td><span>${book.publish_time }</span></td>
	              	 <td><span>字数：</span></td>
	                 <td><span>${book.word_number }</span></td>
	              </tr>
	              <tr height="30" bgcolor="#CCFFFF">
	              	 <td><span>印刷时间：</span></td>
	              	 <td><span>${book.print_time }</span></td>
	                <td><span>印刷次数：</span></td>
	                <td><span>${book.print_number }</span></td>
	              </tr>
	              <tr height="30" bgcolor="#99FFCC">
	                <td><span>价格：</span></td>
	                <td><span>${book.price }</span></td>
	                <td><span>库存数量：</span></td>
	                <td><span>${book.amount }</span></td>
	              </tr>
	              <tr bgcolor="#CCFFFF">
	                <td><span>内容简介：</span></td>
	                <td colspan="3"><p>${book.description }</p></td>
	              </tr>
	              <tr bgcolor="#99FFCC">
	                <td><span>作者简介：</span></td>
	                <td colspan="3"><p>${book.author_summary }</p></td>
	              </tr>
	              <tr height="30" bgcolor="#CCFFFF">
	                <td><span>所属类别：</span></td>
	                <td colspan="3">
	                <s:iterator value="book.categroySet" id="cat">
	                	<span>${cat.cvalue }</span>&nbsp;
	              	</s:iterator>
	              	</td>
	              </tr>
	              <tr height="50">
	                <td colspan="4" align="center"><a href="HandleProd_toRevProd?id=${book.bid }">
	                <input type="submit" value="修改商品"/></a>&nbsp;
	                <a href="HandleProd_deleteProd?id=${book.bid }"><input type="submit" value="删除"/></a></td>
	                
	              </tr>
	          </table></td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
	</body>
</html>
