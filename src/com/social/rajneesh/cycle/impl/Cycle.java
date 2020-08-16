package com.social.rajneesh.cycle.impl;

import java.text.ParseException;

import com.social.rajneesh.comp.service.ChainAssembly;
import com.social.rajneesh.comp.service.Frame;
import com.social.rajneesh.comp.service.HandlebarWithBrakes;
import com.social.rajneesh.comp.service.Seat;
import com.social.rajneesh.comp.service.Wheels;
import com.social.rajneesh.cycle.CyclePlan;

public class Cycle implements CyclePlan {

	private Frame cycleFrame;
	private HandlebarWithBrakes cycleHandlebarWithBrakes;
	private Seat cycleSeat;
	private Wheels cycleWheels;
	private ChainAssembly cycleChainAssembly;

	private float cyclePrice;

	public void setCycleFrame(Frame frame) {
		cycleFrame = frame;
	}

	public Frame getCycleFrame() {
		return cycleFrame;
	}

	public void setCycleHandlebarWithBrakes(HandlebarWithBrakes handlebarWithBrakes) {
		cycleHandlebarWithBrakes = handlebarWithBrakes;
	}

	public HandlebarWithBrakes getCycleHandlebarWithBrakes() {
		return cycleHandlebarWithBrakes;
	}

	public void setCycleSeat(Seat seat) {
		cycleSeat = seat;
	}

	public Seat getCycleSeat() {
		return cycleSeat;
	}

	public void setCycleWheels(Wheels wheels) {
		cycleWheels = wheels;
	}

	public Wheels getCycleWheels() {
		return cycleWheels;
	}

	public void setCycleChainAssembly(ChainAssembly chainAssembly) {
		cycleChainAssembly = chainAssembly;
	}

	public ChainAssembly getCycleChainAssembly() {
		return cycleChainAssembly;
	}

	public float getCyclePrice() throws ParseException {
		float cyclePrice = cycleFrame.getFramePrice() + cycleHandlebarWithBrakes.getHandlebarWithBrakesPrice()
				+ cycleSeat.getSeatPrice() + cycleWheels.getWheelsPrice() + cycleChainAssembly.getChainAssemblyPrice();
		return cyclePrice;
	}

}
