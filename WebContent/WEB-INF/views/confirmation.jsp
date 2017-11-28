<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration Confirmation</title>
<spring:url value="/resources/main.css" var="cssFile" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link href="${cssFile}" rel="stylesheet" />
</head>
<body>
<div>
<h2> Welcome ${newUser} !</h2>
<spring:url value="/resources/food-beans-coffee-drink.jpg" var="coffeePic" />
<img src="${coffeePic}" style="width:500px;height:300px;">
</div>
</body>
</html>