<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<!-- the attribute name must be the same as name attribute in the class -->
	<form:form action="processForm" modelAttribute="student">
		<br>
		<br>
		First name: <form:input path="firstName" />
		<br>
		<br>
		Last name: <form:input path="lastName" />
		<br>
		<br>
		Country:
		<form:select path="country">
			<form:options items ="${student.countryOptions}"/>
		</form:select>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>



</body>
</html>