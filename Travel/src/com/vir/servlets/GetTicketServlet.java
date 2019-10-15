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
 * Servlet implementation class GetTicketServlet
 */
@WebServlet({ "/GetTicketServlet", "/getTicket" })
public class GetTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTicketServlet() {
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
		PassengerServiceImpl ps = new PassengerServiceImpl();
			int ticketId =Integer.parseInt( request.getParameter("ticketno"));
			Passenger tdetails = ps.getDetails(ticketId);
			if(tdetails!=null) {
				request.setAttribute("tdetails", tdetails);
				out.println("Bus Service Details");
				RequestDispatcher rd=request.getRequestDispatcher("TicketDetails.jsp");
				rd.forward(request, response);

			}
			else {
				out.println("<p>Sorry....!No Details with that ticket number</p>");
				RequestDispatcher rd=request.getRequestDispatcher("/Bus_Home.html");
				rd.forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
