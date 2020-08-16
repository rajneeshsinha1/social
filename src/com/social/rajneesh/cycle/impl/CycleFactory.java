package com.social.rajneesh.cycle.impl;

import java.util.concurrent.Callable;

import com.social.rajneesh.cycle.CycleBuilder;

public class CycleFactory implements Callable<Cycle> {

	Cycle cycle;

	private CycleBuilder cycleBuilder;

	public CycleFactory(CycleBuilder cycleBuilder) {
		this.cycleBuilder = cycleBuilder;
	}

	public Cycle getCycle() {
		return this.cycleBuilder.getCycle(); // return
												// this.cycleBuilder.getCycle();
	}

	public void makeCycle() {
		this.cycleBuilder.buildCycleFrame();
		this.cycleBuilder.buildCycleHandlebarWithBrakes();
		this.cycleBuilder.buildCycleSeat();
		this.cycleBuilder.buildCycleWheels();
		this.cycleBuilder.buildCycleChainAssembly();
	}

	@Override
	public Cycle call() throws Exception {

		makeCycle();
		cycle = getCycle();

		return cycle;
	}

}
