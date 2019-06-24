<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁(已登入)</title>
<link rel=stylesheet type="text/css" href="skin/windows.css">
</head>
<body class="bg">

<table width=100% align="center" height=1080 class="bg">
<tr height=20%>
<td align="center" valign="top" colspan="3" class="ba"><jsp:include page="title/open.jsp"></jsp:include>
 
<tr height="70%">
<td width=20% align="center" valign="top">
側邊欄位
<br>
<input type="button" value="新增" onclick="location.href='login_error.jsp'"><br>
<input type="button" value="查詢" onclick="location.href=''"><br>
<input type="button" value="刪除" onclick="location.href=''"><br>
<td width=55% align="center" valign="top">內容  廣告等等

<td width=25% align="center" valign="top"><%@ include file="login_user.jsp"%>

<tr>
<td align="center" colspan="3"  class="ba2"><jsp:include page="title/end.jsp"></jsp:include>

</table>

</body>
</html>