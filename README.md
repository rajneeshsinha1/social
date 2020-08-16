Clone the project and import to the eclipse.

Run the TestCycleBuilder.java class.

Enter the Requred input values(For date follow the format ex(Aug-2020)).

After that it will execute one by one class and provide the object to dependent class to give the Cycle object.

SocialCycleBuilder.java class is used to set the creadted dependent object to build the cycle object.

Finally CycleFactory.java give the cycle object(cycle).

And then we can get and print the price and other properties from the cycle object.


Sample Input:

Enter weight for Frame: 
10
Enter type of Frame Name: 
Steel
Enter price for the Frame: 
100
Enter handle type: 
Straight
Enter brake type: 
Disc
Enter price for handle and brakes: 
200
Enter no. of seats: 
1
Enter price Seats: 
400
Enter wheel tyre type: 
Tubeless
Enter wheel rim type: 
Spokes
Enter Date for the Wheels: 
Aug-2020     (Enter Date in the mentioned format(Feb-2020)) (Based on date wheel price return Jan-2016 < inputDate < Nov-2016 ->>> 200 else 230)
Enter Chain Length: 
2
Enter price for the Chain Assembly: 
500

==================================================================================================================================================

Sample OutPut: 

Frame Price is: 100.0
HandleAndBrakes Price is: 200.0
Seat Price is: 400.0
Wheels Price is: 230.0
ChainAssembly Price is: 500.0
One Cycle Price is: 1430.0
All Cycles Price is: 1430000.0

