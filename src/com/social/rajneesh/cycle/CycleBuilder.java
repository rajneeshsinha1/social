package com.social.rajneesh.cycle;

import com.social.rajneesh.cycle.impl.Cycle;

public interface CycleBuilder {
	
	public void buildCycleFrame();
	public void buildCycleHandlebarWithBrakes();
	public void buildCycleSeat();
	public void buildCycleWheels();
	public void buildCycleChainAssembly();
	public Cycle getCycle();

}
