
package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.BusService;
import com.vir.service.AdminServiceImpl;

/**
 * Servlet implementation class UpdateService1
 */
@WebServlet({ "/UpdateService1", "/updated" })
public class UpdateServiceServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServiceServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
       int sid = Integer.parseInt(request.getParameter("sid"));  
        String source=request.getParameter("from");
		String destination= request.getParameter("to");
		
		float fare=Float.parseFloat(request.getParameter("fare"));
		float distance=Float.parseFloat(request.getParameter("distance"));
		int capacity=Integer.parseInt(request.getParameter("capacity"));
		String departure= request.getParameter("deaparture");
		String journey= request.getParameter("journey");  
          //BusService busService = new BusService(capacity,source,destination,fare,distance,departure,journey);
        BusService e=new BusService();  
        e.setServiceId(sid);  
        e.setServiceFrom(source);  
        e.setServiceTo(destination);  
       
        e.setFare(fare);
        e.setDistance(distance);
        e.setBusCapacity(capacity);
        e.setDepartureTime(departure);
        e.setJourneyTime(journey);
        AdminServiceImpl asi = new AdminServiceImpl();
        int status = asi.updateDetails(e);
        //int status=E.update(e);
        
        if(status>0){  
        	 
            response.sendRedirect("Admin.html"); 
            out.print("<p>Record updated successfully!</p>"); 
            
        }else{  
            out.println("Sorry! unable to update record"); 
            response.sendRedirect("ModifyService_1.jsp");
        }  
          
        out.close();  
    }  
	}


