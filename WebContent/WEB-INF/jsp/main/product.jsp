<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="c1" uri="http://www.hynu.com.cn/mytag" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>网上书店</title>
		<meta http-equiv=Content-Type content="text/html; charset=utf-8">
		<link href="${pageContext.request.contextPath}/product_files/dangdang.css" type=text/css
			rel=Stylesheet>
		<link href="${pageContext.request.contextPath}/product_files/book1.css" type=text/css rel=stylesheet>
		<link href="${pageContext.request.contextPath}/css/book1.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/comm_answer.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>

	</head>
	<body>
		<%@include file="/common/head.jsp"%>
		
		<div id=tag_box style="DISPLAY: none; Z-INDEX: 10; POSITION: absolute"></div>
		<div id=div_shield></div>
		<div id=main>
			<div class=mainsearch></div>
			<div class=wrap>
				<div class=right>
					<div class=right_wai>
						<div class=shuming>
							<div class=shuming_left>
							
								<span class=black000>${book.bname
									}</span>
							</div>
							<div class=book_case>
								<span class=seriesname>丛书名： ${book.bname }</span>
							</div>
							<div class=empty_box></div>
						</div>
						<div class=book_left>
							<div class=book_pic>
								<img id=img_show_prd
										src="../productImages/${book.picture }">
								
							</div>
							<inpit id=hid_largepictureurl type=hidden>
						</div>
						<div class=book_right>
							<div id=author_>
								作 者： ${book.author }
							</div>
							<div id=publisher_>
								出 版 社： ${book.publishing }
							</div>
							<ul>
								<li>
									出版时间： ${book.publish_time }
								</li>
								<li>
									字 数： ${book.word_number }
								</li>
								<li>
									版 次： ${book.which_edtion }
								</li>
								<li>
									页 数： ${book.total_page }
								</li>
								
							</ul>

							<div class=jiage>
								
								<span class=redc30>价格：￥<b>${book.price }</b>
								</span> 
								<div class=pd_buy_num>
									<div class=clear></div>
								</div>
								<div class=goumai>
									<span class="list_r_list_button"> 
										<a href="<%=request.getContextPath() %>/item/Item_saveItem?id= ${book.bid }"> 
											<img src='${pageContext.request.contextPath}/images/buttom_goumai.gif' /> </a></span>
									<span id="cartinfo" class="mycartinfo">${result }</span>
									
								</div>
							</div>
						</div>
						<div id=dvTPUrls></div>
						<div id=__zhinengbiaozhu_bk>
							<div class=dashed></div>
							<h2 class=black14>
								
							
							<div class=dashed></div>
							<h2 class=black14>
							
								内容简介
							</h2>
							<div class=zhengwen>
								${book.description }
							</div>
							<div class=dashed></div>
							<h2 class=black14>
								
								作者简介
							</h2>
							<div class=zhengwen>
								${book.author} ${book.author_summary }
							</div>
							<div class=dashed></div>
							
							<div class=zhengwen>
								第2章 对教育方法的历史回顾
								<br>
								儿童之家使用的教育体系实际上已经向前迈出了一大步。假如人们认为我和正常儿童相处所得的经验相对短暂，那么此经验建立在以往对非正常儿童的教育经验基础之上，因此也代表着一段相当长期的思想。
								<br>
								假如我们想开发出科学的教育体系，就必须开辟出一条前所未有的新路。教师们必须接受专业培训，同时而学校也必须进行转变。假如教师们都接受了观察与实验的培训，那他们必须在学校里执行这些活动。
								<br>
								因此，科学教育体系的基本需求是有一个能允许儿童自由发展个性的学校。如果某种教育体系是基于对学生个体的研究，那么其研究方式应该是对行动自由的儿童进行观察和研究，而不是对一个受压制的学生进行观察和研究。
								<br>
								在人类学和实验心理学的帮助下，在一个人应试教育为主的学校里，开发新型教育方法，是最愚蠢的想法。
								<br>
								每个领域的实验科学，都是由使用自己独特的方法中发展而来。细菌学起源于分离并培育微生物。犯罪学、医学和教育学也都分别在不同类型的个体上使用过最初的人体测量方法，如在罪犯上、精神病人、医院里的临床病人、学生身上等。实验心理学在开始阶段就要指出执行实验的精确技术。
								<br>
								……
							</div>
						</div>
						<a name=review_point></a>
					</div>
				</div>
				<div id=tag_box
					style="DISPLAY: none; Z-INDEX: 2; POSITION: absolute"></div>
				<div id=tag_box_pay
					style="DISPLAY: none; Z-INDEX: 2; POSITION: absolute"></div>
				<div id=div_shield></div>
				<!--页尾 开始 -->
				<div class=public_footer_add_s></div>
				<!--页尾开始 -->
				<%@include file="/common/foot.jsp"%>
				<!--页尾结束 -->
	</body>
</html>
