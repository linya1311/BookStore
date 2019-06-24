<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>註冊</title>


<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
<link rel=stylesheet type="text/css" href="skin/font.css">
<link rel=stylesheet type="text/css" href="skin/windows.css">
<script type="text/javascript" src="js/join_caeck.js"></script>

</head>
<body>

<table width=100% align="center" height=1080 class="bg">
<tr height=20%>
<td align="center" valign="top" colspan="3" class="ba"><jsp:include page="title/open.jsp"></jsp:include>
 
<tr height="70%">
<td width=50% align="center" valign="top">
<!-- 開始 -->
<form action="memberAction" method="post">
<table>
<tr>
<td align="center"> 
<div class="B-xl">會員註冊</div>
<hr>
<div class="R">信箱 已存在，請重新輸入</div>
<tr><td><input type="text" name="user_id" class="text" placeholder="帳號" required="required"
		id="user_id_in" onblur="check_user_id()"><span style="font-size:20px" id="a" class=""></span>
	<span style="font-size:13px" id="user_id_show"></span>
<tr><td><input type="text" name="user_password" class="text" placeholder="密碼" required="required"
		id=user_password_in onblur="check_user_password()"><span style="font-size:20px" id="a1" class=""></span>
	<span style="font-size:13px" id="user_password_show"></span>
<tr><td><input type="text" name="user_password2" class="text" placeholder="確認密碼" required="required"
		in=user_password2>

<tr><td><input type="email" name="user_email" class="text" placeholder="信箱" required="required">

<tr><td><input type="email" name="user_email2" class="text" placeholder="確認信箱" required="required">

<hr>

<tr>
<td align="center" colspan="2">
<input type="submit" value="送出">
<input type="reset" value="清除">
<tr>
<td align="center" colspan="2">
<a href="index.jsp">回首頁</a> | <a href=".jsp">查詢密碼</a>
</table>
</form>
<!-- 結束 -->
<tr>
<td align="center" colspan="3"  class="ba2"><jsp:include page="title/end.jsp"></jsp:include>

</table>




</body>
</html>