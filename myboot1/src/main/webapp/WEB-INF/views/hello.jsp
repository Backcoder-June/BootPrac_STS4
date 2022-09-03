<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){

	$("#ajaxbtn").on("click", function(){
	
		$.ajax({
			url : "ajax",
			type : "get",
			dataType : "json",

			success : function(resp){
				$("#result").html(resp.response);
				
			} //success
		
		});//ajax
	}); // onclick

}); //onload
</script>




</head>
<body>

Hello Boot warrup <br>
${hello}

<div id="result">

<img src="http://localhost:8081/bangtan.jpg"><br>
<img src="http://localhost:8081/upload/chat.png"><br>

</div>
<input type="button" value="ajax요청" id="ajaxbtn">





</body>
</html>