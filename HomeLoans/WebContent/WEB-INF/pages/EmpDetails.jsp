<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/mahendra" user="root" password="root" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<sql:query var="users" dataSource="${dataSource}">
select* from PERSONAL_DETAILS;
</sql:query>
<h1>Employee Details!!!!!</h1>
<table border="1">
<tr>
<th>User Id</th>
<td>${emp.userid}</td>
</tr>
<tr>
<th>First Name</th>
<td>${emp.fname}</td>
</tr>
<tr>
<th>Middle Name</th>
<td>${emp.mname}</td>
</tr>
<tr>
<th>Last Name</th>
<td>${emp.lname}</td>
</tr>
<tr>
<th>Phone</th>
<td>${emp.phone}</td>
</tr>
<tr>
<th>Date Of Birth</th>
<td>${emp.dob}</td>
</tr>
<tr>
<th>Gender</th>
<td>${emp.gender}</td>
</tr>
<tr>
<th>GNationality</th>
<td>${emp.nation}</td>
</tr>
<tr>
<th>AadharNo</th>
<td>${emp.aadhar}</td>
</tr>
<tr>
<th>Pan</th>
<td>${emp.pan}</td>
</tr>
</table>
</body>
</html>