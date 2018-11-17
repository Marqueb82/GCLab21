<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Our Coffee</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%@include file="partial/header.jsp" %>
${message }
<div style="text-align:center" class="container">
	<h1>Coffee List</h1>
	
		<form method="get" action="/viewcart">
		<table align="center">
			<tr>
				<th>Coffee</th><th>Description</th><th>Cost</th><th>Item Select</th>
			</tr>
			<c:forEach var="coffee" items="${coffees}">
				<tr>
					<td>${coffee.name}</td><td>${coffee.description}</td><td>$ ${coffee.price}</td>
					<td><a href="/cart/add?id=${coffee.id }" class="btn btn-secondary mb-2">Add</a></td>
				</tr>
			</c:forEach>
		</table>
		</form>
		<h2>${message }</h2>
		<h3><a href="/register">go to registration</a></h3>
		<h3><a href="/viewcart">go to cart</a></h3>
		<h3><a href="/">go back to home page</a></h3>
		
	</div>
	
</body>
</html>