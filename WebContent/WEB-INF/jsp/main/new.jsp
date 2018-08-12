<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<h2>
	<span class="more"><a href="${pageContext.request.contextPath}/book/NHList_execute?c=3" target="_blank">更多&gt;&gt;</a> </span>最新上架图书
</h2>
<div class="book_c_04">

	<!--热销图书A开始-->
	<s:iterator value="newbooks">
	<div class="second_d_wai">
		<div class="img">
			<a href="${pageContext.request.contextPath}/book/BookView_execute?bid=${bid }"><img
					src="${pageContext.request.contextPath}/productImages/${picture }" border=0 /> </a>
		</div>
		<div class="shuming">
			<a href="${pageContext.request.contextPath}/book/BookView_execute?bid=${bid }" >${bname }</a><a href="#" target="_blank"></a>
		</div>
		<div class="price">
			价格：￥${price }
		</div>
	</div>
	<div class="book_c_xy_long"></div>
	</s:iterator>
	<!--热销图书A结束-->

</div>
<div class="clear"></div>