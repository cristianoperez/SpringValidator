<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar cliente</title>
</head>
<body>
	
	<form action="adicionaCliente" method="post">
		Nome:
		<input name="nome" />
		<form:errors path="cliente.nome" cssStyle="color:red;" />
		<br />
		Email:
		<input name="email"/>
		<form:errors path="cliente.email" cssStyle="color:red;" />
		<br />
		<input type="submit" value="Adicionar">
	</form>
</body>
</html>