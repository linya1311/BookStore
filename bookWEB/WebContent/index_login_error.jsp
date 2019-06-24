<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁(登入錯誤)</title>
<link rel=stylesheet type="text/css" href="skin/windows.css">
</head>
<body class="bg">

<table width=100% align="center" height=1080 class="bg">
<tr height=20%>
<td align="center" valign="top" colspan="3" class="ba"><jsp:include page="title/open.jsp"></jsp:include>
 
<tr height="70%">
<td width=20% align="center" valign="top">
側邊欄位

<td width=60% align="center" valign="top">內容  廣告等等

<td width=20% align="center" valign="top"><%@ include file="login.jsp"%><div class="R">帳號或密碼錯誤<br>請重新輸入帳號、密碼</div>
<tr>
<td align="center" colspan="3"><jsp:include page="title/end.jsp"></jsp:include>

</table>

</body>
</html>