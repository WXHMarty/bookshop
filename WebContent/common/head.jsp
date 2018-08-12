<%@page contentType="text/html;charset=utf-8"%>
<link href="${pageContext.request.contextPath}/css/book_head090107.css" rel="stylesheet" type="text/css" />
<div class="head_container">
	<div class="head_welcome">
		<div class="head_welcome_right">
			<span class="head_welcome_text"> </span>
			<span class="head_welcome_text"> <span class="little_n"> | <a
					href="../common/introduce.jsp" name="helpcenter" class="head_black12a" >帮助</a>
					| </span> </span>
			<div class="cart gray4012">
				<a href="${pageContext.request.contextPath}/item/ItemMove_execute">购物车</a>
			</div>
		</div>
		<span class="head_toutext" id="logininfo">
		<b><span style="color:blue;font-size:15px">${s_user.username }</span>
		 您好，欢迎光临！ </b>
		<%if(session.getAttribute("s_user")!=null){ %>
		[&nbsp;<a href="<%=request.getContextPath() %>/user/UserLogin_loginOut" class="b">退出登录</a>&nbsp;]
		<%} else{%>
		
		[&nbsp;<a href="${pageContext.request.contextPath}/user/UserLogin_execute" class="b">登录</a>|<a
			href="${pageContext.request.contextPath}/user/UserRegister_execute" class="b">注册</a>&nbsp;]
		<%} %>
		</span>
	</div>
	<div class="head_head_list">
		<div class="head_head_list_left">
			<a href="${pageContext.request.contextPath}/book/Style_execute" name="backtobook"><span class="head_logo">
				网上书屋</span></a>
		</div>
		<div class="head_head_list_right">

			<div class="head_head_list_right_b">
			</div>
		</div>
	</div>
	<div class="head_search_div">

	</div>
	<div class="head_search_bg"></div>
</div>
