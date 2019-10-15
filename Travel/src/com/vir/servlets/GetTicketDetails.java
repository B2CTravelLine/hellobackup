package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.Passenger;
import com.vir.service.PassengerServiceImpl;

/**
 * Servlet implementation class GetTicketDetails
 */
@WebServlet({ "/GetTicketDetails", "/ticketdetails" })
public class GetTicketDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTicketDetails() {
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
		int serviceno =Integer.parseInt(request.getParameter("serviceno"));
		String seatno =(request.getParameter("seatno"));
		
			//int ticketId =Integer.parseInt( request.getParameter("ticketno"));
			Passenger ticket = ps.getTicket(serviceno, seatno);
			if(ticket!=null) {
				request.setAttribute("tdetails", ticket);
				out.println("Bus Service Details");
				RequestDispatcher rd=request.getRequestDispatcher("TicketDetails.jsp");
				rd.forward(request, response);

			}
			else {
				out.println("sorry......!");
				RequestDispatcher rd=request.getRequestDispatcher("/");
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
