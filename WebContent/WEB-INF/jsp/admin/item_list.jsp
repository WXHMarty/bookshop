<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>订单列表</title>
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
	              <td width="437" valign="bottom"><font color="green">订单列表</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="436" align="center">
	        <tr bgcolor="#CCFFFF">
	          <th align="center"><span>序号</span></th>
	          <th align="center"><span>订单编号</span></th>
	          <th align="center"><span>订单价格</span></th>
	          <th align="center"><span>邮寄地址</span></th>
	          <th align="center"><span>下单时间</span></th>
	        </tr>
	        <s:iterator value="items" id="it" status="st">
	        <s:if test="#st.odd"><tr bgcolor="#99FFCC"></s:if>
	        <s:else><tr bgcolor="#CCFFFF"></s:else>
	          <td align="center"><s:property value="#st.count"/>.</td>
	          <td align="center"><a href="admin/ItemDetail_toItem?id=${it.oid}">${it.ord_num }</a></td>
	          <td align="center"><span>${it.total_price }</span></td>
	          <td align="center"><span>${it.address }</span></td>
	          <td align="center"><span>${it.order_time }</span></td>
	        </tr>
	        </s:iterator>
	        <tr>
	          <td colspan="5">
	          	<div align="center">
		              <s:if test="page>1">
						<span class='list_r_title_text3a'>
							<a name=link_page_next
								href="ItemDetail_toItList?page=1">&nbsp;
							首页</a>
							<a name=link_page_next
								href="ItemDetail_toItList?page=${page-1}">
							上一页</a>
						</span>&nbsp;
						</s:if>
						<s:else>
						<span class='list_r_title_text3a'>首页&nbsp;上一页</span>&nbsp;
						</s:else>
							
						<span class='list_r_title_text3b'>
							第${page }页/共${maxPage }页
						</span>&nbsp;
							
						<s:if test="page < maxPage">
						<span class='list_r_title_text3a'>
							<a name=link_page_next
								href="ItemDetail_toItList?page=${page+1}">
								下一页</a>&nbsp;
							<a name=link_page_next
								href="ItemDetail_toItList?page=${maxPage }">
								尾页</a>
						</span>&nbsp;
						</s:if>
			
						<s:else>
						<span class='list_r_title_text3a'>下一页&nbsp;尾页</span>
						</s:else>
		              </div>
	          </td>
	        </tr>
	      </table>
	      
	    </td>
	  </tr>
	</table>
	</body>
</html>
	       