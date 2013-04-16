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

	<div>
		Usuario:<h:inputText value="#{login.usuario}" id="usuario">
		
		 <f:validator validatorId="mi"/> 
		 <h:message for="usuario"></h:message>
		
		</h:inputText>
		    
         <h:selectOneMenu valueChangeListener="#{login.eventoFechas}" onchange="submit()">
			
			<f:selectItems value="#{login.listapaises}"/>
			
		</h:selectOneMenu> 
		
		
		<h:outputLabel value="#{login.mes}"></h:outputLabel>
			    
	</div>
	<div>
		Clave:<h:inputSecret value="#{login.clave}" required="true" id="pass" requiredMessage="clave obligatoria" />
		
		 <h:message for="pass"></h:message>
	</div>
	<div>
		Fecha:<h:inputText value="#{login.fecha}">
		
		<f:convertDateTime pattern="dd/MM/yyyy"/>
		
		</h:inputText>
	</div>
	<div>
		<h:commandButton value="Enviar" action="#{login.validar }"/>
		
	</div>
	


</h:form>
		

</f:view>
</body>
</html>