package com.vir.service;

import com.vir.dao.PassengerDao;
import com.vir.dao.PassengerDaoImpl;
import com.vir.model.Passenger;

public class PassengerServiceImpl implements PassengerService {
	PassengerDao pDao=new PassengerDaoImpl();
	

	@Override
	public Passenger getDetails(int passengerId) {
		return pDao.getDetails(passengerId);
	}

	@Override
	public String insertDetails(Passenger p) {
		return pDao.insertDetails(p);
	}

	@Override
	public Passenger getTicket(int service_no, String seatno) {
		
		return pDao.getTicket(service_no, seatno);
	}

	@Override
	public int delete(int passengerId) {
		
		return pDao.delete(passengerId);
	}

	/*@Override
	public String insertFeedback(Passenger p) {
		
		return pDao.insertFeedback(p);
	}
*/
}
