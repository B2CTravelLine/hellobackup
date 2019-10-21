<%@page import="com.vir.model.Passenger"%>
<%@page import="com.vir.service.PassengerServiceImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book</title>
<style>
button[type=submit], button[type=reset],button[type=cancel]{
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 6px 10px;
  text-decoration: none;
  margin: 2px 2px;
  cursor: pointer;
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
 margin-left: 10em;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;


}
.nav-collapse {
  margin-left: 1em;

}
pre
{
font-family:verdana;
font-size:14;
color:blue;
}
</style>
</head>
<body >

<h1>Travel Line</h1>
  <div class="container">
<div class="nav-collapse">

<div class="topnav">

<a href="Bus_Home.html">Home</a>
<a href="ContactUs.html">Contact Us</a>
<a href="retrival1.html">Retrieval</a>
<a href="Admin_login.html">Admin Login</a>
</div>
</div>
<div align="center"><br>

<h2>Passenger Details</h2>
<%
PassengerServiceImpl ps=new PassengerServiceImpl();

request.getAttribute("pdetails");
%>
<form action="GetTicketDetails" method="get">
<div style="width:550px;height:130px;border:10px solid #000;color:blue;background-color:LightGray"><br>

<table style="width: 100%; border:100px">

<tr>
<br>
&emsp;&emsp;&emsp;<td>Seat No: <input type="number" name="seatno" style ="width:60PX;" value="${pdetails.seatNo }"/></td>
<td>Service No: <input type="number" name="serviceno" style ="width:60PX;" value="${pdetails.service_id }"/></td>
				
</tr>
</table> 
<br>
<button type="submit"  value="submit">Proceed</button>


</div> 
</form>

</div></div>
</body>
</html>