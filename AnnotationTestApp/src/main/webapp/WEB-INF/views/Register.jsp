<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>  

<meta name="keywords" content="example, JavaScript Form Validation, Sample registration form" />  
<meta name="description" content="This document is an example of JavaScript Form Validation using a sample registration form. " />  
<link rel='stylesheet' href='js-form-validation.css' type='text/css' />  
<script src="sample-registration-form-validation.js"></script> 
<style>
body {
      font: 20px Montserrat, sans-serif;
      line-height: 1.8;
      color: #f5f6f7;
	  background-color  :#000000;
	   background-image: url("http://rpgmaker.net/media/content/users/4854/locker/NLBackground.jpg");
    
	  
  }
h1 {  
margin-left: 70px;  
}  
form li {  
list-style: none;  
margin-bottom: 5px;  
}  
  
form ul li label{  
float: left;  
clear: left;  
width: 100px;  
text-align: right;  
margin-right: 10px;  
font-family:Verdana, Arial, Helvetica, sans-serif;  
font-size:14px;  
}  
  
form ul li input, select, span {  
float: left;  
margin-bottom: 10px;  
}  
  
form textarea {  
float: left;  
width: 350px;  
height: 150px;  
}  
  
[type="submit"] {  
clear: left;  
margin: 20px 0 0 230px;  
font-size:18px  
}  
  
p {  
margin-left: 70px;  
font-weight: bold;  
}  
</style> 
</head>  
<body >  
<form:form commandName="user" action="Register.htm" method="post">
<p>Username:<br>
<form:input type="text" name="username" path="username"/><form:errors path="username"/>
<p>Firstname:<br>
<form:input type="text" name="firstname" path="firstname"/><form:errors path="firstname"/>
<p>LasTname:<br>
<form:input type="text" name="lastname" path="lastname"/><form:errors path="lastname"/>
<p>Password:<br>
<form:input type="password" name="password" path="password"/><form:errors path="password"/>

<input type='checkbox' name='rememberMe' value="rememberMe"> 
                    Remember Me <br />
                            

<select name="UserType" >
         <option value="Customer" name="Customer">Customer
        <option value="Seller">Seller
</select>             
<input type="submit" name="submit" value="Register" />
<input type="hidden" name="action" value="Register1" />                
</form:form>


</body>
</html>