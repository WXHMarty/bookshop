$(function(){
	var A=false, B=false, C=false;
	
	//原密码、新密码和确认密码都填写了才能提交
	$("#revPasssbt").click(function(){
		if(A && B && C)
			return true;
		else
			return false;
	});
	
	//填写原密码
	$("#txtcpass").blur(function(){
		$("#cpassinfo").html("");
		if($("#txtcpass").val() == ""){
			$("#cpassinfo").text("旧密码不能为空！");
		}else{
			A = true;
		}
	});
	
	//填写新密码
	$("#txtnpass").blur(function(){
		$("#npassinfo").html("");
		if($("#txtnpass").val() == ""){
			$("#npassinfo").text("新密码不能为空！");
		}else{
			B = true;
		}
	});
	
	//填写确认密码
	$("#txtrpass").blur(function(){
		$("#rpassinfo").html("");
		if($("#txtrpass").val() == ""){
			$("#rpassinfo").text("旧密码不能为空！");
		}else if($("#txtrpass").val() != $("#txtnpass").val()){
			$("#rpassinfo").text("两次密码填写不一致！");
		}else{
			C = true;
		}
	});
});