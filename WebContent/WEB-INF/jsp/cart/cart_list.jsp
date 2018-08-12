<%@page pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c1" uri="http://www.hynu.com.cn/mytag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>网上书店</title>
		<link href="${pageContext.request.contextPath}/css/book.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/second.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/shopping_vehicle.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/cart.list.js"></script>
	</head>
	<body>
		<br />
		<br />
		<div class="my_shopping">
			<img class="pic_shop" src="${pageContext.request.contextPath }/images/pic_myshopping.gif" /><!-- 我的购物车图片 -->
		</div>
		<div id="div_choice" class="choice_merch">
			<h2 id="cart_tips">
				您已选购以下商品<span style="color:red"></span>
				&nbsp;&nbsp;&nbsp;<span style="color:red"><a href="Item_clearItem">清空购物车</a></span>
			</h2>
			<div class="choice_bord">
				<table class="tabl_buy" id="tbCartItemsNormal">
					<tr class="tabl_buy_title">
						<td class="buy_td_6">
							<span>&nbsp;</span>
						</td>
						<td>
							<span >商品名</span>
						</td>
						<td><span >封面</span>
						</td>
						<td class="buy_td_5">
							
						</td>
						<td class="buy_td_4">
							<span class="span_w3">价格</span>
						</td>
						<td class="buy_td_1">
							<span class="span_w2">数量</span>
						</td>
						<td class="buy_td_2">
							<span>变更数量</span>
						</td>
						<td class="buy_td_1">
							<span>删除</span>
						</td>
					</tr>
					<tr class='objhide' over="no">
						<td colspan="8">
							&nbsp;
						</td>
					</tr>
					
                      <!-- 购物列表开始 -->
                      <s:iterator value="items" var="it">
						<tr class='td_no_bord'>
						
						
							<td style='display: none'>
							
							</td>
							<td class="buy_td_6">
								<span class="objhide"></span>
							</td>
							<td>
							<a href="/bookshop/book/BookView_execute?bid=${it.bid }">${it.itname }</a>
							</td>
							<td>
								<a href="/bookshop/book/BookView_execute?bid=${it.bid }"><img id=img_show_prd
										src="${pageContext.request.contextPath }/productImages/${it.itpicture }" width="75px"/></a></td>
							<td class="buy_td_5">
								
							</td>
							<td class="buy_td_4">
								&nbsp;&nbsp;
								<span>￥${it.price}</span>
							</td>
							
							<td class="buy_td_1">
								&nbsp;&nbsp;${it.order_num }
							</td>

							<td >
								<input class="del_num" type="text" size="3" maxlength="4"/>
								<a href="Item_execute?itid=${itid }&num=">变更</a>
							</td>
							<td>
								<a href="Item_deleteItem?itid=${itid }">删除</a>
							</td>
						</tr>
						</s:iterator>
					<!-- 购物列表结束 -->
				</table>
				
				<div class="choice_balance">
					<div class="select_merch">
						<a href="${pageContext.request.contextPath}/book/Style_execute"> 继续挑选商品>></a>
					</div>
					<div class="total_balance">
						<div class="save_total">
							<span style="font-size: 14px">|</span>
							<span class="t_add">商品金额总计：</span>
							<span class="c_red_b"> ￥<span id='total_account'>${totalPrice}</span>
							</span>
						</div>
						<div id="balance" class="balance">
							<a name='checkout' href='payment' > 
								<img src="${pageContext.request.contextPath}/images/butt_balance.gif" alt="结算" border="0" title="结算" />
							</a>
						
						</div>
					</div>
				</div>
			</div>
		</div>

		<br />
		<br />
		<br />
		<br />
		
	</body>
</html>



