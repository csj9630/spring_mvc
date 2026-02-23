<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- bootStrap CDN ---------------------->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
 <!----------------------- bootStrap CDN -->
 
<style type="text/css">
</style>

<!-- JQuery 세트 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#btn").click(function(){
		
	});//click


});//document ready
</script>

<title>Insert title here</title>
</head>
<body>
<h1>web parameter 처리결과</h1>

<h3><c:out value="${param.name }"/> 님 안녕하세요</h3>
<c:out value="${param.age }"/><br>
<c:if test="${empty paramValues.hobby }">
선택한 취미가 없습니다.
</c:if>

<c:forEach var="hobby" items="${paramValues.hobby }">
	<c:out value="${hobby}"/>
</c:forEach>

<a href="javascript:history.back()">뒤로.</a>

</body>
</html>