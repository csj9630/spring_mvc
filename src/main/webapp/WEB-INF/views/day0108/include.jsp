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

});//document ready
</script>
</head>
<body>
<h1>include 연습</h1>
<h3>2026-01-08 목</h3>
<img alt="인덱스 이미지" src="../common/images/img_3.png"/>
<hr>
<strong>&lt;c:import&gt;</strong>
<div>
<c:import url="/data/useRequest"/><!--Mapping명  -->
<c:import url="/WEB-INF/views/common/common.jsp"/><!-- 상대경로로 jsp를 직접 include  -->
</div>
<hr>
<strong>&lt;jsp:include&gt;</strong>
<div>
<jsp:include page="/WEB-INF/views/common/common.jsp"></jsp:include>
<%-- <jsp:include page="/data/useRequest"></jsp:include><!--소스에서 에러나긴 한데 돌아는 감. 쓰지 말 것. --> --%>
</div>
<div>
<hr>
<h3>include 지시자</h3>
<%@include file="/WEB-INF/views/common/common2.jsp" %>
<%=msg %>
</div>

</body>
</html>