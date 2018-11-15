<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
 ${message }
	<div style="text-align:center" class="container">
		<%@include file="partial/header.jsp" %>
		<h1 >Welcome to GC COFFEE</h1>
		<h3><a href="/list-coffee">See what we have!!</a></h3>
		<!-- <form action="/search-coffee">Search our Products: <input name="name"/></form> -->
		<p>☕☕☕</p>
		<img src="critter.gif" style="width:40%">
		<h2><a href="/admin">GC COFFEE EMPLOYEES</a></h2>
	</div>
	

</body>
</html>