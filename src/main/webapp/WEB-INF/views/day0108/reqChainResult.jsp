<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JQuery 세트 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#referer").html("<strong>"+document.referrer+"</strong>");

});//document ready
</script>
</head>
<body>
<h1>연결 응답</h1>
<h3>2026-01-08 목</h3>
<img alt="인덱스 이미지" src="../common/images/img_3.png"/>
<div id="referer"></div>
<c:out value="${name}"/><br>
<c:out value="${age}"/>
</body>
</html>