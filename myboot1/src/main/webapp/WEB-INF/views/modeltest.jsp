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
<%-- 	alert('<%=request.getAttribute("getit")%>'); 
 --%>

 const a = '${getit}'; 

 const b = document.querySelector("#here").value;
 
 const c = $("#here").val();
alert(c);

$("#div2").html($("#here").val() + "입니다"); 
 
 
 
});
</script>




</head>
<body>
<h1>모델테스트</h1>

받아옴 자바로 : <%=request.getAttribute("getit") %> 자바 <br> 
받아옴 EL 로 : ${getit} 이엘 <br> 

자바로 파라미터 받아옴 : <%=request.getParameter("power") %> <br> 
EL 로 파라미터 받아옴 : ${param.power}
<br>
<hr>
<div>
${param.power}
</div>
<hr> 
<input type="text" value="hoho" id="here"> 


<div id="div2"> 

</div>

</body>
</html>