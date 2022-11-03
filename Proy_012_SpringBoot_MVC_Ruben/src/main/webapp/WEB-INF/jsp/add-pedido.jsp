<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fm"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A�adir pedido</title>

<link rel="stylesheet" href="../css/styles.css">


</head>
<body>

	<h2>A�adir Pedido</h2>

	<form:form action="add" method="post" modelAttribute="pedido">

		<div class="field">
			<form:label path="user">Usuario:</form:label>
			<form:input path="user" readonly="true" />
			<br />
		</div>

		<div class="field">
			<form:label path="desc">Descripci�n:</form:label>
			<form:textarea path="desc" />
			<form:errors path="desc"></form:errors>
			<br />
		</div>


		<form:button>A�adir</form:button>
	</form:form>




</body>
</html>