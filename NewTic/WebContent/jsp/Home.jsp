<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${obj.result}
<script type="text/javascript">
function clickAndDisable(link) {
    link.onclick = function(event) {
       event.preventDefault();
    }
  }   
</script>
<br><br>
     <a  href="ChangeStateaction?id=1" id='get' onClick=""><input type="submit" value="${obj.b1}"  style="height: 50px; width: 50px; left: 250; top: 250;" /></a>  <a href="ChangeStateaction?id=2"><input type="submit" value="${obj.b2}"  style="height: 50px; width: 50px; left: 250; top: 250;" /></a>    <a href="ChangeStateaction?id=3"><input type="submit" value="${obj.b3}"  style="height: 50px; width: 50px; left: 250; top: 250;" /></a>  <br><br>
<a href="ChangeStateaction?id=4"><input type="submit" value="${obj.b4}"  style="height: 50px; width: 50px; left: 250; top: 250;" /></a>    <a href="ChangeStateaction?id=5"><input type="submit" value="${obj.b5}"  style="height: 50px; width: 50px; left: 250; top: 250;" /></a>    <a href="ChangeStateaction?id=6"><input type="submit" value="${obj.b6}"  style="height: 50px; width: 50px; left: 250; top: 250;" /></a>   <br><br>
<a  href="ChangeStateaction?id=7"><input type="submit" value="${obj.b7}" style="height: 50px; width: 50px; left: 250; top: 250;"/></a>   <a href="ChangeStateaction?id=8"><input type="submit" value="${obj.b8}"  style="height: 50px; width: 50px; left: 250; top: 250;" /></a>       <a href="ChangeStateaction?id=9"><input type="submit" value="${obj.b9}"  style="height: 50px; width: 50px; left: 250; top: 250;" /></a>    



</body>
</html>