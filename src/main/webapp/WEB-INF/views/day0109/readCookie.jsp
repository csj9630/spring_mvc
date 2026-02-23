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
<strong>쿠키읽기</strong><br>
<div>
<c:choose>
<c:when test="${ readFlag }">
이름 : ${ requestScope.name }<br>
나이 : ${ requestScope.age }<br>
</c:when>
<c:otherwise>쿠키가 존재하지 않습니다.</c:otherwise>
</c:choose>
<a href="javascript:history.back()">뒤로</a>
</div>
</body>
</html>