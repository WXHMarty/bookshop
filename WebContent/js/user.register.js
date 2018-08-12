$(function(){
	var A = false, B = false, C = false, D = false;
	//当按格式填写正确才能提交
	$(function(){
		$("#btnClientRegister").click(function(){
			if(A && B && C && D){
				return true;
			} else {
				return false;
			}
		});
	});
	
	//用户名填写
	$(function(){
		$("#txtusername").blur(function(){
			$("#nameinfo").html("");
			if($("#txtusername").val() == ""){
				$("#nameinfo").text("用户名不能为空！");
			} else if (!$("#txtusername").val().match(/^[a-z0-9\u4e00-\u9efa5]{4,20}$/)) {
				$("#nameinfo").text("用户名格式不正确！");
			} else {
				A = true;
			}
		});
	});
	
	//密码填写
	$(function(){
		$("#txtpassword").blur(function() {
			$("#passwordinfo").html("");
			if($("#txtpassword").val() == "") {
				$("#passwordinfo").text("密码不能为空！");
			}else if (!$("#txtpassword").val().match(/^[a-zA-Z0-9]{6,20}$/)) {
				$("#passwordinfo").text("密码格式不正确！");
			}else{
				B = true;
			}
		});
	});
	
	//在此填写密码确认
	$(function(){
		$("#txtRepeatPass").blur(function(){
			$("#password1info").html("");
			if($("#txtRepeatPass").val() == ""){
				$("#password1info").text("请再次输入密码！");
			}else if ($("#txtRepeatPass").val() != $("#txtpassword").val()) {
				$("#password1info").text("两次输入的密码不一样！");
			} else {
				C = true;
			}
		});
	});
	
	//验证码填写
	$(function(){
		$("#txtVerifyCode").blur(function(){
			$("#numberinfo").html("");
			if($("#txtVerifyCode").val() == ""){
				$("#numberinfo").text("验证码不能为空！");
			} else {
				D = true;
			}
		});
	});
	
	//刷新验证码
	$(function(){
		$("#checkCode").click(function(){
			$("#imgVcode").attr("src","checkCode.action?dt="+new Date().getTime());
		});
	});
});