<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Please sign in</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
<link
	href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css"
	rel="stylesheet" crossorigin="anonymous" />
</head>
<body>
	<div class="container">
		<form class="form-signin" method="post" action="update-password">
			<h2 class="form-signin-heading">Please update your password</h2>
			<p>Enter your username</p>
			<p>
				<label for="username" class="sr-only">Username</label> <input
					type="text" id="username" name="username" class="form-control"
					placeholder="Username" required autofocus>
			</p>
			<p>Enter your new password</p>
			<p>
				<label for="password" class="sr-only">New Password</label> <input
					type="password" id="password" name="password" class="form-control"
					placeholder="New Password" required>
			</p>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Update Password</button>
				
		</form>
	</div>
	
	<br>
	<br>
	<br>
</body>
</html>