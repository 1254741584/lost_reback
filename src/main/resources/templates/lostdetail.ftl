<!DOCTYPE html>  
<html>  
<head>
<script src="../../js/jquery-1.9.1.js"></script>
<script src="../../js/bootstrap.js"></script>

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


<table>
	
	<tr>
		<td>失物类型</td>
		<td>${lost.typename}</td>
	</tr>
	<tr>
		<td>失物名称</td>
		<td>${lost.name}</td>
	</tr>
	<tr>
		<td>失物描述</td>
		<td>${lost.lostinfo}</td>
	</tr>
	<tr>
		<td>失物图片</td>
		<td>
		
			<#if lost.img??>
				<#list lost.img?split(",") as img>
					<img src="/lost/${img}" alt="失物图片"/>
				</#list>
			<#else>
				<img src="img/zanwu.png"  alt="暂无图片"/>
			</#if>
		
			
		</td>
	</tr>
	<tr>
		<td>遗失时间</td>
		<td>${lost.lostdate}</td>
	</tr>
	<tr>
		<td>联系人</td>
		<td>${lost.uname}</td>
	</tr>
</table>

</body>  
</html>  
