<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/assets/css/style.css">
	<meta charset="UTF-8">
	<title>Button Clicker</title>
</head>

<body>
	<!-- This displays the current count and whenever the button is clicked
		it reloads the page which then runs the method in our Main controller and increases
		the count in session: -->
	<div class="container">
		<h1>Contaremos las veces que presionas el boton!</h1>
		<a href="/BotonClicker/Boton"><button>Click Me!</button></a>
		<h1>Haz hecho click <c:out value="${count}"/> veces!</h1>
	</div>
</body>
</html>