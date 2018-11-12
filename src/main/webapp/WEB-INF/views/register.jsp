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
    	  var a = document.forms["myForm"]["name"].value;
    	  if (a == "" || a.length < 2 || a[0] != a[0].toUpperCase()) {
    	      alert("Please enter valid name(Xxxxxx).");
    	      return false;
    	  }
    	  
    	  var b = document.forms["myForm"]["lastname"].value;
    	  if (b == "" || b.length < 2 || b[0] != b[0].toUpperCase()) {
    	      alert("Please enter valid last name(Xxxxxx).");
    	      return false;
    	  }
    	  
    	  var c = document.forms["myForm"]["email"].value;
    	  atpos = c.indexOf("@");
    	  dotpos = c.lastIndexOf(".");
    	  if (c == "" || atpos < 1 || ( dotpos - atpos < 2 )) {
    	      alert("Please provide email address(##@mail.com).");
    	      return false;
    	  }
    	  
    	  var d = document.forms["myForm"]["number"].value;
    	  if (d == "" || (d.indexOf("-") !== 3 || d.lastIndexOf("-") !== 7)) {
    	      alert("Please provide Contact number(###-###-####).");
    	      return false;
    	  }
      }
</script>

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
			<form name="myForm" action="/user" onsubmit="return validate()" method="post">
				<fieldset>
					<legend>Registration:</legend>
						<br>
						Gender:<br>
  							<input type="radio" name="gender" value="male"> Male<br>
  							<input type="radio" name="gender" value="female"> Female<br>
  							<input type="radio" name="gender" value="other"> Other<br><br> 
						First Name: <input name="name"/><br><br>
						Last Name: <input name="lastname"/><br><br>
						Email: <input name="email"/><br><br>
						Phone Number: <input name="number"/><br><br>
						Create Password: <input type="password" name="pword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"/><br><br>
						Birthdate:
							<input type="date" name="bday">
  							<input type="submit" value="Send"><br><br>
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