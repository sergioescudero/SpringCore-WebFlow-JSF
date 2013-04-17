<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<html>
<head>
<title> </title>
</head>
<body>

<f:view>
Coche
<h:form>
	Marca: <h:inputText value="#{coche.marca}" id="marca" required="true" requiredMessage="La marca es obligatoria"/><h:message for="marca"/><BR/>
	Modelo: <h:inputText value="#{coche.modelo}" id="modelo" required="true" requiredMessage="El modelo es obligatorio"/><h:message for="modelo"/><BR/>
	Cilindrada: <h:inputText value="#{coche.cilindrada}" id="cilindrada" required="true" requiredMessage="La cilindrada es obligatoria"/><h:message for="cilindrada"/><BR/>
	Antiguedad: <h:inputText value="#{coche.antiguedad}" id="antiguedad" required="true" requiredMessage="La antiguedad es obligatoria"/><h:message for="antiguedad"/><BR/>
	Matrícula: <h:inputText value="#{coche.matricula}" id="matricula" required="true" requiredMessage="La matricula es obligatoria"/><h:message for="matricula"/><BR/>
	Bastidor: <h:inputText value="#{coche.bastidor}" id="bastidor" required="true" requiredMessage="El bastidor es obligatorio"/><h:message for="bastidor"/><BR/>
		
		<h:commandButton value="A validar" action="#{coche.validar}"></h:commandButton>
	
	
	
	</h:form>
</f:view>
Coche

	<sf:form action="introducirCoche.xhtml" modelAttribute="coche">
	
	
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