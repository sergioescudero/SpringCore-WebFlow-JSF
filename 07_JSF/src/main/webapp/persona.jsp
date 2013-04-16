<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<html>
<head>
<title> </title>
</head>
<body>
<f:view>
Persona
<h:form>
	Nombre: <h:inputText value="#{persona.nombre}" id="nombre" required="true" requiredMessage="El nombre es obligatorio"/><h:message for="nombre"/><BR/>
	Apellidos: <h:inputText value="#{persona.apellidos}" id="apellidos" required="true" requiredMessage="Los apellidos son obligatorio"/><h:message for="apellidos"/><BR/>
	DNI: <h:inputText value="#{persona.dni}" id="dni" required="true" requiredMessage="El dni es obligatorio"/><h:message for="dni"/><BR/>
	Dirección: <h:inputText value="#{persona.direccion}" id="direccion" required="true" requiredMessage="La direccion es obligatorio"/><h:message for="direccion"/><BR/>
	Antiguedad: <h:inputText value="#{persona.antiguedad}" id="antiguedad" required="true" requiredMessage="La antiguedad es obligatorio"/><h:message for="antiguedad"/><BR/>
	Edad: <h:inputText value="#{persona.edad}" id="edad" required="true" requiredMessage="La edad es obligatoria"/><h:message for="edad"/><BR/>
	Codigo Postal: <h:inputText value="#{persona.codigoPostal}" id="codigoPostal" required="true" requiredMessage="El código postal es obligatorio"/><h:message for="codigoPostal"/><BR/>
	Poblacion: <h:inputText value="#{persona.poblacion}" id="poblacion" required="true" requiredMessage="La población es obligatoria"/><h:message for="poblacion"/><BR/>

 	CARNETS:<h:selectManyListbox size="5" >
				<f:selectItems value="#{persona.obtenerListaCarnets()}" id="#{persona.carnet}"/>
		</h:selectManyListbox>
		
		<h:commandButton value="A validar" action="#{persona.validar}"></h:commandButton>
	
	
	
	</h:form>
</f:view>
</body>
</html>