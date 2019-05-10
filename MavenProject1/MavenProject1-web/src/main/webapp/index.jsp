<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AUTHENTIFICATION</title>
<style type="text/css">
  <%@include file="css/style.css" %>
</style>
</head>
<body>
<h1>Page de login de l'utilisateur</h1>
	<form method="post" action="profil">
	<p>Veuillez vous Log :</p>
		<div method="post" class="login">
		<input type="text" placeholder="Username" id="Login" name="login" required> 
		<input type="password" placeholder="Password" id="Password" name="pwd" required> 
		<input type="submit" value="Login">
	</div>
	<div class="shadow"></div>	
	</form>
</body>
</html>