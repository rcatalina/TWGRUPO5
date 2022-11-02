<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>


<style>
body {
	background-color: black;
	color: antiquewhite;
	font-family: Arial;
}

.color-magenta {
	color: magenta;
}

.color-cyan {
	color: cyan;
}

.color-green {
	color: green;
}
</style>
</head>
<body>

	<h1>Lista de pedidos</h1>
	<h2>Usuario: ${nombre}</h2>

	<c:forEach items="${lista}" var="order">
		<div>
			<span class="color-magenta">ID:</span> ${order.id}
		</div>
		<div>
			<span class="color-cyan">Title:</span> ${order.title}
		</div>
		<div>
			<span class="color-green">Total price:</span> ${order.totalPrice}
			&euro;
		</div>
		<br>
	</c:forEach>
</body>
</html>