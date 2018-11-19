<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coffee cart</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%@include file="partial/header.jsp" %>
${message }
<div style="text-align:center" class="container">
	<div style="text-align:center">
		<h1>Thank you for Visiting</h1>
		<h1>Current Items In Your Cart</h1>
	</div>
		<div class="row">
			<div class="column">
			<form method="get" action="/viewcart">
				<table align="center">
					<c:forEach var="cartitem" items="${cartitems}">
					<tr>
						<td>Qty: ${cartitem.quantity}</td>
						<td>Item: ${cartitem.coffee.name}</td>
						<td>Price: $ ${cartitem.coffee.price}</td>
					</tr>
					</c:forEach>
				</table>
			</form>
    		</div>
		<div class="column">	
			<img src="giphy.gif" style="width:70%">
			<h3><a href="/list-coffee">go to menu</a></h3>
		<h3><a href="/register">go to registration</a></h3>
		<h3><a href="/">go to home page</a></h3>
		</div>
	</div>
</div>
	
</body>
</html>