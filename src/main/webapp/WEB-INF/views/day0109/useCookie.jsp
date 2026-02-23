<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script type="text/javascript">
$(function(){
	$("#referer").html("<strong>"+ document.referrer +"</strong>");
});
</script>
</head>
<body>
<div id="referer"></div>
<strong>쿠키사용</strong><br>
<div>

<a href="/day0109/addCookie">Cookie 심기(<c:out value="${ result?'완료':'미완료' }"/>)</a> | 

<a href="/day0109/readCookie">Cookie 읽기 ( HttpServletRequest )</a> | 
<a href="/day0109/readCookieAnnotation">Cookie 읽기( @CookieValue )</a> |
<a href="/day0109/removeCookie">Cookie 삭제</a>
</div>
</body>
</html>