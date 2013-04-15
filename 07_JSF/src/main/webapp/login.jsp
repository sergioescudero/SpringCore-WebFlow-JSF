<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
	<h:form>
		<h:inputText value="#{login.usuario}" id="usuario">
			<f:validator validatorId="loginvalidador"/>
			 
		</h:inputText><BR/>
		<h:inputSecret required="true" requiredMessage="La pwd es obligatoria" value="#{login.clave}" id="password"></h:inputSecret><BR/>
		dd/mm/aaaa<h:inputText value="#{login.fecha}">
					<f:convertDateTime pattern="dd/MM/yyyy"/>
					
		</h:inputText><BR/>
		
		<h:selectOneMenu valueChangeListener="#{login.eventoFechas}" onchange="submit()">
			<f:selectItems value="#{login.listPaises}"/>
		</h:selectOneMenu><BR/>
		<h:outputLabel value="#{login.mes}" /><BR/>
		
	<h:message for="usuario">metelo bien</h:message><BR/>
	<h:message for="password"/><BR/>
	
		<h:commandButton value="A autenticarse" action="#{login.validar}"></h:commandButton>
	</h:form>

</f:view>
</body>
</html>