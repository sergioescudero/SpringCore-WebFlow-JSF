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
<strong>HOGAR</strong><br>
<sf:form action="${flowExecutionUrl}&_eventId=hogarok" modelAttribute="hogar">	
CALLE<sf:input path="calle"/><br>
PORTAL<sf:input path="portal"/><br>
PISO<sf:input path="piso"/><br>
ESCALERA<sf:input path="escalera"/><br>
PUERTA<sf:input path="puerta"/><br>
METROS CUADRADOS<sf:input path="m2"/><br>
HIPOTECA<sf:checkbox path="hipoteca"/>
ALQUILADO<sf:checkbox path="alquilado"/>
<sf:button>GUARDAR</sf:button><br>
<a href="${flowExecutionUrl}&_eventId=personaok">Volver a persona</a>
<a href="${flowExecutionUrl}&_eventId=motook">Volver a moto</a>
<a href="${flowExecutionUrl}&_eventId=cocheok">Volver a coche</a>
</sf:form>


</body>
</html>