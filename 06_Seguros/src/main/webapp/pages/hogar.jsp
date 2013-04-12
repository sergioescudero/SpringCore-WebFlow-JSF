<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<title> </title>
</head>
<body>
Hogar
	<sf:form action="introducirHogar.xhtml" modelAttribute="hogar">
	
	
		calle: <sf:input path="calle"/><br/>
		portal: <sf:input path="portal"/><br/>
		piso: <sf:input path="piso"/><br/>
		escalera: <sf:input path="escalera"/><br/>
		puerta: <sf:input path="puerta"/><br/>
		m2: <sf:input path="m2"/><br/>
		hipoteca: <sf:checkbox path="hipoteca"/><br/>
		alquilado: <sf:checkbox path="alquilado"/><br/>
		
		<input type="submit" value="salir"></input>
		<input type="submit" value="guardar"></input>
		
			
	
	
	</sf:form>
</body>
</html>