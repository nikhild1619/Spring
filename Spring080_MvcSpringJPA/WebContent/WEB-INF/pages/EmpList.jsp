<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List </title>
</head>
<body>
<h3>Larsen And Toubro Information Services!!!</h3>
<table border="1">
<tr>
<th>Employee Id</th>
<th>First Name</th>
<th>Last Name</th>

<th>Details of Employees</th>
</tr>
<c:forEach items="${empList}"  var="emp">
<tr>
<td>${emp.employeeId}</td>
<td>${emp.firstName}</td>
<td>${emp.lastName}</td>

<td><a href="empDetails.hr?id=${emp.employeeId}">Details of Employees</a></td>
<td><a href="home.hr">Simon Go Back</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>