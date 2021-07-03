<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Tablero de Damas</title>

<body>
	<div class = "titulo">
	<!-- Getting and setting width and height -->
	<% 
		int width = 0;
		int height = 0;
		
		if(request.getParameter("width") != null) {
			width = Integer.parseInt(request.getParameter("width"));
		}
		
		if(request.getParameter("height") != null) {
			height = Integer.parseInt(request.getParameter("height"));
		} %>
		
		<h1>Tablero de Damas: <%= width %>w X <%= height %>h</h1>
	
	</div>
	
	<div class = "tablero">

		<% for(int i = 0; i < height; i++) { %>
			<% if (i % 2 == 0) { %>
				<div class = "columna">
					 <% for(int k = 0; k < width; k++) { %>
                			<% if(k % 2 == 0) { %>
                        		<div class="columna1"></div>
                  		<% } else { %>
                        		<div class="columna2"></div>
                    		<% } %>
               		 <% } %>
				</div>
				
			<% } else { %>
				<div class = "fila">
					<% for(int j = 0; j < width; j++) { %>
	                		<% if(j % 2 == 0) { %>
	                        <div class="fila1"></div>
	                    	<% } else { %>
	                        <div class="fila2"></div>
	                    	<% } %>
	                <% } %>
				</div>
			<% } %>   
        <% } %>
	</div>
	
</body>
</html>