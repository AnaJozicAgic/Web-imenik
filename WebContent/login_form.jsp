<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Phonebook</title>
<!-- Bootstrap -->
<link href="css/bootstrap-3.3.6-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap-3.3.6-dist/css/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>

<body style="background-color: white;">
	<div class="nav">
		<ul class="pull-right-side">

			<li><a href="index.jsp"
				style="color: rgb(158, 55, 149); font-family: oswald; font-size: 200%;">Home</a></li>
			<li><a href="login_form.jsp"
				style="color: rgb(158, 55, 149); font-family: oswald; font-size: 200%;">Login</a></li>
			<li><a href="register_form.jsp"
				style="color: rgb(158, 55, 149); font-family: oswald; font-size: 200%;">Register</a></li>

		</ul>
	</div>
	<br>
	<br>

	<div class="container">


		<img src="img/kljuc.png" alt="width:304px;height:228px;"
			style="float: left; width: 504px; height: 378px;"> <br> <br>
		<h1
			style="font-family: oswald; color: rgb(146, 27, 135); text-align: left; font-size: 200%;">LOG
			IN HERE :</h1>
		<br> <br>
		<form class="form" id="login" action="login" method="post">
			<div class="form-group" style="text-align: left; float: left;">
				<label for="username"
					style="font-family: oswald; color: rgb(146, 77, 135); text-align: right;">Username:</label>
				<input type="text" class="form-control" id="username" name ="username"
					placeholder="Enter username">
			</div>
			<br> <br>
			<div class="form-group" style="text-align: left; float: left;">
				<label for="password"
					style="font-family: oswald; color: rgb(146, 77, 135); text-align: right;">Password:</label>
				<input type="password" class="form-control" id="password" name = "password"
					placeholder="Enter password">

			</div>
			<br></br>
			<br></br>
			<br></br>
			<br></br>
			<button type="submit" class="btn btn-default"
				style="font-family: oswald; color: rgb(146, 77, 135);">Login &raquo;</button>
		</form>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>