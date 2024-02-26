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
	margin-top: 80px;
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
<body><br><br>
<div  id="reg">
 <h2>Add your product details</h2><br><br>
 
    <form:form method="POST" modelAttribute="product" action="process-product">
      
               <label> Enter product name:</label><br>
               <form:errors path="productName" cssStyle="color: #ff0000;"/><br>
                <form:input path="productName" /><br><br>
                
                <label>Add product image:</label><br>
                <form:errors path="productUrl" cssStyle="color: #ff0000;" /><br>
                <form:input path="productUrl" /><br><br>
            
            
                <label>Enter product price:</label><br>
                <form:errors path="productPrice" cssStyle="color: #ff0000;" /><br>
                <form:input path="productPrice" /><br><br>
                
          		<label>Enter product Description:</label><br>
                <form:errors path="productDesc" cssStyle="color: #ff0000;" /><br>
                <form:input path="productDesc" /><br><br>
            
                <label>Enter product Category:</label><br>
                <form:errors path="productCat" cssStyle="color: #ff0000;" /><br>
                <form:input path="productCat" /><br><br>
             
          <input type="submit" name="submit" value="Add Product">
            </form:form>
            
            </div><br>
            
</body>
</html>