<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
<%@include file="partial/header.jsp" %>
${message }
<div class="container">
	<div style="text-align:center">
		<h1>Welcome Valued Customer.</h1>
		<h1>Please sign in:</h1>
	</div>
	<div class="row">
		<div class="column">
      		<img src="coffeeyummy.jpg" style="width:60%">
    	</div>
		<div class="column">
		<h3>${message }</h3>
			<form name="myForm" action="/login" method="post">
				<fieldset>
					<legend>Login:</legend>
						<br> 
						User Name: <input name="username"/><br><br>
						Password: <input type="password" name="password"/><br><br>
						<br>
						<button>Submit</button>
						<br>
				</fieldset>	
			</form>
			<h3><a href="/">go back to home page</a></h3>
			<h3><a href="/list-coffee">check our inventory</a></h3>
		</div>
	</div>
</div>
	
</body>
</html>