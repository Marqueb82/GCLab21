<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new item.</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div class="container">
	
	<h2>Edit product screen:</h2>
	<form name="myForm" action="/menu/edit" method="post">
		<fieldset>
			<legend>Product:</legend>
				<br> 
				<input type="hidden" name="id" value="${coffee.id}"/>
				Product name: <input name="name" value="${coffee.name}"/><br><br>
				Product description: <input name="description" value="${coffee.description}"/><br><br>
				Product Price: <input name="price" value="${coffee.price}"/><br><br>
				<button>Submit</button>
				<br>
		</fieldset>	
		<h2><a href="/menu">Back to employee main menu.</a></h2>
	</form>
	
	</div>

</body>
</html>