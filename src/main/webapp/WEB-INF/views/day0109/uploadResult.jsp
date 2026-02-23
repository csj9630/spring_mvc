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
<h1><strong>파일업로드 결과</strong></h1><br>
<div>

업로더 : <c:out value="${param.uploader }"/><br>
나이 : <c:out value="${param.age}"/><br>

<%---jsp는 day0112에 있지만, Controller는 @RequestMapping("/day0109")으로 되어있음  --%>
<a href="/day0109/imgView?img=${fDTO.upFileName}">>파일보기</a>

<a href="javascript:history. back() ">뒤로</a>
</div>
</body>
</html>