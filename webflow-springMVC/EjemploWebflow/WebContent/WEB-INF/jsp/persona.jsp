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
<strong>PERSONA</strong><br>
<sf:form action="${flowExecutionUrl}&_eventId=personaok" modelAttribute="persona">	
NOMBRE<sf:input path="nombre"/><br>
APELLIDOS<sf:input path="apellidos"/><br>
DNI<sf:input path="dni"/><br>
ANTIGUEDAD<sf:input path="antiguedad"/><br>
EDAD<sf:input path="edad"/><br>
DIRECCION<sf:input path="direccion"/><br>
CODIGO POSTAL <sf:input path="codPostal"/><br>
POBLACION<sf:input path="poblacion"/><br>
<sf:button>CONTINUAR</sf:button>
</sf:form>
<a href="${flowExecutionUrl}&_eventId=motook">Ir a moto</a>
<a href="${flowExecutionUrl}&_eventId=cocheok">Ir a coche</a>
<a href="${flowExecutionUrl}&_eventId=hogarok">Ir a hogar</a>

</body>
</html>