<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script  src="http://code.jquery.com/jquery-latest.min.js"></script> 
<script type="text/javascript">

$(function(){
	$("#checkJson").click(function(){
		$.ajax({
			type: "post",
			async: false,
			url: "${contextPath}/json2",
			success: function(data, textStatus){
				var jsonInfo = JSON.parse(data);
				var memberInfo = "회원 정보<br>";
			}
		});
	});
});
</script>
</head>
<body>

</body>
</html>