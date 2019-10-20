                                                                                                    package com.vir.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vir.model.TicketDetails;
import com.vir.util.DBConnection;

public class TicketDetailsDaoImpl implements TicketDetailsDao {

	@Override
	public TicketDetails getTicket(int ticketNo) {
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs = null;
		TicketDetails td=null;
		
		try {
			con = DBConnection.getConnection();
			pst=con.prepareStatement("select t.ticket_No,t.booking_Id,t.passenger_Id,t.source_From,t.source_To,t.seat_No,t.fare,t.passenger_Name,t.age,t.gender,t.journey_Date from ticketDetails t inner join booking b on t.booking_Id=b.booking_Id inner join passenger p on t.passenger_Id=b.passenger_Id");
			pst.setInt(1, ticketNo);
			rs=pst.executeQuery();
			if(rs.next()) {
				td = new TicketDetails();
				td.setTicketNo(rs.getInt(1));
				td.setBookingId(rs.getInt(2));
				td.setPassengerId(rs.getInt(3));   
				td.setSourceFrom(rs.getString(4));
				td.setSourceFrom(rs.getString(5));
				td.setSeatNo(rs.getInt(6));
				td.setFare(rs.getFloat(7));
				td.setPassengerName(rs.getString(8));
				td.setAge(rs.getInt(9));
				td.setGender(rs.getString(10));
				td.setJourneyDate(rs.getDate(11));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return td;
	}

	@Override
	public int cancelTicket(int ticketNo) {
		int count=0;
		String sql="delete from ticketDetails where ticketNo=?";
		PreparedStatement pstmt=null;
		try {
			pstmt=DBConnection.getConnection()
			.prepareStatement(sql);
			pstmt.setInt(1, ticketNo);
			
			count=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
		
	}

	
	

}
