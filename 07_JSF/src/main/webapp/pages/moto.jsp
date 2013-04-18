<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<title> </title>
</head>
<body>
Moto
	<sf:form action="introducirMoto.xhtml" modelAttribute="moto">
	
	
		Marca: <sf:input path="marca"/><br/>
		Modelo: <sf:input path="modelo"/><br/>
		Cilindrada: <sf:input path="cilindrada"/><br/>
		Antiguedad: <sf:input path="antiguedad"/><br/>
		Matricula: <sf:input path="matricula"/><br/>
		Bastidor: <sf:input path="bastidor"/><br/>
		
		<input type="submit" value="salir"></input>
		<input type="submit" value="guardar"></input>
	
	
	
	</sf:form>
</body>
</html>