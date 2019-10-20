<%@ page import="com.vir.model.BusService"%>
<%@ page import="com.vir.service.BusServiceServiceImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>select Service</title>
<style>
table, th {
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
	margin-left: 5em;
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
<script>
	
</script>
</head>
<body>
	<div class="header">
		<h1>Travel Line</h1>
		
		<div class="nav-collapse">

			<div class="topnav">
				<a href="Bus_Home.html">Home</a> <a href="ContactUs.html">ContactUs</a>
				<a href="retrival1.html">Retrival</a> 
				<a href="Admin_login.html">AdminLogin</a>
			</div>
		</div>
		<div align="center">
			<br>

			<h3>Select Services</h3>

			<form action="seat" method="get">
				<%
					BusService bs = new BusService();
					BusServiceServiceImpl bsl = new BusServiceServiceImpl();
					request.getAttribute("listData");
					request.getAttribute("from");
					request.getAttribute("to");
					request.getAttribute("dtime");
				%>
				<table style="width: 100%" name="tab1" border="100px">
					<tr>
						<th>From:</th>
						<th>To:</th>
						<th>Journey-Time:</th>
					</tr>
					<tr>
						<td>${from}</td>
						<td>${to}</td>
						<td>${dtime}</td>
					</tr>
				</table>
				<br> <br>

				<table style="width: 100%" border="100px" name="tab2">
					<tr>
						
						<th>Service No</th>
						<th>From</th>
						<th>To</th>
						<th>Fare</th>
						<th>Distance</th>
						<th>Capacity</th>
						<th>Departure Time</th>
						<th>Journey Time</th>
						<th>select</th>

					</tr>


					<c:forEach var="bs" items="${listData}" varStatus="status">
						<tr><%-- 
							<td><input type="radio" name="radioButton"
								value="${status.count}"></td> --%>
								
							<td>${bs.serviceId }
							<input type="hidden" name="serviceId" value="${bs.serviceId }"></td>
							<td>${bs.serviceFrom }</td>
							<td>${bs.serviceTo }</td>
							<td>${bs.fare }</td>
							<td>${bs.distance }</td>
							<td>${bs.busCapacity }</td>
							<td>${bs.departureTime }</td>
							<td>${bs.journeyTime }</td>
							<td><button type="submit" value="submit">select</button></td>
						</tr>

					</c:forEach>

				</table>
				<br>
				

			</form>
			<button onclick="location.href = 'Bus_Home.html';"  name="back">back</button>
		</div>
	</div>
</body>
</html>
