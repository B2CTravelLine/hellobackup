<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ticket Details</title>
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
 margin-left: 14em;
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
<a href="Bus_Home.html">Home</a>
<a href="ContactUs.html">Contact Us</a>
<a href="Admin_login.html">Admin Login</a>
</div>
</div>
<div align="center" ><br>

<%request.getAttribute("tdetails"); %>
<h2>Ticket Details</h2>
<form action="DeleteServiceServlet" method="get">
<input type="hidden" name="ticketno" value="${ tdetails.passengerId}"/>
  <table style="width: 100%" border="100px">
  <tr>
    <th>ticket_no</th>
     <td><c:out value="${ tdetails.passengerId}" /></td>
    <th>Passenger Name</th> 
     <td><c:out value="${ tdetails.passengerName}" /></td>
     </tr>
     <tr>
    <th>gender</th>
     <td><c:out value="${ tdetails.gender}" /></td>
    <th>age</th>
      <td><c:out value="${ tdetails.age}" /></td>
      </tr>
     <tr>
    <th>Fare</th>
     <td><c:out value="${ tdetails.fare}" /></td>
    <th>seat_no</th>
    <td><c:out value="${ tdetails.seatNo}" /></td>
    </tr><tr>
	<th> From Station</th>
	 <td><c:out value="${ tdetails.from}" /></td>
	<th>To Station</th>
	  <td><c:out value="${ tdetails.to}" /></td>
  </tr>
  <tr>
	<th>Service No</th>
   <td><c:out value="${ tdetails.service_id}" /></td>
   <th>Departure Date</th>
    <td><c:out value="${ tdetails.departureTime}" /></td>
   </tr><tr>
    <th>Reporting Time(hr)</th>
     <td><c:out value="${ tdetails.reporting}" /></td>
     <td><button type="submit"  value="cancel ticket">cancel ticket</button></td>
  </tr>
  </table><br><br>
</form>
<button style="align:center;" onclick="window.print()">Print ticket</button>
</div>
</body>
</html>
