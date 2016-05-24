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


<body style="background-color:white;">
       <div class="nav">
  <ul class="pull-left">
        
          <li><a href="index.jsp" style="color:rgb(158, 55, 149); font-family:oswald; font-size:200%;">Log out</a></li>
          <li><a href="my_home_page.jsp"style="color:rgb(158, 55, 149); font-family:oswald; font-size:200%;">Search contacts</a></li>
          <li><a href="add_contact.jsp"style="color:rgb(158, 55, 149); font-family:oswald; font-size:200%;">Add contacts</a></li>
          <li><a href="list_contact.jsp"style="color:rgb(158, 55, 149); font-family:oswald; font-size:200%;">List contacts</a></li>
        </ul>
		</div>
		
		<br>
		<br>
		<div class="container">
		<h1>Add Contact</h1>


		<form class="form-horizontal" action="edit" method="post">

			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="name" name="name"
						value="${contact.name }" />
				</div>
			</div>

			<div class="form-group">
				<label for="lastname" class="col-sm-2 control-label">Last
					Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="lastname"
						name="lastname" value="${contact.lastname}">
				</div>
			</div>


			<div class="form-group">
				<label for="email" class="col-sm-2 control-label">Email</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" id="email" name="email"
						value="${contact.email}">
				</div>
			</div>


			<div class="form-group">
				<label for="phone" class="col-sm-2 control-label">Phone #</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="phone" name="phone"
						value="${contact.phone}">
				</div>
			</div>

			<input type="hidden" name="id" value="${contact.contactId}">

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</div>
		</form>
		

</body>
</html>