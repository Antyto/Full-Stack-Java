<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Dojo Survey</title>
	<style>
	#main{
		display: flex;
		flex-direction: column;
		align-items: center;
	}
	input, select, textarea{
		width: 100%;		
	}
	
	</style>
</head>
<body>
<div id='main'>
<fieldset>
	<legend>Dojo Survey</legend>
	<form method="POST" action="/survey">
	Your Name: <input name="name" type="text"><br>
	Dojo Location: <select name="location">
	<option value="Lautaro">Lautaro</option>
	<option value="Temuco">Temuco</option>
	<option value="Lonquimay">Lonquimay</option>
	</select>
	<br>
	Favorite Language: <select name="langauge">
	<option value="Java">Java</option>
	<option value="JavaScript">JavaScript</option>
	<option value="Python">Python</option>
	</select>
	<br>
	Comment (Optional): <textarea name="comment"></textarea>
	<input type="submit" value="Submit">
	</form>
</fieldset>
</div>
</body>
</html>

