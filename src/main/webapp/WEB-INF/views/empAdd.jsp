<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-*">
<title>Add new item.</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div class="container">
	
	<h2>Add new product screen:</h2>
	<form name="myForm" action="/menu" method="post">
		<fieldset>
			<legend>Product:</legend>
				<br> 
				Product name: <input name="name"/><br><br>
				Product description: <input name="description"/><br><br>
				Product Price: <input name="price"/><br><br>
				<button>Submit</button>
				<br>
		</fieldset>	
	</form>
	
	</div>

</body>
</html>