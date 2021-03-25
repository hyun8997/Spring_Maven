<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step1.jsp</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btn').click(function(){
			//console.log('click');
			
			//location.href = "../register/step2.do";		//페이지만 이동시켜주는거고 정보는 넘어가지 않았다
																					//체크박스데이터가 안넘어가서 null이므로 뷰는 1뷰로 나옴
			//location.href = '<c:url value="/register/step2.do" ></c:url>';		//jstl을 스크립트 밖에서 작성하고 넣는게 편함
			
			//if($('#agree')[0].checked){		//체크박스는 중복을 허용하는 놈이라서 모두 배열로 들어있다.
			//	location.href = '<c:url value="/register/step2.do" ></c:url>';	
			//}		
			
			
 			document.frm.action = "step2.do";
			document.frm.submit(); 
			
		});
		
	});
</script>

</head>
<body>
	<h2>step1.jsp</h2>
	<h1>약관</h1>
	<textarea rows="10" cols="30" name="txtArea" id="txtArea" >고객님의 소중한 정보를 잘 쓰겠습니다.</textarea>
	<form action="#" name="frm">
		<input type="checkbox" name="ck" id="agree" />
		<span>약관동의</span>
		<input type="button" value="다음" id="btn">
	</form>
	
	
</body>
</html>