<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ page import="com.vir.model.BusService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Schedule</title>
<style>
table, th{
  border: 1px solid black;
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

/* Style the topnav links */
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

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;


}
.nav-collapse {
  margin-left: 1em;

}
</style>
</head>
<body>
<div class="header">
<h1>Travel Line</h1>
  <img src="images\bus.jpg" alt="bus" style="width:1000px;height:300px;">
</div>
<div class="nav-collapse">

<div class="topnav">
<a href="Add_Service.jsp">Add Service</a>
<a href="ModifyService_1.jsp">Modify Service</a>
<a href="Admin_login.html">Logout</a>
</div>
</div>
<div align="center" ><br>

<h2>Schedule</h2>

  <table style="width:100%" border="100px">
  <tr>
  	<th>Service No</th>
    <th>Service From</th>
    <th>Service To</th>
    
    <th>Fare</th>
    <th>Distance</th> 
    <th>Capacity</th>
    <th>Departure Time</th>
	<th>Journey Time </th>
	
  </tr>
<% request.getAttribute("listdata");
%>
<c:forEach items="${listdata}" var="l">
<tr>
<td>${l.serviceId }</td>
<td>${l.serviceFrom }</td>
<td>${l.serviceTo}</td>

<td>${l.fare }</td>
<td>${l.distance }</td>
<td>${l.busCapacity }</td>
<td>${l.departureTime }</td>
<td>${l.journeyTime }</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>