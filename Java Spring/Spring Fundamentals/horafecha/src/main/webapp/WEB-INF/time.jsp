<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>Time!</title>
</head>
<body>
<span id='time'><c:out value="${time}"/></span>
<br>
<a href="/">Back</a>
</body>
</html>