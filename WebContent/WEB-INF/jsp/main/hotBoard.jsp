<%@page contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
		
<div><ul>
	<s:iterator value="nhbooks">
	<li >
		<div align="center">
			<a href="${pageContext.request.contextPath}/book/BookView_execute?bid=${bid }" ><img
					src="${pageContext.request.contextPath}/productImages/${picture }" border=0 width="120px" /> </a>
		</div>
		<li class="shuming">
			<a href="${pageContext.request.contextPath}/book/BookView_execute?bid=${bid }" >${bname }</a><a href="#" target="_blank"></a>
		</li>
		<li class="price">
			价格：￥${price }
		</li>
	</li>
	<li class="book_c_xy_long"></li>
	</s:iterator>
</ul>
</div>