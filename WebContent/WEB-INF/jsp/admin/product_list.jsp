<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>商品列表</title>
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
	              <td width="437" valign="bottom"><font color="green">商品列表</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="436">
	        <tr>
	          <td height="243">
	            <div align="center">
	              <div>
	              	<form action="HandleProd_toProd" method="post">
	              		<span>请输入书名检索：</span>
	              		<input name="book.bname" type="text">&nbsp;
	              		<input type="submit" value="检索">
	              	</form>
	              </div>
	              <div>
		              <div>
		              	<table width="60%" align="center">
			              <s:iterator value="books" id="b" status="st">
			              	<s:if test="#st.odd"><tr height="30" bgcolor="#99FFCC"></s:if>
			              	<s:else><tr height="30" bgcolor="#CCFFFF"></s:else>
			              	  <td><s:property value="#st.count"/>.</td>
			              	  <td>书名：</td>
			              	  <td><span>${b.bname }</span></td>
			              	  <td>作者：</td><td><span>${b.author }</span></td>
				              <td><a href="HandleProd_toProd?id=${b.bid }">详细信息</a></td>
				              <td><a href="HandleProd_deleteProd?id=${b.bid }">删除</a></td>
			              	</tr>
			              
			              </s:iterator>
			            </table>
		              </div><br>
		              <div align="center">
		              <s:if test="page>1">
						<span class='list_r_title_text3a'>
							<a name=link_page_next
								href="HandleProd_toupAndDe?page=1">&nbsp;
							首页</a>
							<a name=link_page_next
								href="HandleProd_toupAndDe?page=${page-1}">
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
								href="HandleProd_toupAndDe?page=${page+1}">
								下一页</a>&nbsp;
							<a name=link_page_next
								href="HandleProd_toupAndDe?page=${maxPage }">
								尾页</a>
						</span>&nbsp;
						</s:if>
			
						<s:else>
						<span class='list_r_title_text3a'>下一页&nbsp;尾页</span>
						</s:else>
		              </div>
		         </div>
	            </div>
	          </td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
	</body>
</html>
