<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers-List</title>
<link type="text/css" rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div id="wrapper">
<div id="header">
	<h2>Customer Details</h2>
</div>
</div>
<br>
<input type="button" value="Add Customer" onclick="window.location.href='addForm'" class="add-button"/>

<div id="container">
	<div id="content">
	
		
	
		<table>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
			<c:forEach var="tempCustomers" items="${customers}">
				<c:url var="updateLink" value="/customer/updateForm"><c:param name="customerId" value="${tempCustomers.id}"/></c:url>
				<c:url var="deleteLink" value="/customer/delete"><c:param name="customerId" value="${tempCustomers.id}"/></c:url>
			<tr>
				<td> ${tempCustomers.firstName} </td>
				<td> ${tempCustomers.lastName} </td>
				<td> ${tempCustomers.email} </td>
				<td><a href="${updateLink}">Update</a>|<a href="${deleteLink}" onclick="if (!(confirm('Are u sure want to delete?'))) return false">Delete</a></td>
			</tr>
			</c:forEach>
			
	
		</table>
	</div>
</div>
</body>
</html>