<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
	<h2>main.jsp</h2>
	
	<!-- 이미지를 넣기 위해 jstl 사용 -->
	<img src="<c:url value='/images/spring.PNG' />" alt="spring main img" />
	<!-- 뷰에서 이미지 접속 막아둠, 풀어야됨  -->
	
</body>
</html>