<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.vir.service.AdminServiceImpl,com.vir.model.BusService"%>  
  
<jsp:useBean id="u" class="com.vir.model.BusService"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<% BusService b=new BusService();
AdminServiceImpl asi=new AdminServiceImpl();
BusService busService=new BusService();



int i=asi.updateDetails(b);  
//request.setAttribute("data", i);
if(i>0){  
			
            response.sendRedirect("Admin.html"); 
            out.println("successfully modified ");
        }else{  
            out.println("Sorry! unable to update record");  
        } 
%>  
</body>
</html>


