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
  
</body>  
</html>  
