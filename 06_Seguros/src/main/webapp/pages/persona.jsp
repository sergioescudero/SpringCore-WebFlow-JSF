<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<title> </title>
</head>
<body>
Persona
	<sf:form action="verifica.xhtml" modelAttribute="login">
	
	
		Nombre: <sf:input path="nombre"/><br/>
		Apellidos: <sf:input path="apellidos"/><br/>
		DNI: <sf:input path="dni"/><br/>
		Dirección: <sf:input path="direccion"/><br/>
		Antiguedad: <sf:input path="antiguedad"/><br/>
		Edad: <sf:input path="edad"/><br/>
		Codigo Postal: <sf:input path="codigoPostal"/><br/>
		
		<input type="submit" value="verificar"></input>
	
	
	
	</sf:form>
</body>
</html>