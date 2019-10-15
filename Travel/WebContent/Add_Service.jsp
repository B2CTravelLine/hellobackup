<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Service</title>
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
<body>
<div class="header">
<h1>Travel Line</h1>
  <img src="images/bus.jpg" alt="bus" style="width:1000px;height:300px">
</div>
<div class="nav-collapse">

<div class="topnav">
<a href="ModifyService_1.jsp">Modify Service</a>
<a href="schedule">Schedule</a>
<a href="Admin_login.jsp">Logout</a></div>
</div>
<div align="center" style="border-style: solid;" ><br>

<h3>Add Service</h3>

<form id="add_service_form" method="post" name="myform" action="add">
<pre>
From:<select name="from">
<option>Hyderabad</option>
<option>Tuni</option>
<option>kakinada</option>
<option>Vizag</option>
</select>

   To:<select name="to">
<option>Tuni</option>
<option>Hyderabad</option>

<option>kakinada</option>
<option>Vizag</option>
</select>

     Capacity:<input type="number" name="capacity" min=36 max=36 required="required">
     
           Fare:<input type="number" name="fare" min=400 required="required">
           
      Distance:<input type="text" name="distance" required="required">
      
journey date:<input type="text" name="departureTime" placeholder="yyyy-mm-dd" required="required">

Journey Time:<input type="number" min=1 max=24 name="jTime" required="required">
</pre>
<!--  Service No:<input type="text" name="serviceno" required="required"><br>-->
<button type="submit"  value="submit"  id="submit" >submit</button>&nbsp;
<button onclick="location.href = 'Admin.html';" id="myButton" name="">back</button>
</form>
</div>
</body>
</html>