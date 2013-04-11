<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<title> </title>
</head>
<body>
Los datos a introducir:
	<sf:form action="verifica.xhtml" modelAttribute="login">
		Username: <sf:input path="usuario"/><br/>
		Password: <sf:input path="clave"/><br/>
		
		<input type="submit" value="verificar"></input>
	
	
	
	
	</sf:form>
</body>
</html>