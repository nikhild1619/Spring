<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
    <head> 
    <link rel="stylesheet" type="text/css" href="mystyle.css">
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
       <title>Login Page</title> 
        <link href="${pageContext.request.contextPath}/resources/css/mystyle.css"
	rel="stylesheet">
    </head> 
    <body> 
    
	 <div class="navbar">
  <a href="AdminHome.jsp">HOME</a>
  <a href="Status.jsp">STATUS</a>
    </div>
    
        <form method="post" action="UserList.jsp"> 
		<fieldset>
		<br><br> 
		<br><br> 
		<legend>LOG IN</legend>
				<table>
		<tr>
			 <td>Username<input type="text" name="userid"/></td>
		</tr>
		<tr>
			 <td>Password<input type="password" name="pswrd"/></td>
		</tr>
		
        </table>
        
		
		<input type="button" onclick="check(form)" value="Login"/>
</fieldset>
        </form> 
<script language="javascript">
function check(form)
{
 
 if(form.userid.value == "Admin" && form.pswrd.value == "Admin")
  {
    window.open("UsersList.loan")
  }
 else
 {
   alert("Error Password or Username")
  }
}
</script>
    </body> 
</html> 
     