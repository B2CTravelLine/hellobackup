package com.vir.dao;

import java.util.List;

import com.vir.model.Booking;
import com.vir.model.BusService;

public interface AdminDao {
	BusService getService(int serviceId);
	List<BusService> getAllService();
	boolean cancelService(int serviceId);
	
	int updateDetails(BusService b);
	String addService(BusService b);
	
}
