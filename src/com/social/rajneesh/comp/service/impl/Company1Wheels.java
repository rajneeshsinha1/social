package com.social.rajneesh.comp.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.social.rajneesh.comp.service.Wheels;

public class Company1Wheels implements Wheels {

	private String tyreType;
	private String rimType;
	
	public String date;
	
	
	
	public Company1Wheels(String tyreType, String rimType, String date) {
		this.tyreType = tyreType;
		this.rimType = rimType;
		this.date = date;
	}

	@Override
	public String getTyreType() {
		// TODO Auto-generated method stub
		return tyreType;
	}

	@Override
	public String getRimType() {
		// TODO Auto-generated method stub
		return rimType;
	}

	@Override
	public float getWheelsPrice() throws ParseException {
		  String str1 = "Jan-2016";
		  String str2 = "Nov-2016";
			SimpleDateFormat sdf = null;
			try {
				sdf = new SimpleDateFormat("MMMM-yyyy");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date date1 = sdf.parse(str1);
			Date date2 = sdf.parse(str2);
			Date appDate = sdf.parse(date);
			
			if(appDate.after(date1) && appDate.before(date2)){
				return 200;
			}
			
		return 230;
	}


}
