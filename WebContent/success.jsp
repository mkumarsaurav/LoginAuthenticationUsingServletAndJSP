<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successfull</title>
</head>
<body>
	<%
	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	%>
	Welcome Saurav...
	<br> You are Logged in

</body>
</html>