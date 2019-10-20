package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.vir.model.Passenger;
import com.vir.util.DBConnection;

public class PassengerDaoImpl implements PassengerDao {
	@Override
	public Passenger getDetails(int passengerId) {
		Connection con=DBConnection.getConnection();
		Passenger bs=null;

		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=con.prepareStatement("select ticket_id,p.passenger_name,p.age,p.gender,p.fare,s.seatno,s.source_from,s.source_to,s.departure_time,s.journey_time,s.service_id from service s join passenger p where  s.service_id=p.service_id and ticket_id=?;");
			pst.setInt(1,passengerId);
			rs=pst.executeQuery();

			while(rs.next()) {
				bs=new Passenger();
				bs.setPassengerId(rs.getInt(1));
				bs.setPassengerName(rs.getString(2));
				bs.setAge(rs.getInt(3));
				bs.setGender(rs.getString(4));
				bs.setFare(rs.getFloat(5));
				bs.setSeatNo(rs.getString(6));
				
				bs.setFrom(rs.getString(7));
				bs.setTo(rs.getString(8));
				bs.setDepartureTime(rs.getString(9));
				bs.setReporting(rs.getString(10));
				bs.setService_id(rs.getInt(11));
				/*bs.setMailId(rs.getString(4));
				bs.setMobile(rs.getInt(5));*/
				
				/*bs.setComments(rs.getString(7));*/

			}


		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pst!=null) {
					pst.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bs;

	}

	@Override
	public String insertDetails(Passenger p) {
		//int pid=p.getPassengerId();
		String pname = p.getPassengerName();
		int age= p.getAge();
		String gender= p.getGender();
		float fare = p.getFare();
		int id = p.getService_id();
		String seatNo = p.getSeatNo();
		
		/*int mobile= p.getMobile();
		String mailId = p.getMailId();*/
		

		Connection con = null;
		PreparedStatement pSt = null;

		try
		{  
			con = DBConnection.getConnection();
			String query = "insert into passenger(passenger_name,age,gender,fare,service_id,seatno) values(?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
			pSt = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
			//pSt.setInt(1, pid);
			pSt.setString(1, pname);
			pSt.setInt(2,age);
			pSt.setString(3,gender);
			
			pSt.setFloat(4, fare);
			pSt.setInt(5,id);
			pSt.setString(6, seatNo);
			/*preparedStatement.setString(4, mailId);
			preparedStatement.setInt(5, mobile);*/
			
			int i= pSt.executeUpdate();
			if (i!=0)  //Just to ensure data has been inserted into the database
				return "SUCCESS"; 
		}
		catch(SQLException e)
		{
			e.printStackTrace();

		}
		return "Oops.. Something went wrong there..!";
	}

	@Override
	public Passenger getTicket(int service_no, String seatno) 
		
	{
		Connection con=DBConnection.getConnection();
		Passenger bs=null;

		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=con.prepareStatement("select ticket_id,passenger_name,age ,gender,p.fare,seatno,source_from,source_to,departure_time,journey_time,s.service_id from service s join passenger p where  s.service_id=p.service_id and s.service_id=? and seatno=?;");
			pst.setInt(1,service_no);
			pst.setString(2, seatno);
			rs=pst.executeQuery();

			while(rs.next()) {
				bs=new Passenger();
				bs.setPassengerId(rs.getInt(1));
				bs.setPassengerName(rs.getString(2));
				bs.setAge(rs.getInt(3));
				bs.setGender(rs.getString(4));
				bs.setFare(rs.getFloat(5));
				bs.setSeatNo(rs.getString(6));
				
				bs.setFrom(rs.getString(7));
				bs.setTo(rs.getString(8));
				bs.setDepartureTime(rs.getString(9));
				bs.setReporting(rs.getString(10));
				bs.setService_id(rs.getInt(11));
				/*bs.setMailId(rs.getString(4));
				bs.setMobile(rs.getInt(5));*/
				
				/*bs.setComments(rs.getString(7));*/

			}


		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pst!=null) {
					pst.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bs;

	}

	@Override
	public int delete(int passengerId) {
		  int status=0;  
	        try{  
	            Connection con=DBConnection.getConnection(); 
	            PreparedStatement ps=con.prepareStatement("delete from passenger where ticket_id=?");  
	            ps.setInt(1,passengerId);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
		
	}

	

	
}
