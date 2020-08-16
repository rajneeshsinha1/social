package com.social.rajneesh.cycle.impl;

import com.social.rajneesh.comp.service.ChainAssembly;
import com.social.rajneesh.comp.service.Frame;
import com.social.rajneesh.comp.service.HandlebarWithBrakes;
import com.social.rajneesh.comp.service.Seat;
import com.social.rajneesh.comp.service.Wheels;
import com.social.rajneesh.cycle.CycleBuilder;

public class SocialCycleBuilder implements CycleBuilder {
	
	private Frame frame;
	private HandlebarWithBrakes handlebarWithBrakes;
	private Seat seat;
	private Wheels wheels;
	private ChainAssembly chainAssembly;
	
	private Cycle cycle;
	
	
	public SocialCycleBuilder(Frame frame, HandlebarWithBrakes handlebarWithBrakes, Seat seat, Wheels wheels, ChainAssembly chainAssembly) {
		this.frame = frame;
		this.handlebarWithBrakes = handlebarWithBrakes;
		this.seat = seat;
		this.wheels = wheels;
		this.chainAssembly = chainAssembly;
		this.cycle = new Cycle();
	}

	@Override
	public void buildCycleFrame() {
	cycle.setCycleFrame(frame);
	}

	@Override
	public void buildCycleHandlebarWithBrakes() {
		cycle.setCycleHandlebarWithBrakes(handlebarWithBrakes);
	}

	@Override
	public void buildCycleSeat() {
		cycle.setCycleSeat(seat);
	}

	@Override
	public void buildCycleWheels() {
		cycle.setCycleWheels(wheels);
	}

	@Override
	public void buildCycleChainAssembly() {
		cycle.setCycleChainAssembly(chainAssembly);
	}

	@Override
	public Cycle getCycle() {
		
		return this.cycle;
	}

}
