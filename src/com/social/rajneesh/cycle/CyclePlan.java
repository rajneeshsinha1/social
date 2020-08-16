package com.social.rajneesh.cycle;

import com.social.rajneesh.comp.service.ChainAssembly;
import com.social.rajneesh.comp.service.Frame;
import com.social.rajneesh.comp.service.HandlebarWithBrakes;
import com.social.rajneesh.comp.service.Seat;
import com.social.rajneesh.comp.service.Wheels;

public interface CyclePlan {
	
	public void setCycleFrame(Frame frame);
	public void setCycleHandlebarWithBrakes(HandlebarWithBrakes handlebarWithBrakes);
	public void setCycleSeat(Seat seat);
	public void setCycleWheels(Wheels wheels);
	public void setCycleChainAssembly(ChainAssembly chainAssembly);
	

}
