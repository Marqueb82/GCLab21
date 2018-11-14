<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Access</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div class="container">
	
	
	<table align="center">
			<tr>
				<th>Product ID</th><th>Coffee</th><th>Description</th><th>Cost</th>
			</tr>
			<c:forEach var="coffee" items="${coffees}">
				<tr>
					<td>${coffee.id}</td><td>${coffee.name}</td><td>${coffee.description}</td><td>$ ${coffee.price}</td>
				</tr>
			</c:forEach>
	</table>
	
	<h2><a href="/empAdd">Add to Inventory</a></h2>
	
	
	<h2><a href="/search">Edit item in Inventory</a></h2>
	<h2><a href="/deletesearch">Delete item in Inventory</a></h2>
	<h2><a href="/">Back to home page.</a></h2>
	
	</div>
	
</body>
</html>