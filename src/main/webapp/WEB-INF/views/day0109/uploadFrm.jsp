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

	$("#btn").click(function () {
		$("#frm").submit();
	});//click
	
});//document ready
</script>



</head>
<body>
<strong>파일업로드폼</strong><br>
<div>


<form action="/day0109/uploadFrmProcess" enctype="multipart/form-data" id="frm" method="post" >
	업로더 : <input type="text" name="uploader"/><br/>
	나이 : <input type="text" name="age"/><br/>
	<input type="file" name="upFile"/><br/>
	<input type="button" value="입력" id="btn" class="btn btn-sm btn-info" /><br/>
</form>



<a href="javascript:history. back() ">뒤로</a>
</div>
</body>
</html>