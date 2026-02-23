<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Session의 값</h1>
이름 : <c:out value="${sesName }"/><br>
나이 : <c:out value="${sesAge }"/><br>
<a href="/useHttpSessionGet">Controller에서 값 얻기</a>

</body>
</html>