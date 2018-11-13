<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Our Coffee:</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div style="text-align:center" class="container">
		<h2>Selected item:</h2>
		<h3>This item is ${coffee.name}</h3>
		<h3>Item cost is $ ${coffee.price}</h3>
		<h3>Customers description ${coffee.description}</h3>
		
		<img src="giphy.gif" style="width:40%">
		
		<h3><a href="/register">go back to registration</a></h3>
		<h3><a href="/">go back to home page</a></h3>
	</div>
</body>
</html>