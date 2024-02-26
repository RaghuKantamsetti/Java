<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container d-flex justify-content-center align-items-center">
		<c:forEach items="${user}" var="data">
			<div class="card">

				<div class="upper">

					<img src="https://i.imgur.com/Qtrsrk5.jpg" class="img-fluid">

				</div>

				<div class="user text-center">

					<div class="profile">

						<img
							src="https://sialifehospital.com/wp-content/uploads/2021/04/testimonial-1.png"
							class="rounded-circle" width="80">

					</div>

				</div>


				<div class="mt-5 text-center">

					<h4 class="mb-0">${data.getName()}</h4>
					<span class="text-muted d-block mb-2">Mumbai</span>




					<divclass ="mt-5text-center">

					<div class="stats">
						<h6 class="mb-0">Email</h6>
						<span>${data.getEmail() }</span>

					</div>
					<div class="stats">
						<a href="password-update-form"> <h6 class="mb-0">Change password</h6></a>
						
					</div>
				</div><br><br>

			</div>
	</div>
	</c:forEach>
	</div>
	<br>
	<br>
	<br>
	<br>
</body>
</html>