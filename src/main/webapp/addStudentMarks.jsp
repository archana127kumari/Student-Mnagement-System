<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link href="css/addStudentMarks.css" rel="stylesheet" type="text/css">

</head>
<body>


    
    
    <h1>ADD STUDENT MARKS HERE!!</h1>
    <div class="body-main">
    <div class="body-left">
           <img alt="grocer" src="image/Studentlogo.png"  class="logo">
    </div>
    
    <div class="body-right">
    
    <form action="AddStudentMarksToExcel" method="post">
    
    
    
     <div class="form-main-input">
    <div class="form-left">
    <b>ID:<span>*</span></b>
    </div>
    <div class="form-right">
    <input type="number" name="id" class="Ftext" placeholder="Student ID">      
     <br>
    </div>
     </div>
     
     
     
    <div class="form-main-input">
    <div class="form-left">
    <b>Math Marks:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
     <input type="number" name="mathMarks" class="Ftext">    
     <div id="firstNameError" class="error-message"></div><br>

    </div>

     </div>
     </div>
     
     
     
     <div class="form-main-input">
    <div class="form-left">
    <b>English Marks:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
    <input type="number" name="englishMarks" class="Ftext">
     <div id="firstNameError" class="error-message"></div><br>

    </div>

     </div>
     </div>
     
     
          
     <div class="form-main-input">
    <div class="form-left">
    <b>IT Marks:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
     <input type="number" name="itMarks" class="Ftext">
     <div id="firstNameError" class="error-message"></div><br>

    </div>

     </div>
     </div>
     
          
     <div class="form-main-input">
    <div class="form-left">
    <b>Science Marks:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
     <input type="number" name="scienceMarks" class="Ftext">
     <div id="firstNameError" class="error-message"></div><br>

    </div>

     </div>
     </div>
     
          <div class="form-main-input">
    <div class="form-left">
    <b>SSC Marks:<span>*</span></b>
    </div>
    <div class="form-text-error">
    <div class="form-right">
    <input type="number" name="sscMarks" class="Ftext">
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