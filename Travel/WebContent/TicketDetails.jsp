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



<h1>Travel Line</h1>
  <div class="container">
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
<form action="GetTicketServlet" method="get">
<input type="hidden" name="ticketno" value="${ tdetails.passengerId}"/>
  <table style="width: 100%" border="100px">
  
  	<tr>
   			 <th>ticket_no</th>
     			<td><c:out value="${ tdetails.passengerId}" /></td>
    
    </tr>
    <tr>
     			<th>Passenger Name</th> 
     			<td><c:out value="${ tdetails.passengerName}" /></td>
     </tr>
     <tr>
    			<th>gender</th>
    			 <td><c:out value="${ tdetails.gender}" /></td>
    
      </tr>
      <tr>
      			<th>age</th>
      			<td><c:out value="${ tdetails.age}" /></td>
      </tr>
     <tr>
    			<th>Fare</th>
     			<td><c:out value="${ tdetails.fare}" /></td>
     <tr>
     </tr>			
     
    		<th>seat_no</th>
    		<td><c:out value="${ tdetails.seatNo}" /></td>
    </tr>
    <tr>
			<th> From Station</th>
	 		<td><c:out value="${ tdetails.from}" /></td>
	 </tr>
	 <tr>
	 
			<th>To Station</th>
	  		<td><c:out value="${ tdetails.to}" /></td>
  </tr>
  <tr>
			<th>Service No</th>
   			<td><c:out value="${ tdetails.service_id}" /></td>
   </tr>
   <tr>
   			<th>Departure Date</th>
    		<td><c:out value="${ tdetails.departureTime}" /></td>
   </tr>
   <tr>
   			 <th>Reporting Time(hr)</th>
     			<td><c:out value="${ tdetails.reporting}" /></td>
     </tr>
     <tr>
     		<td><button type="submit" onclick="cancel.html">cancel ticket</button></td>
  	</tr>
  </table><br><br>
</form>
<button style="align:center;" onclick="window.print()">Print ticket</button>
</div></div>
</body>
</html>
