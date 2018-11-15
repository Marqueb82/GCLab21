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
<script type="text/javascript">
      //Form validation currently only for firstname,lastname, email and phone number.
      function validate()
      {
    	  var a = document.forms["myForm"]["customername"].value;
    	  if (a == "" || a.length < 2 || a[0] != a[0].toUpperCase()) {
    	      alert("Please enter valid name(Xxxxxx).");
    	      return false;
    	  }
    	  
    	  var b = document.forms["myForm"]["password"].value;
    	  if (b == "") {
    	      alert("Please enter password");
    	      return false;
    	  }
    	  
      }
</script>

</head>
<body>
<%@include file="partial/header.jsp" %>
${message }
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
			<form name="myForm" action="/user" onsubmit="return validate()" method="post">
				<fieldset>
					<legend>Registration:</legend>
						<br> 
						Customer Name: <input name="customername"/><br><br>
						User Name: <input name="username"/><br><br>
						Create Password: <input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"/><br><br>
						Confirm Password: <input type="password" name="confirm-password"/><br><br>
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