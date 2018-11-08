<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
	<div style="text-align:center">
		<h1>Thank you ${name}</h1>
	</div>
	<div class="row">
		<div class="column">
      		<h2>We have your contact info as:</h2>
			<ul class="form">
  				<li> Contact number: ${number}</li>
  				<li> Contact email: ${email}</li>
			</ul>
			<h2>Hope to see you soon!</h2>
			<h3><a href="/register">go back to registration</a></h3>
			<h3><a href="/">go back to home page</a></h3>
    	</div>
		<div class="column">
			<img src="smiley.jpg" style="width:60%">
		</div>
	</div>
</div>
	
</body>
</html>