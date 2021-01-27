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
		<br>
		<br>
		Favorite language:
		Java <form:radiobutton path="favoriteLanguage" value ="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value ="C#"/>
		Ruby <form:radiobutton path="favoriteLanguage" value ="Ruby"/>
		<br>
		<br>
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		Windows mastuh race <form:checkbox path="operatingSystems" value="Windows"/>
		
	</form:form>



</body>
</html>