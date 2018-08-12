<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<h2>
	编辑推荐
</h2>
<div id=__bianjituijian/danpin>
	<div class=second_c_02>
	
	<s:iterator value="rebooks">
		<div class=second_c_02_b1>
			<div class=second_c_02_b1_1>
				<a href="${pageContext.request.contextPath}/book/BookView_execute?bid=${bid }" title='${bname }'><img src="${pageContext.request.contextPath}/productImages/${picture }" width=70 border=0 /> </a>
			</div>
			<div class=second_c_02_b1_2>
				<h3>
					<a href="${pageContext.request.contextPath}/book/BookView_execute?bid=${bid }" title='${bname }'>书名:${bname }</a>
				</h3>
				<h4>
					作者：${author } 著
					<br />
					出版社：${publishing }&nbsp;&nbsp;&nbsp;&nbsp;出版时间：${publish_time }
				</h4>
				<h5>
					版次:${print_number }
				</h5>
				<h6>
					价格：￥${price }
				</h6>
				<div class=line_xx></div>
			</div>
		</div>
		</s:iterator>
		
	</div>
</div>
