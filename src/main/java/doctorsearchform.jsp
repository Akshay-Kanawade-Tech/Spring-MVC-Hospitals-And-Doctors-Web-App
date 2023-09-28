<!--
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SEARCH DOCTORS</title>
</head>
<body>
<h2>hellooo</h2>
</body>
</html>
-->

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html xmlns:form="http://www.w3.org/1999/xhtml">
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Find Doctors / Hospital Online</title>
</head>
<body>
 <h1>Find Doctors Online</h1>
 <form:form method="post" action="/Spring-MVC-Hospitals-And-Doctors-Web-App/doctorsearchform" >
     <table >
     <tr>
     <td>Doctor Name : </td>
     <td>
     <form:input path="doctorName"/>
     </td>
     </tr>
    <tr>
    <td> (Or) </td>
     </tr>
    <tr>
    <td>Registration Number : </td>
    <td>
     <form:input path="doctorRegistrationNumber"/>
     </td>
     </tr>
    <tr>
    <td> </td>
    <td><input type="submit" value="Check Doctors Online" /></td>
</tr>
    </table>
    </form:form>
</body>
</html>