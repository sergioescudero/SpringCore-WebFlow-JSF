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

	<div>Marca<h:inputText value="#{coche.marca}" id="marca" required="true" requiredMessage="Marca Obligatorio">
		
		
		 <h:message for="nombre"></h:message>
		
		</h:inputText>
		    
      </div>
      
     
		
		
		<div>
		<h:commandButton value="Enviar" action="ok"/>
		
	</div>
	
		
     
      
	


</h:form>
		

</f:view>
</body>
</html>