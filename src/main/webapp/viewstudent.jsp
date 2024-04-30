<%@ page import="java.util.List" %>
<%@ page import="models.StudentDetails" %>
<html>
<head>
    <title>Student Details</title>
     <link href="css/viewStudent.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1 style=" text-align: center;">Student Details</h1>
  <div class="tbl-header">

<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address</th>
        <th>Date of Birth</th>
    </tr>
    </thead>
    <tbody>
    <%
       
    List<StudentDetails> studentList = (List<StudentDetails>) request.getAttribute("studentList");

        
       
        for (StudentDetails student : studentList) {
    %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getFirstName() %></td>
            <td><%= student.getLastName() %></td>
            <td><%= student.getAddress() %></td>
            <td><%= student.getDob() %></td>
        </tr>
    <% } %>
    </tbody>
</table>
</div>
</body>


