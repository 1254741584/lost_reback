<!DOCTYPE html>  
<html>  
<head>
<script src="../js/jquery-1.9.1.js"></script>
<script src="../js/bootstrap.js"></script>

<style>

body{
background:#E8F2FE;
}

* {
	margin: 0;
	padding: 0;
	border: none;
}

.menu{
width:100%;
height:30px;
background:#CED8E8;

}

.menu ul li{
display:inline-block;
width:100px;
line-height: 30px
height:30px;
margin: 2px auto;
text-align: center;
}

.menu_left{
float:left;
width:40%;
}

.menu_right{
width:40%;
float:right;
}
</style>
</head>
<body>  
<#include "/header.ftl" >  

 <div class='menu'>
 <#include "/menu.ftl" >  
 </div> 
 
 <div class="content">
 	<div class="content_lost">
 		<div class="content_lost_name">
 			寻物启事
 		</div>
 		<div class="content_lost_li">
 			<ul>
				<#list losts as lost>
				<li><a href="findlostdetail/${lost.lid}">${lost.name}</a></li>
				</#list>
			</ul>
 		</div>
 	</div>
 	<div class="content_collect">
 	
 	</div>
 </div>
  
</body>  
</html>  
