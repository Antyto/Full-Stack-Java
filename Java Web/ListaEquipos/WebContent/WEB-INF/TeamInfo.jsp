<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.antyto.web.models.Team" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Roster Team Information</title>
</head>
<body>
<a href="/ListaEquipos/Teams">New Team</a>
<table>
<tr><th>Team</th><th>Players</th><th>Action</th></tr>

<%for(int i = 0; i < Team.getTeams().size();i++){ %>
<tr>
<td><%= Team.getTeams().get(i).getTeam_name() %></td><td><%= Team.getTeams().get(i).getPlayers().size() %></td><td><a href="/ListaEquipos/teams?id=<%=i%>">Details</a> <a href="/TeamRoster/teams?id=<%=i%>&delete=true">Delete</a></td>
</tr>
<%} %>

</table>
</body>
</html>