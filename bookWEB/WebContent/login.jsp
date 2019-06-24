<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員登入</title>

<link rel=stylesheet type="text/css" href="skin/font.css">
<script type="text/javascript" src="js/login_caeck.js"></script>
<script type="text/javascript" src="js/show_password.js"></script>
<!--密碼眼睛的圖示-->
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
<!--密碼眼睛的圖示-->

</head>

<body>

<form name=login method="post" action="loginAction" onsubmit="return checkAll()">

<table >

<tr>
<td align="center">
<div class="B-m">會員登入</div>
<hr>
<tr><td>
<!-- 到時候判斷 是信箱 或是帳號 -->
<input 	type="text"
		name="user_id" 
		required="required"
		placeholder="輸入帳號 或 Email"
		style="padding:5px;"
		size=25
		class="form-control"
		id="user_id"
		onblur="check_userID()">

<tr>
<td align="left">
<span style="font-size:13px" id="userID_show"></span><br>
<tr>
<td align="center">
<div class="input-group w-25">
<input 	type="password"
		name="user_password"
		required="required"
		placeholder="輸入密碼"
		style="padding:5px;"
		size=25
		class="form-control"
		id="user_password"
		onblur="check_password()">
<div class="input-group-btn"> <!--控制 按鈕合併在 密碼欄位後面-->
	<button class="btn btn-default" type="button" onclick="hideShowPsw()">
		<div class="glyphicon glyphicon-eye-open" id="eye"></div>
	</button>
</div></div>
<tr>
<td align="left">
<span style="font-size:13px" id="password_show"></span>

<tr>
<td align="center">
<br>
<input type="submit" name="Submit" value="登入" style="width:100px;height:40px;background-color:#008B8B;color:white"><br>
<a href="join_1.jsp">建立帳號</a>│
<a href="">忘記密碼</a>
</table>
</form>


<!--判斷密碼  似乎無法使用掛入的方式...-->
<script type="text/javascript">

	function check_password(){  
		//讀取接收的值
	    var password = document.getElementById("user_password").value;  
		var pwcheck = document.getElementById("password_show");  
	    
		//限制密碼的範圍
	    var reg = /^([a-zA-Z0-9]){8,16}$/i;
		
		//判斷式
	    if(reg.test(password)){  
	        pwcheck.innerHTML = "格式正確".fontcolor("green");  
	        document.getElementById("passwordclass").className = "icon ticker";   
	        return true;  
	    }else{  
	        pwcheck.innerHTML = "密碼長度限於8-16位，<br>僅能輸入英文字母及數字".fontcolor("red");  
	        document.getElementById("passwordclass").className = "icon into";    
	        return false;  
	    }     
	} 
</script>

</body>

 
</html>