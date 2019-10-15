package com.vir.dao;

import com.vir.model.Passenger;

public interface PassengerDao {
	String insertDetails(Passenger p);
	
	Passenger getDetails(int passengerId);
	Passenger getTicket(int service_no,String seatno);
	
	 int delete(int passengerId);
	
	
}
