//用户名和密码不能为空
$(function(){
	//用户名不能为空
	$("#txtUsername").blur(function(){
		$("#usernameinfo").html("");
		if($("#txtUsername").val() == ""){
			$("#usernameinfo").text("用户名不能为空！");
		}
	});
	
	//密码不能为空
	$("#txtPassword").blur(function(){
		$("#passwordinfo").html("");
		if($("#txtPassword").val() == ""){
			$("#passwordinfo").text("密码不能为空！")
		}
	});
});