<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
$(document).ready(function(){
		
});
</script>

</head>
<body>


<h1> 내가 업로드한 파일 보기</h1>


<c:forEach items='<%=request.getAttribute("filelist") %>' var="file">
<img src=upload/${file} /> <br>
</c:forEach>





</body>
</html>