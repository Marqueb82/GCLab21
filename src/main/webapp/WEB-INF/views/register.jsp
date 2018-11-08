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
<div class="container">
	<div style="text-align:center">
		<h1>Thank you for Visiting</h1>
		<h1>While your here fill out the form to register!</h1>
	</div>
	<div class="row">
		<div class="column">
      		<img src="coffeeyummy.jpg" style="width:60%">
    	</div>
		<div class="column">
			<form action="/user" method="post">
				<h3 class="form">
					First Name:<br> 
					<input name="name"/>
				</h3>	
				<h3 class="form">
					Last Name:<br>
					<input name="lastname"/>
				</h3>
				<h3 class="form">
					Email:<br> 
					<input name="email"/>
				</h3>
				<h3 class="form">
					Phone Number:<br> 
					<input name="number"/>
				</h3>
				<h3 class="form">
					Create Password: (At least 1 lowercase and 1 uppercase letter - 8 total characters )<br> 
					<input type="password" name="pword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"/>
				</h3>
				<h3 class="form">
					<button>Submit</button>
				</h3>		
			</form>
		</div>
	</div>
</div>
	
</body>
</html>