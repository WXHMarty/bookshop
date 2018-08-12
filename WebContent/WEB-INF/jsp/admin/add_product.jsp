<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	
	<head>
		<title>新增书籍</title>
		<meta http-equiv="content-type" content="text/html;charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/global.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/addproduct.js"></script>
	</head>

	<body>
		<table id="table1">
	  <tr>
	    <td align="center">
	    	<%@include file="/WEB-INF/jsp/admin/top.jsp" %>
			<table id="table2">
	        <tr>
	          <td valign="top"><table width="494">
	            <tr>
	              <td width="45" height="25">&nbsp;</td>
	              <td width="437" valign="bottom"><font color="green">新增书籍</font></td>
	            </tr>
	          </table></td>
	        </tr>
	      </table>
	      <table id="table3" height="1036">
	        <tr>
	          <td height="1036"><table width="895" align="center">
	            <div align="center">
	              <form action="HandleProd_addPro" method="post" enctype="multipart/form-data">
	              	<table align="center" width="500">
	              		<tr height="60"><th align="center" colspan="2"><span>请填写以下书籍信息：</span></th></tr>
		              	<tr height="30">
		              	  <td width="200" align="right"><span>书籍名称：</span></td>
		              	  <td width="400"><span><input type="text" id="txtbname" name="book.bname"></span>
			              	  <span style="color:red;font-size:2px;">${fail }</span>
			              	  <span id="bnameinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>书籍图片：</span></td>
		              	  <td><span><input type="file" id="txtupload" name="upload"></span><br>
		              	  	<span id="uploadinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>书籍作者：</span></td>
		              	  <td><span><input type="text" id="txtauthor" name="book.author"></span>
		              	  	<span id="authorinfo" style="color:red;font-size:2px;"></span></td>
		              	</div>
		              	<tr height="30">
		              	  <td align="right"><span>出版社：</span></td>
		              	  <td><span><input type="text" id="txtpublishing" name="book.publishing"></span>
		              	  	<span id="publishinginfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>出版时间：</span></td>
		              	  <td><span><input type="text" id="txtpublish_time" name="book.publish_time"></span>
		              	  	<span id="publish_timeinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>字数：</span></td>
		              	  <td><span><input type="text" id="txtword_number" name="book.word_number"></span>
		              	  	<span id="word_numberinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>版次：</span></td>
		              	  <td><span><input type="text" id="txtwhich_edtion" name="book.which_edtion"></span>
		              	  	<span id="which_edtioninfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>总页数：</span></td>
		              	  <td><span><input type="text" id="txttotal_page" name="book.total_page"></span>
		              	  	<span id="total_pageinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>印刷时间：</span></td>
		              	  <td><span><input type="text" id="txtprint_time" name="book.print_time"></span>
		              	  	<span id="print_timeinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>印次：</span></td>
		              	  <td><span><input type="text" id="txtprint_number" name="book.print_number"></span>
		              	  	<span id="print_numberinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>价格：</span></td>
		              	  <td><span><input type="text" id="txtprice" name="book.price"></span>
		              	  	<span id="priceinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="30">
		              	  <td align="right"><span>库存数量：</span></td>
		              	  <td><span><input type="text" id="txtamount" name="book.amount"></span>
		              	  	<span id="amountinfo" style="color:red;font-size:2px;"></span></td>
		              	</tr>
		              	<tr height="80">
		              	  <td align="right"><span>内容简介：</span></td>
		              	  <td><span><textarea name="book.description" rows="10" cols="50">请输入内容简介...</textarea></span></td>
		              	</tr>
		              	<tr height="80">
		              	  <td align="right"><span>作者简介：</span></td>
		              	  <td><span><textarea name="book.author_summary" rows="10" cols="50">请输入作者简介...</textarea></span></td>
		              	</tr>
		              	<tr><th height="40" align="center" colspan="2"><br><span>请选择以下所要添加的书籍类别：</span></th></tr>
		              	<tr>
		              	  <td align="right"><label>一级类别：</label></td>
		              	  <td>
		              	  	<label>推荐</label><input type="checkbox" id="txtrecommend" name="categores" value="Recommend">&nbsp;
		              	  	<label>新书</label><input type="checkbox" id="txtnew" name="categores" value="New">&nbsp;
		              	  	<label>热销</label><input type="checkbox" id="txthot" name="categores" value="Hot">&nbsp;
		              	  	<label>小说</label><input type="checkbox" id="txtnovel" name="categores" value="Novel">&nbsp;
			              	<label>青春</label><input type="checkbox" id="txtyouth" name="categores" value="Youth"><br>
			              	<label>人文社科</label><input type="checkbox" id="txthumanity" name="categores" value="Humanity And Social Science">&nbsp;
			              	<label>管理</label><input type="checkbox" id="txtmanagement" name="categores" value="Management">&nbsp;
			              	<label>少儿</label><input type="checkbox" id="txtchildren" name="categores" value="Children">&nbsp;
			              	<label>外语</label><input type="checkbox" id="txtlanguage" name="categores" value="Foreign Language"><br>
			              	<label>计算机</label><input type="checkbox" id="txtcomputer" name="categores" value="Computer">
		              	  </td>
		              	</tr>
		              	<tr height="60">
		              	  <td align="right"><label>二级类别：</label></td>
		              	  <td>
		              	  	 <div id="title">
		              	  	 <div class="secondclass" id="novel" style="float:left; height:30px;">
		              	  	 <select name="categores">
		              	  	 	<option value="" selected="selected">小说</option>
		              	  	 	<option value="Chinese Contemporary Novel">当代小说</option>
		              	  	 	<option value="Chinese Modern Novel">近现代小说</option>
		              	  	 	<option value="Chinese Classical Novel">古典小说</option>
		              	  	 	<option value="Four Classic Novels">四大名著</option>
		              	  	 	<option value="Translated Works">世界名著</option>
		              	  	 </select>
		              	  	 </div>
		              	  	 <div class="secondclass" id="youth" style="float:left; height:30px;margin-left:10px;">
		              	  	 <select name="categores">
		              	  	 	<option value="" selected="selected">青春</option>
		              	  	 	<option value="School">校园</option>
		              	  	 	<option value="Love">爱情/感情</option>
		              	  	 	<option value="Grow Up">叛逆/成长</option>
		              	  	 	<option value="Fantasy">玄幻</option>
		              	  	 	<option value="Original">原创</option>
		              	  	 </select>
		              	  	 </div>
		              	  	 <div class="secondclass" id="humanity" style="float:left; height:30px; margin-left:10px">
		              	  	 <select name="categores">
		              	  	 	<option value="" selected="selected">人文社科</option>
		              	  	 	<option value="Political">政治</option>
		              	  	 	<option value="Economic">经济</option>
		              	  	 	<option value="Law">法律</option>
		              	  	 	<option value="Philosophy">哲学</option>
		              	  	 	<option value="History">历史</option>
		              	  	 </select>
		              	  	 </div>
		              	  	 <div class="secondclass" id="management" style="float:left; height:30px; margin-left:10px">
		              	  	 <select name="categores">
		              	  	 	<option value="" selected="selected">管理</option>
		              	  	 	<option value="Commen Management">管理学</option>
		              	  	 	<option value="Strategic Management">战略管理</option>
		              	  	 	<option value="Marketing">市场营销</option>
		              	  	 	<option value="Business History">商业史传</option>
		              	  	 	<option value="E-Business">电子商务</option>
		              	  	 </select>
		              	  	 </div>
		              	  	 <div class="secondclass" id="children" style="float:left; height:30px; margin-left:10px">
		              	  	 <select name="categores">
		              	  	 	<option value="" selected="selected">少儿</option>
		              	  	 	<option value="0-2">0-2岁</option>
		              	  	 	<option value="3-6">3-6岁</option>
		              	  	 	<option value="7-10">7-10岁</option>
		              	  	 	<option value="11-14">11-14岁</option>
		              	  	 	<option value="Child Literature">儿童文学</option>
		              	  	 </select>
		              	  	 </div>
		              	  	 <div class="secondclass" id="language" style="float:left; height:30px; margin-left:10px">
		              	  	 <select name="categores">
		              	  	 	<option value="" selected="selected">外语</option>
		              	  	 	<option value="English">英语</option>
		              	  	 	<option value="Japanese">日语</option>
		              	  	 	<option value="Korean">韩语</option>
		              	  	 	<option value="Russian">俄语</option>
		              	  	 	<option value="German">德语</option>
		              	  	 </select>
		              	  	 </div>
		              	  	 <div class="secondclass" id="computer" style="float:left; height:30px; margin-left:10px">
		              	  	 <select name="categores">
		              	  	 	<option value="" selected="selected">计算机</option>
		              	  	 	<option value="Computer Theory">计算机理论</option>
		              	  	 	<option value="Database">数据库</option>
		              	  	 	<option value="Programming">程序设计</option>
		              	  	 	<option value="Artificial Intelligence">人工智能</option>
		              	  	 	<option value="Computer Examination">计算机考试</option>
		              	  	 </select>
		              	  	 </div>
		              	  	 </div>
		              	  </td>
		              	</tr>
		              	<tr height="20"><td><span>&nbsp;</span></td><td><input type="submit" id="addProdsbm" value="保存">&nbsp;<input type="reset" value="重置"></td></tr>
	              	</table>
	              	
	              </form>
	              
	            </div>
	          </table></td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
	</body>
</html>
		              	