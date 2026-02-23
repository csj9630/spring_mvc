<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery CDN 시작 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script type="text/javascript">
	$(function() {

	});//ready
</script>

</head>
<body>
<h1>Spring Framework에서 GET+POST 방식의 요청을 method 하나로 처리</h1>
<h3>=> @RequestMapping 사용</h3>
<p>현재 요청 방식 : <c:out value="${requestScope.method}" /></p>


<img alt="static에 있는 데이터를 바로 쓸 수 있다." src="common/images/img_3.png"/>


</body>
</html>