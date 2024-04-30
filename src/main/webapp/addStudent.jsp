<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Student</title>
    <link href="css/addStudent.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="nav-bar">

<div class="nav-text">
</div>


<div class="nav-logo">
</div>
</div>
    <h1>ADD STUDENT DETAILS HERE!!</h1>
    <div class="body-main">
    <div class="body-left">
           <img alt="grocer" src="image/Studentlogo.png"  class="logo">
    </div>
    
    <div class="body-right">
    
    <form action="AddStudentToExcel" method="post">
    
    
    
     <div class="form-main-input">
    <div class="form-left">
    <b>ID:<span>*</span></b>
    </div>
    <div class="form-right">
    <input type="text" name="id" class="Ftext" placeholder="Student ID">      
     <br>
    </div>
     </div>
     
     
     
    <div class="form-main-input">
    <div class="form-left">
    <b>First Name:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
     <input type="text" name="firstName" class="Ftext">    
     <div id="firstNameError" class="error-message"></div><br>

    </div>

     </div>
     </div>
     
     
     
     <div class="form-main-input">
    <div class="form-left">
    <b>Last Name:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
    <input type="text" name="lastName" class="Ftext">
     <div id="firstNameError" class="error-message"></div><br>

    </div>

     </div>
     </div>
     
     
          
     <div class="form-main-input">
    <div class="form-left">
    <b>Address:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
     <input type="text" name="address" class="Ftext">
     <div id="firstNameError" class="error-message"></div><br>

    </div>

     </div>
     </div>
     
          <div class="form-main-input">
    <div class="form-left">
    <b>Date Of Birth:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
    <input type="text" name="dob" class="Ftext">
     <div id="firstNameError" class="error-message"></div><br>

    </div>

     </div>
     </div>
     
     
     
        <input type="submit" value="Save" style="width: 600px; height: 40px; background-color: rgb(8, 122, 167); color: white; border-radius: 4px;"> <br>
     
     
      
    </form>
    </div>
    </div>
</body>
</html>