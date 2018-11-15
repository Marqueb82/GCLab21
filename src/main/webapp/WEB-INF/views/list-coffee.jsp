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
	
		<form action="/cart/add">
		<table align="center">
			<tr>
				<th>Coffee</th><th>Description</th><th>Cost</th><th>Item Select</th>
			</tr>
			<c:forEach var="coffee" items="${coffees}">
				<tr>
					<td>${coffee.name}</td><td>${coffee.description}</td><td>$ ${coffee.price}</td><td><button name="id" type="submit" value="${coffee.id }">Select</button></td>
				</tr>
			</c:forEach>
		</table>
		</form>
		<h3><a href="/register">go to registration</a></h3>
		<h3><a href="/viewcart">go to cart</a></h3>
		<h3><a href="/">go back to home page</a></h3>
		
	</div>
	
</body>
</html>