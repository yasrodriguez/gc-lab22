<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>User Registration</title>
<spring:url value="/resources/main.css" var="cssFile" />
<spring:url value="/resources/formValidation.js" var="jsFormValidationFile" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
<link href="${cssFile}" rel="stylesheet" />
<script src="${jsFormValidationFile}"></script>
</head>
<body>
<h3><strong>Please fill the form to register!</strong></h3>
<div>
<form action="/CoffeeShopWebApp/addUser" name="registration" method="post">
<label>First Name:</label>
<input type="text" name="firstName"><br>
<label>Last Name:</label> 
<input type="text" name="lastName"><br>
<label>Email:</label>
<input type="email" name="email"><br>
<label>Phone:</label>
<input type="tel" name="phone"><br>
<label>Gender:</label><br>
<input type="radio" name="gender" value="male">Male<br>
<input type="radio" name="gender" value="female">Female<br>
<label>City: </label><br>
<select name="city">
<option value="Ann Arbor">Ann Arbor</option>
<option value="Detroit">Detroit</option>
<option value="Other">Other</option>
</select>
<br>
<label>Password:</label> 
<input type="password" name="password"><br>
<label>Mark all the types of drinks you like:</label> 
<fieldset>
<input type="checkbox" name="brewedCoffee" value="Brewed">Hot brewed coffee<br>
<input type="checkbox" name="icedCoffee" value="Iced">Iced coffee<br>
<input type="checkbox" name="espresso" value="Espresso">Espresso<br>
<input type="checkbox" name="latte" value="Latte">Latte<br>
<input type="checkbox" name="tea" value="Tea">Tea<br>
<input type="checkbox" name="chocolate" value="Chocolate">Hot Chocolate<br><br>
</fieldset>
<button type="submit">Register</button>
</form>
</div>

</body>
</html>