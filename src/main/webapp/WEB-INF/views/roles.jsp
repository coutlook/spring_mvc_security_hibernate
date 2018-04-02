<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
</head>
<body>

	<h1>Spring MVC 5 + Spring Security 5 + Hibernate 5 example</h1>
		<h2>${message}</h2>
	<h4>Thank you !</h4>
	<c:forEach items="${roleList}" var="role1">     
   <c:out value="${role1.user.username}"/>
   <c:out value="${role1.authority}"/>
</c:forEach>
	
	
  <br/>
</body>
</html>