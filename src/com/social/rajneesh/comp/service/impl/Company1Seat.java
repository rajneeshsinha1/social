package com.social.rajneesh.comp.service.impl;

import com.social.rajneesh.comp.service.Seat;

public class Company1Seat implements Seat {

	private int noOfSeats;
	private float seatPrice;
	
	
	public Company1Seat(int noOfSeats, float seatPrice) {
		this.noOfSeats = noOfSeats;
		this.seatPrice = seatPrice;
	}

	@Override
	public int getNoOfSeats() {
		// TODO Auto-generated method stub
		return noOfSeats;
	}

	@Override
	public float getSeatPrice() {
		// TODO Auto-generated method stub
		return seatPrice;
	}

}
