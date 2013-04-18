<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<sf:form modelAttribute="login" action="${flowExecutionUrl}&_eventId=ok1">

UNO

		Username: <sf:input path="usuario"/><br/>
		Password: <sf:input path="clave"/><br/>
		
		<sf:button>enviar</sf:button>
		
		${persona.nombre}
		${persona.apellidos}
		${persona.dni}

</sf:form>


