<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<title> </title>
</head>
<body>
Persona
	<sf:form modelAttribute="login" action="${flowExecutionUrl}&_eventId=ok1">
	
	
		Nombre: <sf:input path="nombre"/><br/>
		Apellidos: <sf:input path="apellidos"/><br/>
		DNI: <sf:input path="dni"/><br/>
		Dirección: <sf:input path="direccion"/><br/>
		Antiguedad: <sf:input path="antiguedad"/><br/>
		Edad: <sf:input path="edad"/><br/>
		Codigo Postal: <sf:input path="codigoPostal"/><br/>
		Poblacion: <sf:input path="poblacion"/>
		
		<sf:button>Coche</sf:button>
		<sf:button>Moto</sf:button>
	
	
	
	</sf:form>
</body>
</html>