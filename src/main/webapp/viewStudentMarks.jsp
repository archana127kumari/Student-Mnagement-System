<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="models.StudentMarksDetails" %>
<%@ page import="sheets.ViewStudentMarksDetails" %>

<html>
<head>
    <title>Student Marks Details</title>
    <link href="css/viewStudent.css" rel="stylesheet" type="text/css">
    
</head>
<body>
<h1>Student Marks Details</h1>
<div class="tbl-header">

<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Math Marks</th>
        <th>English Marks</th>
        <th>IT Marks</th>
        <th>Science Marks</th>
        <th>SSC Marks</th>
    </tr>
    </thead>
    <tbody>
    <%
        // Retrieve studentMarksList from request attribute
        List<StudentMarksDetails> studentMarksList = (List<StudentMarksDetails>) request.getAttribute("studentMarksList");
        
        // Iterate over studentMarksList and generate table rows dynamically
        for (StudentMarksDetails marks : studentMarksList) {
    %>
        <tr>
            <td><%= marks.getId() %></td>
            <td><%= marks.getMathMarks() %></td>
            <td><%= marks.getEnglishMarks() %></td>
            <td><%= marks.getItMarks() %></td>
            <td><%= marks.getScienceMarks() %></td>
            <td><%= marks.getSscMarks() %></td>
        </tr>
    <% } %>
    </tbody>
</table>
</div>

</body>
</html>