package com.xworkz.traffic.dto;

import java.time.LocalDateTime;

public class TrafficDTO {

	private String vehicleNo;
	private String place;
	private LocalDateTime dateAndTime;
	private String violation;

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getViolation() {
		return violation;
	}

	public void setViolation(String violation) {
		this.violation = violation;
	}

	@Override
	public String toString() {
		return "TrafficDTO [vehicleNo=" + vehicleNo + ", place=" + place + ", dateAndTime=" + dateAndTime
				+ ", violation=" + violation + "]";
	}

}
