<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		var frm = $("#frm")[0];
		var reqAction=$(".reqAction:checked").val();
		var action="/request";
		
		//alert(reqAction);
		
		if( reqAction == "primitive" ){
			action="/primitive"
		}//end if
	
		if( reqAction == "dto" ){
			action="/dto"
		}//end if
		
	
		frm.action=action;
	
		//alert(frm.action)
		
		frm.submit();
		
	});//click


});//document ready
</script>

<title>Insert title here</title>
</head>
<body>
<h1>web parameter 처리</h1>
<form id="frm" name="frm" method="post">
<table>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name"/> </td>
	</tr>
	<tr>
		<td>나이</td>
		<td><input type="text" name="age"/> </td>
	</tr>
	<tr>
		<td>취미</td>
		<td>
			<input type="checkbox" name="hobby" value="자바"/>자바 
			<input type="checkbox" name="hobby" value="독서"/>독서 
			<input type="checkbox" name="hobby" value="등산"/>런닝 
			<input type="checkbox" name="hobby" value="런닝"/>런닝 
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="radio" value="request"  class="reqAction" name="reqAction" checked="checked"/>HttpServletRequest 처리
			<input type="radio" value="primitive" class="reqAction" name="reqAction"  />단일형 처리
			<input type="radio" value="dto" class="reqAction" name="reqAction"  />DTO 처리
			
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="button" value="요청" id="btn" class="btn btn-info btn-sm"/>
		</td>
	</tr>

</table>
</form>



</body>
</html>