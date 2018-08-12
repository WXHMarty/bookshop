$(function(){
	var A=false, B=false, C=false, D=false, E=false, F=false,G=false, H=false,
	I=false, J=false, K=false, L=false, M=false,N=false, O=false, P=false,
	Q=false, R=false, S=false, T=false, U=false, V=false;
	//当不能为空的填写项填写以后才能提交
	$("#addProdsbm").click(function(){
		if(A && B && C && D && E && F && G && H && I && J && K && L &&
				(M || N || O || P || Q || R || S || T || U || V)){
			return true;
		}else{
			return false;
		}
	});
	
	//书籍名称必须填写
	$(function(){
		$("#txtbname").blur(function(){
			$("#bnameinfo").html("");
			if($("#txtbname").val() == ""){
				$("#bnameinfo").text("书籍名称不能为空！");
			} else {
				A = true;
			}
		});
	});
	
	//必须要上传相应的图片
	$("#txtupload").change(function() { 
		$("#uploadinfo").html("");
		var filepath=$("#txtupload").val(); 
		var extStart=filepath.lastIndexOf("."); 
		var ext=filepath.substring(extStart,filepath.length).toUpperCase(); 
		if(ext!=".BMP"&&ext!=".PNG"&&ext!=".GIF"&&ext!=".JPG"&&ext!=".JPEG"){ 
			$("#uploadinfo").text("图片限于bmp,png,gif,jpeg,jpg格式"); //检测允许的上传文件类型
			   B = false;
		    return;
		}
		
		var size = $("#txtupload")[0].files[0].size;
		if(size>1024*1024){       
			$("#uploadinfo").text("图片不能大于1M!");  //检测允许的上传文件大小
			B = false; 
			return;
		} 
		B = true;
		$("#uploadinfo").text("ok");
	}); 


	//作者不能为空
	$(function(){
		$("#txtauthor").blur(function(){
			$("#authorinfo").html("");
			if($("#txtauthor").val() == ""){
				$("#authorinfo").text("作者不能为空！");
			} else {
				C = true;
			}
		});
	});
	
	//出版社不能为空
	$(function(){
		$("#txtpublishing").blur(function(){
			$("#publishinginfo").html("");
			if($("#txtpublishing").val() == ""){
				$("#publishinginfo").text("出版社不能为空！");
			} else {
				D = true;
			}
		});
	});
	
	//出版时间不能为空
	$(function(){
		$("#txtpublish_time").blur(function(){
			$("#publish_timeinfo").html("");
			if($("#txtpublish_time").val() == ""){
				$("#publish_timeinfo").text("出版时间不能为空！");
			} else {
				E = true;
			}
		});
	});
	
	//字数不能为空
	$(function(){
		$("#txtword_number").blur(function(){
			$("#word_numberinfo").html("");
			if($("#txtword_number").val() == ""){
				$("#word_numberinfo").text("字数不能为空！");
			} else {
				F = true;
			}
		});
	});
	
	//版次不能为空
	$(function(){
		$("#txtwhich_edtion").blur(function(){
			$("#which_edtioninfo").html("");
			if($("#txtwhich_edtion").val() == ""){
				$("#which_edtioninfo").text("版次不能为空！");
			} else {
				G = true;
			}
		});
	});
	
	//总页数不能为空
	$(function(){
		$("#txttotal_page").blur(function(){
			$("#total_pageinfo").html("");
			if($("#txttotal_page").val() == ""){
				$("#total_pageinfo").text("总页数不能为空！");
			} else {
				H = true;
			}
		});
	});
	
	//印刷时间不能为空
	$(function(){
		$("#txtprint_time").blur(function(){
			$("#print_timeinfo").html("");
			if($("#txtprint_time").val() == ""){
				$("#print_timeinfo").text("印刷时间不能为空！");
			} else {
				I = true;
			}
		});
	});
	
	//印次不能为空
	$(function(){
		$("#txtprint_number").blur(function(){
			$("#print_numberinfo").html("");
			if($("#txtprint_number").val() == ""){
				$("#print_numberinfo").text("印次不能为空！");
			} else {
				J = true;
			}
		});
	});
	
	//价格不能为空
	$(function(){
		$("#txtprice").blur(function(){
			$("#priceinfo").html("");
			if($("#txtprice").val() == ""){
				$("#priceinfo").text("价格不能为空！");
			} else {
				K = true;
			}
		});
	});
	
	//库存量不能为空
	$(function(){
		$("#txtamount").blur(function(){
			$("#amountinfo").html("");
			if($("#txtamount").val() == ""){
				$("#amountinfo").text("价格不能为空！");
			} else {
				L = true;
			}
		});
	});
	
	//隐藏二级分类选项
	$(function(){
		$("#title").hide();
		$(".secondclass").hide();
		
		//点击推荐
		$("#txtrecommend").click(function(){
			if($("#txtrecommend").is(":checked")){
				M = true;
			}else{
				M = false;
			}
		});
		
		//点击新书
		$("#txtnew").click(function(){
			if($("#txtnew").is(":checked")){
				N = true;
			}else{
				N = false;
			}
		});
		
		//点击热卖
		$("#txthot").click(function(){
			if($("#txthot").is(":checked")){
				O = true;
			}else{
				O = false;
			}
		});
		
		//点击小说复选框显示小说类别
		$("#txtnovel").click(function(){
			if($("#txtnovel").is(":checked")){
				$("#title").show();
				$("#novel").show();
				P = true;
			}else{
				$("#novel").hide();
				P = false;
			}
		});
		
		//点击青春复选框显示青春类别
		$("#txtyouth").click(function(){
			if($("#txtyouth").is(":checked")){
				$("#title").show();
				$("#youth").show();
				Q = true;
			}else{
				$("#youth").hide();
				Q = false;
			}
		});
		
		//点击人文社科复选框显示人文社科类别
		$("#txthumanity").click(function(){
			if($("#txthumanity").is(":checked")){
				$("#title").show();
				$("#humanity").show();
				R = true;
			}else{
				$("#humanity").hide();
				R = false;
			}
		});
		
		//点击管理复选框显示管理类别
		$("#txtmanagement").click(function(){
			if($("#txtmanagement").is(":checked")){
				$("#title").show();
				$("#management").show();
				S = true;
			}else{
				$("#management").hide();
				S = false;
			}
		});
		
		//点击少儿复选框显示少儿类别
		$("#txtchildren").click(function(){
			if($("#txtchildren").is(":checked")){
				$("#title").show();
				$("#children").show();
				T = true;
			}else{
				$("#children").hide();
				T = false;
			}
		});
		
		//点击外语复选框显示外语类别
		$("#txtlanguage").click(function(){
			if($("#txtlanguage").is(":checked")){
				$("#title").show();
				$("#language").show();
				U = true;
			}else{
				$("#language").hide();
				U = false;
			}
		});
		
		//点击计算机复选框显示计算机类别
		$("#txtcomputer").click(function(){
			if($("#txtcomputer").is(":checked")){
				$("#title").show();
				$("#computer").show();
				V = true;
			}else{
				$("#computer").hide();
				V = false;
			}
		});
	});
});