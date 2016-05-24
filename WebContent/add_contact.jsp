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
    <img src="images/register1.jpg" alt="width:304px;height:228px;" style="float:left;width:504px;height:378px;">
   <br>
   <br>
   <form class="form" action="addcontact" method="post">
   <div class = "jumbotron" align="left;" style="float:left">
	 
   

    <h1 style="font-family:oswald; color:rgb(146, 27, 135); text-align:left; font-size:200%;">ADD CONTACT: </h1>  

   <p style="color:rgb(146, 77, 135); text-align:right;"></p>
    <div class="form-group" style= "text-align:right; ">
    <label for="name" style="font-family:oswald; color:rgb(146, 77, 135);">Name:</label>
	<input type="text" class="form-control" id="name" placeholder="Enter Name">
    </div>
	<br>
    <div class="form-group"style="text-align: right;">
      <label for="lastname" style="font-family:oswald; color:rgb(146, 77, 135);">Last name:</label>
      <input type="text" class="form-control" id="lastname" placeholder="Enter Last name">
    </div>
	<br>
	<div class="form-group"style="text-align: right;">
      <label for="email"style="font-family:oswald; color:rgb(146, 77, 135);">Email:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter Email">
    </div>
	<br>

	<div class="form-group"style="text-align: right;">
      <label for="phone"style="font-family:oswald; color:rgb(146, 77, 135);">Phone number:</label>
      <input type="text" class="form-control" id="phone" placeholder="Phone number">
    </div>
	<br>

	<div class="form-group"style="text-align: right;">
      <label for="city" style="font-family:oswald; color:rgb(146, 77, 135);">City:</label>
      <input type="text" class="form-control" id="city" placeholder="Enter City">
    </div>
	<br>

    <button type="submit" class="btn btn-default" style="font-family:oswald; color:rgb(146, 77, 135);">Add contact &raquo;</button>
 </div>
 </form>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>