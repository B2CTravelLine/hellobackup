<%@page import="com.vir.service.AdminServiceImpl"%>
<%@page import="com.vir.model.BusService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<!DOCTYPE html>
<meta charset="ISO-8859-1">
<title>Seat Selection</title>

<style>
button[type=submit], button[type=back], input[type=button] {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 10px 18px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

p {
	color: red;
}

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

.reserved {
	color: blue;
}

.tab {
	align: left;
	padding-top: 00px;
}
</style>
<script type="text/javascript">
	function add() {
		var boxes = document.f1.checkbox.length;
		var txt = "";
		num = 1;
		for (var i = 0; i < boxes; i++) {
			if (document.f1.checkbox[i].checked) {
				txt = document.f1.checkbox[i].value + " ";
			}
		}
		//fare = 400;
		document.f1.text2.value = txt;
		//document.f1.text4.value = fare;
	}

	function countCheckboxes() {
		var inputElems = document.getElementsByTagName("input");
		var count = 0;
		for (var i = 0; i < inputElems.length; i++) {
			if (inputElems[i].type === "checkbox"
					&& inputElems[i].checked === true) {
				count++;
			}
		}
		if(count==0)
			{
			alert("select atleast one seat")
			}
		else if (count == 1) {

			alert("seat selected successfully");
			return true;

		} else {
			alert("Select only  One seat to continue");
			return false;
		}
	}
</script>
</head>
<body>
	<div class="header">
		<h1>Travel Line</h1>
		
	</div>
	<div class="nav-collapse">
		<div class="topnav">
			<a href="Bus_Home.html">Home</a> <a href="ContactUs.html">Contact
				Us</a> <a href="retrival1.html">Retrieval</a> <a href="Admin_login.html">Admin
				Login</a>
		</div>
	</div>
	<center>
		<br>
		<h1>Select seat</h1>
	</div>
	<div align="center">
		<div class="row info"></div>
		<hr />
		
				<%request.getAttribute("seat"); %>
		<table style="width: 100%" border="100px">
			<tr>
				<th>Service No</th>
				<th>From</th>
				<th>To</th>
				<th>Journey Date</th>
			</tr>
			<tr>
			
				<td><c:out value="${seat.serviceId }" /></td>
			    <td><c:out value="${seat.serviceFrom }" /></td>
				<td><c:out value="${seat.serviceTo }" /></td>
				<td><c:out value="${seat.departureTime }" /></td>

			</tr>
		</table>
		<br>
		<br>
		<br>
		
			<body>
				<form id="f1" name="f1" method="post" action="insertPassenger">
					
					
		
		<br>
		<TABLE id="dataTable" width="500px" border="1">

			<TR>

				
				<TD>name<INPUT type="text" name="pname" required="required"
					pattern="[a-z A-Z]+" /></TD>
				<TD>age<INPUT type="number" min="1" required="required" name="age" /></TD>
				<TD>Gender <SELECT name="gender">
						<OPTION value="male">Male</OPTION>
						<OPTION value="female">Female</OPTION>
						<OPTION value="other">Other</OPTION>
				</SELECT>
				</TD>
				
				<TD>seat number:<input type="number" name="seatno" id="text2" required="required"/></td>
			</TR>
		</TABLE>
		<br> <br>
		<button type="submit" value="continue" formaction="onclick="return countCheckboxes();">book</button>
		<button type="back" value="back" formaction="Select_service.jsp">back</button>
	</center>
	</form>
</body>
</html>
