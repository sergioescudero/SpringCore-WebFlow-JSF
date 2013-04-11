<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> </title>
</head>
<body>Las ciudades
	<c:forEach var="ciudad" items="${string}">
 	 <tr><td>${ciudad}</td></tr>
</c:forEach>
</body>
</html>