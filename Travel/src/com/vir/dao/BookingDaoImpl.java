package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.vir.model.Booking;
import com.vir.util.DBConnection;

public class BookingDaoImpl implements BookingDao{

	@Override
	public String insertBookingDetails(Booking b) {
		int id = b.getBookingId();
		String jDate = b.getJourneyDate();
		String bDate = b.getBookingDate();
		int serviceId = b.getServiceId();
		int passengerId = b.getPassengerId();
		int seats = b.getNoOfSeats();
		double fare = b.getFare();
		double cardNo = b.getCardNo();
		String comments = b.getComments();
		String from = b.getFrom();
		String to = b.getTo();
		Connection con  ;
		PreparedStatement ps ;
		try {
			con=DBConnection.getConnection();
			String query = "insert into Booking values(?,?,?,?,?,?,?,?,?,?";
			ps=con.prepareStatement(query);
			//ps.setInt(1, id);
			ps.setString(1,  jDate);
			ps.setString(2, bDate);
			ps.setInt(3,serviceId);
			ps.setInt(4,passengerId);
			ps.setInt(5, seats);
			ps.setDouble(6, fare);
			ps.setDouble(7, cardNo);
			ps.setString(8, comments);
			ps.setString(9, from);
			ps.setString(10, to);
			int i = ps.executeUpdate();
				return "SUCCESS"; 

		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return "Oops.. Something went wrong there..!";

	}

	

	@Override
	public int cancelBooking(int bookingId) {
		   int status=0;  
	        try{  
	        	Connection con = DBConnection.getConnection();
	        	String sql = "DELETE FROM booking where bookingId = ?";
	            PreparedStatement ps=con.prepareStatement(sql);  
	            ps.setInt(1,bookingId);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }
	}






