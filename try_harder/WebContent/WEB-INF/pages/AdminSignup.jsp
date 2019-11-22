<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>ADMIN END SIGNUP</h1>
		</center>
	
	<form action="adminSignup.do" method="post">
		<div class = "container">
		<fieldset>
		<br><br> 
		<br><br> 
		<legend>REGISTRATION</legend>
		<table>
		<tr>
			 <td>First Name</td><td><input type="text" name="firstname" required><br><br> </td>
		</tr>	 
		<tr>
			 <td>Middle Name</td><td><input type="text" name="middlename" required><br/></br></td>
		</tr>
		<tr>
			<td>Last Name</td><td>  <input type="text" name="lastname" required><br/></br> </td>
		</tr>	 
		
		<tr>
			<td>Contact Number</td><td> <input type="text" name ="contactnumber" required><br/></br> </td>
		</tr>	 
		<tr>
			<td>Date Of Birth</td><td> <input type="date" name ="dateofbirth" required><br/></br>  </td>
		</tr>	 
		<tr>
			<td>Gender</td><td><input type="radio" name ="gender" value="male">Male<input type="radio" name ="gender" value="female">Female<input type="radio" name ="gender" value="other">Other<br></br></td> 
			 		
		</tr>		
			 <tr><td>Nationality</td><td> <select name="nationality" required>
				<option value="indian">Indian</option>
				<option value="other">Other</option>
				</select>
			</tr>
			<br><br>
			<tr><td>Aadhaar Number</td><td><input type="text" name ="aadharnumber" required><br/><br/></td>
			</tr>
			
			<tr><td>PAN Number</td><td> <input type="password" name ="pass" required><br/></br> </td>		
			</tr>
		</table>
		<fieldset>
		<br>
		<table>
		<legend>SIGN UP</legend>
		
			<tr>
			<td>Email Id</td><td><input type="text" name="emailid" required><br/></br></td>
		
		</tr>	 
		<tr>
			<td>Password</td><td><input type="password" name ="password" required><br/></br></td> 
		</tr>	 
		
		<tr>
			<td>Confirm Password</td><td><input type="password" name ="confirmpassword" required><br/></br></td> 
		</tr>
		</fieldset>	 
			 </table>
			 <button>SUBMIT</button>
		
        </fieldset>
        <div class="container signin">
    <p>Already have an account? <a href="LoginPage.jsp">Log In</a>.</p>
        </div>
        </div>
				</form>
	</body>
</html> 
	
