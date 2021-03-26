<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>surveyForm.jsp</title>
<style type="text/css">
	#con{
		width:1400px;
		margin:0 auto;
	}
	.c1{
		width:50%;
		float:left;
	}
</style>
</head>
<body>
	<h2>surveyForm.jsp</h2>
	<h2>좋아하는 사진은?</h2>
	<form action="./survey.ok" name="frm">
		<div id="con">
			<div class="c1">
				<input type="checkbox" name="ck" id="" value="tenor1" />
				<img src="<c:url value='/resources/tenor1.gif'/>" alt="고양이" />
			</div>
			<div class="c1">
				<input type="checkbox" name="ck" id="" value="tenor2" />
				<img src="<c:url value='/resources/tenor2.gif'/>" alt="개" />
			</div>
			<br />
			<input type="submit" value="선택" id="btn" />
		</div>
	</form>
	
	
	
</body>
</html>