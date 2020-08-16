package com.social.rajneesh.comp.service.impl;

import com.social.rajneesh.comp.service.HandlebarWithBrakes;

public class Company1HandlebarWithBrakes implements HandlebarWithBrakes {

	private String handleType;
	private String brakeType;
	private float handlebarWithBrakesPrice;
	
	
	public Company1HandlebarWithBrakes(String handleType, String brakeType, float handlebarWithBrakesPrice) {
		this.handleType = handleType;
		this.brakeType = brakeType;
		this.handlebarWithBrakesPrice = handlebarWithBrakesPrice;
	}

	@Override
	public String getHandleType() {
		// TODO Auto-generated method stub
		return handleType;
	}

	@Override
	public String getBrakeType() {
		// TODO Auto-generated method stub
		return brakeType;
	}

	@Override
	public float getHandlebarWithBrakesPrice() {
		// TODO Auto-generated method stub
		return handlebarWithBrakesPrice;
	}

}
