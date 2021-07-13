<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<!DOCTYPE html>
<html>
<head>
	<title>Ninja Gold</title>
</head>
<body>
	<div id="container">
		<form id="score">
			
			<label for="score">Your Gold:</label>
			<input type="text" name="score" value=<c:out value="${gold}"/> readonly>
		</form>
		<div id="categorias">
			<div id="farm" class="box">
				<h2>Farm</h2>
				<p>(earns 10-20 gold)</p>
				<form action="process_money" method="post">
					
					<input type="hidden" name="building" value="farm">
					<input type="submit" value="Find Gold!">		
				</form>
			</div>
			<div id="cave" class="box">
				<h2>Cave</h2>
				<p>(earns 5-10 gold)</p>
				<form action="process_money" method="post">
					
					<input type="hidden" name="building" value="cave">
					<input type="submit" value="Find Gold!">		
				</form>
			</div>
			<div id="house" class="box">
				<h2>House</h2>
				<p>(earns 2-5 gold)</p>
				<form action="process_money" method="post">
					
					<input type="hidden" name="building" value="house">
					<input type="submit" value="Find Gold!">		
				</form>
			</div>
			<div id="casino" class="box">
				<h2>Casino</h2>
				<p>(earns/takes 0-50 gold)</p>
				<form action="process_money" method="post">
					
					<input type="hidden" name="building" value="casino">
					<input type="submit" value="Find Gold!">		
				</form>
			</div>
		</div>
		<div id="activitidades">
			<p>Activities:</p>
			<div id="box1">
			<c:forEach var="i" begin="0" end="${size}">
				<p class="<c:out value="${updates.get(i).get(0)}"/>"><c:out value="${updates.get(i).get(1)}"/> <c:out value="${updates.get(i).get(2)}"/></p>
			</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>