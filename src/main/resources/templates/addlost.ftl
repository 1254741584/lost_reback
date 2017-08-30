<!DOCTYPE html>  
<html>  
<head>
<script src="../js/jquery-1.9.1.js"></script>
<script src="../js/bootstrap.js"></script>
<script src="../js/showpic.js"></script>
<style>

body{
background:#E8F2FE;
}

* {
	margin: 0;
	padding: 0;
	border: none;
}



</style>
</head>
<body>  
<#include "/header.ftl" >  

<form action="addlost.do" method="post"  enctype="multipart/form-data">
		<table>
			<tr>
				<td> 遗失物品名字</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td> 遗失物品类型</td>
				<td><select name="type">
					<#list type as p>
					<option value="${p.tid}">${p.tname}</option>
					</#list>
				</select></td>
			</tr>
			<tr>
				<td> 遗失物品信息(比如遗失地点,物品特征等)</td>
				<td>
					<textarea rows="5" cols="20" name="lostinfo"></textarea>
				</td>
			</tr>
			<tr>
				<td> 遗失物品时间</td>
				<td>
					<input type="date" name="date">
				</td>
			</tr>
			<tr>
				<td> 遗失物品图片(最多可选三张)</td>
				<td>
				<input type="file" name="lostimg" id="" multiple="true" onchange="previewMultipleImage(this,'show_img')">
				</td>
			</tr>
			<tr>
				<td clospan="2"><input type="submit" value="提交失物信息"/></td>
			</tr>
		</table>
</form>
  <div id="show_img"></div>
</body>  
</html>  
