package com.vir.model;

public class Passenger {
	private int passengerId,age,service_id;
	private String passengerName,gender,seatNo,from,to,departureTime,reporting;
	private  float fare;
	public Passenger(int passengerId, int age, int service_id, String passengerName, String gender, String seatNo,
			String from, String to, String departureTime, String reporting, float fare) {
		super();
		this.passengerId = passengerId;
		this.age = age;
		this.service_id = service_id;
		this.passengerName = passengerName;
		this.gender = gender;
		this.seatNo = seatNo;
		this.from = from;
		this.to = to;
		this.departureTime = departureTime;
		this.reporting = reporting;
		this.fare = fare;
	}
	public Passenger() {
		super();
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getReporting() {
		return reporting;
	}
	public void setReporting(String reporting) {
		this.reporting = reporting;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", age=" + age + ", service_id=" + service_id
				+ ", passengerName=" + passengerName + ", gender=" + gender + ", seatNo=" + seatNo + ", from=" + from
				+ ", to=" + to + ", departureTime=" + departureTime + ", reporting=" + reporting + ", fare=" + fare
				+ "]";
	}
	
	
 	
}
