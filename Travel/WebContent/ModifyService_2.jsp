<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vir.model.BusService" %>
    <%@ page import="java.util.*" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
<style>
table, th{
  border: 1px solid black;
}

.container {
		height: 800px;
		background-color: #97CADB;
}
.header {
  background-color: #f1f1f1;
  padding: 30px;
  text-align: center;
background: white;
}
.topnav {
  overflow: hidden;
  background-color: #333;
}
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  padding-top: 10px;
 margin-left: 8em;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;


}
</style>
</head>
<body>

<h1>Travel Line</h1>
  <div class="container">
<div class="nav-collapse">
<div class="topnav">
<a href="Add_Service.jsp">Add Service</a>
<a href="schedule">Schedule</a>
<a href="Admin_login.jsp">Logout</a>
</div>
</div>

<%BusService bs=new BusService();
request.getAttribute("empdetails");
%>
<center>
<h1>Edit Service</h1>

<table border="1" width="90%">  
<tr>
<th>ServiceId</th>
<th>From</th>
<th>To</th>
<th>Capacity</th>
<th>Fair</th> 
<th>Distance(kms)</th>
 <th>Departure Time</th>
<th>Journey Date</th>
<th>Modify</th>

</tr>  
 <tr>     
<td><c:out value="${empdetails.serviceId}"/></td>
<td><c:out value="${empdetails.serviceFrom}"/></td>
<td><c:out value="${empdetails.serviceTo}"/></td>
<td><c:out value="${empdetails.busCapacity}"/></td>
<td><c:out value="${empdetails.fare}"/></td>
<td><c:out value="${empdetails.distance}"/></td>
<td><c:out value="${empdetails.departureTime}"/></td>
<td><c:out value="${empdetails.journeyTime}"/></td>
<td><a href="EditForm.jsp?service_no=${empdetails.getServiceId()}">Edit</a></td>  

</tr>
</table>  
</center></div>
</body>
</html>