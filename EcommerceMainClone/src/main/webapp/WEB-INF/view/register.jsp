<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#reg {
	background-color: white; margin-left : 500px;
	margin-right: 500px;
	margin-top: 85px;
	padding: 30px;
	border: 3px solid black;
	text-align: center;
	border-radius: 10px;
	margin-left: 500px;
}
</style>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
</head>
<body>
<div  id="reg">
 <h2>Fill below form to register</h2><br><br>
 
    <form:form method="POST" modelAttribute="user" action="process-register">
      
               <label> Enter your name:</label><br>
               <form:errors path="name" cssStyle="color: #ff0000;"/><br>
                <form:input path="name" /><br><br>
                
            
            
                <label>Enter your mail:</label><br>
                <form:errors path="email" cssStyle="color: #ff0000;" /><br>
                <form:input path="email" /><br><br>
                
            
            
                <label>Enter your Username:</label><br>
                 <form:errors path="username" cssStyle="color: #ff0000;"/> <br>
                <form:input path="username" /><br><br>
               
            
            
               <label>Enter a password:</label><br>
                  <form:errors path="password" cssStyle="color: #ff0000;"/><br>
               <form:password path="password"   showPassword="true"/><br><br>
             
          <input type="submit" name="submit" value="Register">
            </form:form>
            Already Registered?<a href="login">Login</a>
            
            </div><br>
            
</body>
</html>