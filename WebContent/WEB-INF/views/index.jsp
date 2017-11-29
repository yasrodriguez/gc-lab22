<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Coffee Shop App</title>
</head>
<body>
	<br>
	<div style="text-align:center">
		<h2>Welcome to GC COFFEE! <a href="register">Register</a> here.</h2>
	</div>
	<table border="1">
		<c:forEach var="myVar" items="${itemList}">
			<tr>
				<td>${myVar.itemId}</td>
				<td>${myVar.itemName}</td>
				<td>${myVar.description}</td>
				<td>${myVar.quantity}</td>
				<td>${myVar.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>