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
   <h1 style="font-family:oswald; color:rgb(146, 27, 135); text-align:center; font-size:400%;">WEB PHONE BOOK</h1>  
   <div class="container">
		<h1>Contact List</h1>

		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Phone</th>
					<th>Edit</th>
					<th>Delete</th>

				</tr>
			</thead>
			<tbody>

				<c:forEach items="${contacts}" var="contact" varStatus="counter">
					<tr>
						<td>${counter.count}</td>
						<td>${contact.name}</td>
						<td>${contact.lastname}</td>
						<td>${contact.email}</td>
						<td>${contact.phone}</td>
						<td><a href="edit?id=${contact.contactId}">Edit Contact</a></td>
						<td><a href="delete?id=${contact.contactId}">Delete Contact</a></td>
						<td></td>

					</tr>
				</c:forEach>

			</tbody>
		</table>

 
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>