<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${persona.nombre}
INICIO<a href="${flowExecutionUrl}&_eventId=ok1">PASAR AL SIGUIENTE ESTADO</a><br>
<sf:form action="${flowExecutionUrl}&_eventId=ok1" modelAttribute="login">
Usuario:<sf:input path="usuario"/><br>
Clave:<sf:input path="clave"/><br>
<sf:button>ENVIAR</sf:button>
</sf:form>

</body>
</html>