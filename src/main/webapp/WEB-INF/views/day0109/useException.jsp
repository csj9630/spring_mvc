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
<strong>예외가 발생하지 않았을 때</strong><br>
<div>
${ param.num }번호가 입력되었습니다.
</div>
</body>
</html>