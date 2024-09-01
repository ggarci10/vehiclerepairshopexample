package midter;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RunVehicleRepairShop {

	public static void main(String[] args) {
		
		
		 ArrayList<String> Air = new ArrayList<String>();
		 ArrayList<String> Land = new ArrayList<String>();
		 ArrayList<String> Farm = new ArrayList<String>();
		
	String joblist="workorder.txt";
		File myfile1 = new File("workorder.txt");
		
		System.out.println(myfile1.exists());
	try {
		if (!myfile1.exists()) {
			myfile1.createNewFile();
		}
	
	}catch(Exception x) {
		System.out.println(x);
	}
	writeFile.input();
	writeFile.output();
JobList.joblist(joblist);
		choice.createchoices();
		PartsAndSupplies.createRestockOrderFile();
		
		Create3list.joblistAir(joblist);
		Create3list.joblistLand(joblist);
		Create3list.joblistFarm(joblist);
		
//	System.out.println(Create3list.getStringLand());
	//System.out.println(Create3list.getStringAir());
//	System.out.println(Create3list.getStringFarm());
		int	daynum=0;
		while (true) {
			  Scanner myObj = new Scanner(System.in); 
			  if (daynum==0) {
		System.out.println("press 0 to start the repair shop?");
			  }
			  if (daynum!=0) {
			  System.out.println("press 1 to keep working");
			  }
		int userName = myObj.nextInt(); 
			if (userName==0) {
	Land.addAll(repairShop.factory1(Create3list.getStringLand()));
	Air.addAll(repairShop.factory2(Create3list.getStringAir()));
	Farm.addAll(repairShop.factory3(Create3list.getStringFarm()));
	daynum++;
	//System.out.println(Land);	
	//System.out.println(Air);	
//	System.out.println(Farm);	
			}
			else if(userName==1) {
			//System.out.println(Land);
				repairShop.factory1(Land);
				repairShop.factory2(Air);
				repairShop.factory3(Farm);
			
			}
//System.out.println(daynum);	
		}


}
}























//
//Automobile camero = new Automobile(4);
//
//double timeToRepair = camero.doRepair(1);
//System.out.println(timeToRepair + " hours");
//
////of day pricess
//RepairStockUsed.createRestockOrderFile();
