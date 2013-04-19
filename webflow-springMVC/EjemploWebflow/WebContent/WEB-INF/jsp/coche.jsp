<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<strong>COCHE</strong><br>
<sf:form  action="${flowExecutionUrl}&_eventId=cocheok" modelAttribute="coche">	
MARCA<sf:input path="marca"/><br>
MODELO<sf:input path="modelo"/><br>
CILINDRADA<sf:input path="cilindrada"/><br>
ANTIGUEDAD<sf:input path="antiguedad"/><br>
MATRICULA<sf:input path="matricula"/><br>
BASTIDOR<sf:input path="bastidor"/><br>
<sf:button>CONTINUAR</sf:button><br>
<a href="${flowExecutionUrl}&_eventId=personaok">Volver a pesona</a>
<a href="${flowExecutionUrl}&_eventId=motook">Volver a moto</a>
<a href="${flowExecutionUrl}&_eventId=hogarok">Hogar</a>
</sf:form>


</body>
</html>