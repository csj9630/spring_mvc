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
<h1>서비스가 원활하지 못한 점 죄송합니다. 잠시 후 다시 시도해주세요./</h1>
<c:out value = "${msg }"/>
<img alt="이미지" src="/common/images/err_500.png"/>
<div id="referer"></div>

</body>
</html>