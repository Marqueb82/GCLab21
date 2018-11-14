<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Page</title>
<link rel="stylesheet" href="style.css">

<script type="text/javascript">
	function validate(){
		var a = document.forms["myForm"]["password"].value;
  	  	if (a != "123GC") {
  	  		alert("Invalid password");
  	      	return false;
  	  	}
	}
</script>

</head>
<body>

	<div style="text-align:center" class="container">
		<h3>Hello GC Shop Employee.</h3>
		<h3>To continue please enter password:</h3>
		
		<form name="myForm" onsubmit="return validate()" action="/menu" method="post">
  			Password: <input type="password" name="password"><br>
  		<input type="submit" value="Submit">
  		
</form>
	</div>
	
</body>
</html>