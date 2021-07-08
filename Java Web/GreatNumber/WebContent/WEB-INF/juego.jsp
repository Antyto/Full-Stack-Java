<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Great Number Game</title>
	<style>
		.contenedor {
			text-align: center;
			width: 900px;
			height: auto;
			margin: 0 auto;
			border: 3px solid black;
		}
		.cuadro {
			width: 300px;
			height: auto;
			margin: auto;
			border: 2px solid black;
			padding: 0px;
		}
		#acierto {
			width: 300px;
			height: 185px;
			display: inline-block;
			padding-top: 18%;
			background-color: green;
			color: white;
		}
		#mensajeAlto {
			width: 300px;
			height: 185px;
			display: inline-block;
			padding-top: 30%;
			background-color: red;
			-webkit-text-fill-color: white;
		}
		#mensajeBajo {
			width: 300px;
			height: 185px;
			display: inline-block;
			padding-top: 30%;
			background-color: red;
			-webkit-text-fill-color: white;
		}
	</style>
</head>

<body>
	<div class="contenedor">
		<h1>Welcome to the Great Number Game!</h1>
		<h2>I am thinking of a number between 1 and 100</h2>
		<h2>Take a guess!</h2>
		<div class="cuadro">
			<% String theResponse = (String) session.getAttribute("response"); %>
			<% if(theResponse == "correct"){ %>
				<div id="acierto">
					<h1>Congratulations! You found the number!</h1>
					<a href="/GreatNumber/Refresh"><button>Play Again?</button></a>
				</div>
			<% } else if(theResponse == "low"){%>
					<div id="mensajeBajo">
						<h1>Too low!</h1>
					</div>
			<% } else if(theResponse == "high"){ %>
					<div id="mensajeAlto">
						<h1>Too high!</h1>
					</div>
			<% } %>
		</div>
		<form action="/GreatNumber/Juego" method="post">
			<p><input type="number" name="numero"></p>
			<p><input type="submit" value="Submit"></p>
		</form>	
	</div>
</body>
</html>