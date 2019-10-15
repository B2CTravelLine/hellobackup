package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.BusService;
import com.vir.model.Passenger;
import com.vir.service.AdminServiceImpl;
import com.vir.service.PassengerServiceImpl;

/**
 * Servlet implementation class InsertPassengerServlet
 */
@WebServlet({ "/InsertPassengerServlet", "/insertPassenger" })
public class InsertPassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPassengerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		PassengerServiceImpl ps = new PassengerServiceImpl();
		
	    String pname=(request.getParameter("pname"));
	    int age =Integer.parseInt( request.getParameter("age"));
	    String gender=(request.getParameter("gender"));
	   
	    float fare =Float.parseFloat(request.getParameter("fare"));
	    String seatno = (request.getParameter("seatno"));
	    int sid = Integer.parseInt(request.getParameter("serviceno"));
	    
	    
	    //request.getParameter(arg0);
		
		Passenger p = new Passenger();
		p.setPassengerName(pname);
		p.setAge(age);
		p.setGender(gender);
		p.setFare(fare);
		p.setSeatNo(seatno);
		p.setService_id(sid);
		
		PassengerServiceImpl psi = new PassengerServiceImpl();
		/*
		 * String details = psi.insertDetails(p); request.setAttribute("pdetails", p);
		 */
		String details = psi.insertDetails(p);
		if(details.equals("SUCCESS"))   
		{
			
			request.setAttribute("pdetails", p);
			
			System.out.println("sucess msg");
			out.print("<p>Record saved successfully!</p>");  
			request.getRequestDispatcher("PassengerPreview.jsp").forward(request, response); 
		}
		else   
		{
			out.println("Sorry! unable to save record"); 
			request.getRequestDispatcher("/Bus_Home.html").include(request, response); 

		}
		out.close();
	}
	}

