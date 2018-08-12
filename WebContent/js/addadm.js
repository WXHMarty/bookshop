$(function(){
	var A=false, B=false, C=false;
	//当用户名和密码都填写了才能保存
	$(function(){
		$("#addAdmsbm").click(function(){
			if(A && B && C){
				return true;
			}else{
				return false;
			}
		});
	});
	
	//填写管理员用户名
	$(function(){
		$("#txtname").blur(function(){
			$("#nameinfo").html("");
			if($("#txtname").val() == ""){
				$("#nameinfo").text("管理员用户名不能为空！");
			}else{
				A = true;
			}
		});
	});
	
	//填写管理员密码
	$(function(){
		$("#txtpassword").blur(function(){
			$("#passwordinfo").html("");
			if($("#txtpassword").val() == ""){
				$("#passwordinfo").text("管理员用户密码不能为空！");
			}else{
				B = true;
			}
		});
	});
	
	$(function(){
		$("#txtrepassword").blur(function(){
			$("#repasswordinfo").html("");
			if($("#txtrepassword").val() == ""){
				$("#repasswordinfo").text("管理员用户密码不能为空！");
			}else if($("#txtrepassword").val() != $("#txtpassword").val()){
				$("#repasswordinfo").text("两次填写的密码不一致！");
			}else{
				C = true;
			}
		});
	});
})