package com.social.rajneesh.comp.service.impl;

import com.social.rajneesh.comp.service.Frame;

public class SteelFrame implements Frame {
	
	private float frameWeight;
	private String frameName;
	private float framePrice;
	
	
	
	public SteelFrame(float frameWeight, String frameName, float framePrice) {
		this.frameWeight = frameWeight;
		this.frameName = frameName;
		this.framePrice = framePrice;
	}


	@Override
	public float getFrameWieght() {

		return frameWeight;
	}


	@Override
	public String getFrameName() {
		// TODO Auto-generated method stub
		return frameName;
	}

	@Override
	public float getFramePrice() {
		// TODO Auto-generated method stub
		return framePrice;
	}

	
}
