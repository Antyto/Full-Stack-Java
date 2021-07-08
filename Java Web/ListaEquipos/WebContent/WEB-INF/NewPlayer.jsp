<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Player</title>
</head>
<body>
<p>Create new player</p>
<form method="post" action="/ListaEquipos/teams?id=<%= request.getParameter("id") %>">
<p>First Name: <input type="text" name="first_name"></p>
<p>Last Name: <input type = "text" name = "last_name"></p>
<p>Age: <input type="number" name="age"></p>
<button>Add</button>
</form>
</body>
</html>