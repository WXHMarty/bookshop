<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c1" uri="http://www.hynu.com.cn/mytag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>网上书店</title>
		<script type="text/javascript" src="../js/prototype-1.6.0.3.js">
		</script>
		<link href="${pageContext.request.contextPath}/css/book.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/second.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/list.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/book.list.js"></script>
	</head>
	<body>
		&nbsp;

		<!-- 头部开始 -->
		<%@include file="/common/head.jsp"%>
		<!-- 头部结束 -->

		<div class='your_position'>
			您现在的位置:&nbsp;
			<a href="${pageContext.request.contextPath}/book/Style_execute">网上书屋</a> &gt;&gt;<span>${cat.cvalue }&nbsp;
				(<span>${totalnum }</span>)</span>
			<font style='color: #cc3300'><strong></strong> </font>
		</div>

		<div class="book">

			<!--中栏开始-->
			<div class="book_center" style="width:540px;padding:10px 15px 0px 0px;float:left;margin-left:100px">

				<!--图书列表开始-->
				<div id="divRight" class="list_right">

					<div id="book_list" class="list_r_title">
						<div class="list_r_title_text">
							
						</div>
						<div id="divTopPageNavi" class="list_r_title_text3">

							<!--分页导航开始-->
							<s:if test="page>1">
							<div class='list_r_title_text3a'>
								<a name=link_page_next
									href="NHList_execute?c=${c }&page=${page-1}">
								<img src='${pageContext.request.contextPath}/images/page_up.gif' /> </a>
							</div>
							</s:if>
							<s:else>
							<div class='list_r_title_text3a'>
								<img src='${pageContext.request.contextPath}/images/page_up_gray.gif' />
							</div>
							</s:else>
							
							<div class='list_r_title_text3b'>
								第${page }页/共${maxPage }页
							</div>
							
							<s:if test="page < maxPage">
							<div class='list_r_title_text3a'>
								<a name=link_page_next
									href="NHList_execute?c=${c }&page=${page+1}">
									<img src='${pageContext.request.contextPath}/images/page_down.gif' /> </a>
							</div>
							</s:if>
			
							<s:else>
							<div class='list_r_title_text3a'>
								<img src='${pageContext.request.contextPath}/images/page_down_gray.gif' />
							</div>
							</s:else>

							<!--分页导航结束-->
						</div>
					</div>
					
					<!--商品条目开始-->
						
						<div class="list_r_line"></div>
						<s:iterator value="books" var="b">
						<div class="clear"></div>
						
						<div class="list_r_list">
							<span class="list_r_list_book"><a name="link_prd_img" href='BookView_execute?bid=${b.bid }'>
								<img src="${pageContext.request.contextPath}/productImages/${b.picture }" /> </a> </span>
							<h2>
								<a name="link_prd_name" href='BookView_execute?bid=${b.bid }'>${b.bname }</a>
							</h2>
							<h3>
								库存数量：${b.amount}
							</h3>
							<h4 class="list_r_list_h4">
								作 者：
								<a href='#' name='作者'>${b.author }</a>
							</h4>
							<h4>
								出版社：
								<a href='#' name='出版社'>${b.publishing }</a>
							</h4>
							<h4>
								出版时间：${b.publish_time }
							</h4>
							<h5>
									
							</h5>
							<div class="clear"></div>
							<span class="list_r_list_button"> 
							<a href="<%=request.getContextPath() %>/cart/cartBuy?id=${b.bid }"> 
							<img src='${pageContext.request.contextPath}/images/buttom_goumai.gif' /> </a></span>
							<span id="cartinfo" class="mycartinfo"></span>
						</div>
						<div class="clear"></div>
						</s:iterator>
					
						<!--商品条目结束-->
					<div id="book_list" class="list_r_title">
						
						<div id="divTopPageNavi" class="list_r_title_text3">

							<!--分页导航开始-->
							<s:if test="page>1">
							<div class='list_r_title_text3a'>
								<a name=link_page_next
									href="NHList_execute?c=${c }&page=${page-1}">
								<img src='${pageContext.request.contextPath}/images/page_up.gif' /> </a>
							</div>
							</s:if>
							<s:else>
							<div class='list_r_title_text3a'>
								<img src='${pageContext.request.contextPath}/images/page_up_gray.gif' />
							</div>
							</s:else>
							
							<div class='list_r_title_text3b'>
								第${page }页/共${maxPage }页
							</div>
							
							<s:if test="page < maxPage">
							<div class='list_r_title_text3a'>
								<a name=link_page_next
									href="NHList_execute?c=${c }&page=${page+1}">
									<img src='${pageContext.request.contextPath}/images/page_down.gif' /> </a>
							</div>
							</s:if>
			
							<s:else>
							<div class='list_r_title_text3a'>
								<img src='${pageContext.request.contextPath}/images/page_down_gray.gif' />
							</div>
							</s:else>

							<!--分页导航结束-->
						</div>
					</div>
					<div class="clear"></div>
					<div id="divBottomPageNavi" class="fanye_bottom">
					</div>

				</div>
				<!--图书列表结束-->

			</div>
			<!--中栏结束-->
			<div class="clear"></div>
		</div>

	</body>
</html>
