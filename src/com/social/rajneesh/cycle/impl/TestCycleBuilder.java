package com.social.rajneesh.cycle.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.social.rajneesh.comp.service.ChainAssembly;
import com.social.rajneesh.comp.service.Frame;
import com.social.rajneesh.comp.service.HandlebarWithBrakes;
import com.social.rajneesh.comp.service.Seat;
import com.social.rajneesh.comp.service.Wheels;
import com.social.rajneesh.comp.service.impl.Company1ChainAssembly;
import com.social.rajneesh.comp.service.impl.Company1HandlebarWithBrakes;
import com.social.rajneesh.comp.service.impl.Company1Seat;
import com.social.rajneesh.comp.service.impl.Company1Wheels;
import com.social.rajneesh.comp.service.impl.SteelFrame;
import com.social.rajneesh.cycle.CycleBuilder;

public class TestCycleBuilder {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter weight for Frame: ");
		float frameWeight = Float.parseFloat(br.readLine());
		System.out.println("Enter type of Frame Name: ");
		String frameName = br.readLine();
		System.out.println("Enter price for the Frame: ");
		float framePrice = Float.parseFloat(br.readLine());

		Frame frame = new SteelFrame(frameWeight, frameName, framePrice);

		System.out.println("Enter handle type: ");
		String handleType = br.readLine();
		System.out.println("Enter brake type: ");
		String brakeType = br.readLine();
		System.out.println("Enter price for handle and brakes: ");
		float handlebarWithBrakesPrice = Float.parseFloat(br.readLine());

		HandlebarWithBrakes handlebarWithBrakes = new Company1HandlebarWithBrakes(handleType, brakeType,
				handlebarWithBrakesPrice);

		System.out.println("Enter no. of seats: ");
		int noOfSeats = Integer.parseInt(br.readLine());
		System.out.println("Enter price Seats: ");
		float seatPrice = Float.parseFloat(br.readLine());

		Seat seat = new Company1Seat(noOfSeats, seatPrice);

		System.out.println("Enter wheel tyre type: ");
		String tyreType = br.readLine();
		System.out.println("Enter wheel rim type: ");
		String rimType = br.readLine();
		System.out.println("Enter Date for the Wheels: ");// ex->> Aug-2020
		String strDate = br.readLine();

		Wheels wheels = new Company1Wheels(tyreType, rimType, strDate);

		System.out.println("Enter Chain Length: ");
		int chainLength = Integer.parseInt(br.readLine());
		System.out.println("Enter price for the Chain Assembly: ");
		float chainAssemblyPrice = Float.parseFloat(br.readLine());

		// Calculate price for cycle using single thread/main thread

		ChainAssembly chainAssembly = new Company1ChainAssembly(chainLength, chainAssemblyPrice);

		CycleBuilder cycleBuilder = new SocialCycleBuilder(frame, handlebarWithBrakes, seat, wheels, chainAssembly);

		CycleFactory cycleFactory = new CycleFactory(cycleBuilder);
		/*
		 * cycleFactory.makeCycle();
		 * 
		 * 
		 * Cycle cycle = cycleFactory.getCycle();
		 * 
		 * System.out.println("Cycle built");
		 * System.out.println("Frame price is: " +
		 * cycle.getCycleFrame().getFramePrice()); System.out.println(
		 * "HandlebarWithBrakes price is: " +
		 * cycle.getCycleHandlebarWithBrakes().getHandlebarWithBrakesPrice());
		 * System.out.println("Seat price is: " +
		 * cycle.getCycleSeat().getSeatPrice());
		 * System.out.println("ChainAssembly price is :" +
		 * cycle.getCycleChainAssembly().getChainAssemblyPrice()); try {
		 * System.out.println("Wheels price is: " +
		 * cycle.getCycleWheels().getWheelsPrice());
		 * System.out.println("Cycle Price: " + cycle.getCyclePrice()); } catch
		 * (ParseException e1) { e1.printStackTrace(); }
		 */
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		ArrayList<Future> fArrayList = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			Future<Cycle> fCycle = (Future<Cycle>) executorService.submit(cycleFactory);
			fArrayList.add(fCycle);
		}

		float frameP = 0, handleP = 0, seatP = 0, wheelP = 0, chainP = 0, cyclePrice = 0, totalCyclePrice = 0;
		for (int i = 0; i <= 999; i++) {
			Future<Cycle> cFuture = fArrayList.get(i);
			try {
				frameP = cFuture.get().getCycleFrame().getFramePrice();
				handleP = cFuture.get().getCycleHandlebarWithBrakes().getHandlebarWithBrakesPrice();
				seatP = cFuture.get().getCycleSeat().getSeatPrice();
				wheelP = cFuture.get().getCycleWheels().getWheelsPrice();
				chainP = cFuture.get().getCycleChainAssembly().getChainAssemblyPrice();
				cyclePrice = cFuture.get().getCyclePrice();
				totalCyclePrice += cFuture.get().getCyclePrice();
			} catch (ParseException | InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Frame Price is: " + frameP);
		System.out.println("HandleAndBrakes Price is: " + handleP);
		System.out.println("Seat Price is: " + seatP);
		System.out.println("Wheels Price is: " + wheelP);
		System.out.println("ChainAssembly Price is: " + chainP);
		System.out.println("One Cycle Price is: " + cyclePrice);
		System.out.println("All Cycles Price is: " + totalCyclePrice);
	}

}
