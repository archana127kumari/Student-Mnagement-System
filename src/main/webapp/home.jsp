
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management Portal</title>
<link href="css/home.css" rel="stylesheet" type="text/css">
<link href="css/home1.css" rel="stylesheet" type="text/css">
</head>
<body>


<div class="sidenav">
  <a href="#about">Dashborad</a>
  <a href="#services">Students</a>
  <a href="#clients">Transaction</a>
  <a href="#contact">Announcement</a>
  <a href="#">Users Profile</a>
  <a href="">Setting</a>
  
  
</div>

<div class="main">




<h1 style=" color:white; text-align:center;   letter-spacing: 3px;"> Welcome User!!</h1>


           <img alt="grocer" src="image/college.png"  class="college"  style="height:300px;
	width: 600px;
	margin-top:-30px;
	margin-left:200px;">
<br><br><br><br><br>

<div class="form-main" style="display: flex;   flex-direction: row;">

<div class="form-left" style="width: 50%;">

    <form action="ViewStudentDetails" method="post">
        <input type="submit" value="View Students" class="button1">

</form>
 

<form action="addStudent.jsp" method="post">
        <input type="submit" value="Add Students" class="button2" style="margin-top: 20px">

</form>
</div>
<div class="form-right">


 <form action="ViewStudentMarksDetails" method="post">
        <input type="submit" value="View Student Marks" class="button3" style="margin-top: -20px">

</form>

   <form action="addStudentMarks.jsp" method="post">
        <input type="submit" value="Add Students Marks" class="button4" style="margin-top: 20px">

</form>
</div>

</div>

</div>

</body>
</html>