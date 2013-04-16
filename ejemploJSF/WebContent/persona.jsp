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
		Nombre:<h:inputText value="#{persona.nombre}" id="nombre" required="true" requiredMessage="Nombre Obligatorio">
		
		
		 <h:message for="nombre"></h:message>
		
		</h:inputText>
		    
      </div>
      
      <div>
		Apellidos:<h:inputText value="#{persona.apellidos}" id="apellidos" required="true" requiredMessage="Apellido Obligatorio">
		
		
		 <h:message for="apellios"></h:message>
		
		</h:inputText>
		    
      </div>
      
       <div>
		Direccion:<h:inputText value="#{persona.direccion}" id="direccion" required="true" requiredMessage="Direccion Obligatorio">
		
		
		 <h:message for="direccion"></h:message>
		
		</h:inputText>
		
		 <div>
      
      		Poblacion:<h:inputText value="#{persona.poblacion}" id="poblacion" required="true" requiredMessage="Poblacion Obligatorio">
		
	    	 <h:message for="poblacion"></h:message>
		
		</h:inputText>
      
      </div>
      
      		 <div>
      
      		CP:<h:inputText value="#{persona.codigoPostal}" id="codigoPostal" required="true" requiredMessage="codigoPostal Obligatorio">
		
	    	 <h:message for="codigoPostal"></h:message>
		
		</h:inputText>
      
      </div>
		
		<div>
		DNI:<h:inputText value="#{persona.dni}" id="dni" required="true" requiredMessage="DNI Obligatorio">
		
		
		 <h:message for="dni"></h:message>
		
		</h:inputText>
		    
      </div>
      
      	<div>
		EDAD:<h:inputText value="#{persona.edad}" id="edad" required="true" requiredMessage="EDAD Obligatorio">
		
	    	 <h:message for="edad"></h:message>
		
		</h:inputText>
		
		 </div>
		 
		 <div>
		 
		  CARNETS:  <h:selectManyListbox size="5">
			
			<f:selectItems value="#{persona.listaTiposCarnets}" />
			
	</h:selectManyListbox>
		
		
		<div>
		<h:commandButton value="Enviar" action="ok"/>
		
	</div>
	
		
     
      
      </div>
	


</h:form>
		

</f:view>
</body>
</html>