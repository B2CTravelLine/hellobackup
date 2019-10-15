package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.BusService;
import com.vir.model.Passenger;
import com.vir.service.AdminService;
import com.vir.service.AdminServiceImpl;
import com.vir.service.PassengerServiceImpl;

/**
 * Servlet implementation class GetPassengerServlet
 */
@WebServlet({ "/GetPassengerServlet", "/getpassenger" })
public class GetPassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPassengerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	PassengerServiceImpl pasi = new PassengerServiceImpl();
			int serviceId =Integer.parseInt( request.getParameter("pid"));
			//BusService bus=(BusService)qs.getService(serviceId);
			Passenger pdetails = pasi.getDetails(serviceId);
			if(pdetails!=null) {
				request.setAttribute("empdetails",pdetails );
				//out.println("passenger Details");
				out.print("<p>Record saved successfully!</p>");
				RequestDispatcher rd=request.getRequestDispatcher("BookingTicket.jsp");
				rd.forward(request, response);

			}
			else {
				//out.println("sorry......!");
				out.println("Sorry! unable to save record"); 
				RequestDispatcher rd=request.getRequestDispatcher("Bus_Home.html");
				rd.forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
