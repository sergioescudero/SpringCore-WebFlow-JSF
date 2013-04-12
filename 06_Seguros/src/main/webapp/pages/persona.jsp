<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<title> </title>
</head>
<body>
Persona
	<sf:form action="introducirPersona.xhtml" modelAttribute="persona">
	
	
		Nombre: <sf:input path="nombre"/><br/>
		Apellidos: <sf:input path="apellidos"/><br/>
		DNI: <sf:input path="dni"/><br/>
		Dirección: <sf:input path="direccion"/><br/>
		Antiguedad: <sf:input path="antiguedad"/><br/>
		Edad: <sf:input path="edad"/><br/>
		Codigo Postal: <sf:input path="codigoPostal"/><br/>
		Poblacion: <sf:input path="poblacion"/>
		
		<input type="submit" value="salir"></input>
		<input type="submit" value="guardar"></input>
	
	
	
	</sf:form>
</body>
</html>