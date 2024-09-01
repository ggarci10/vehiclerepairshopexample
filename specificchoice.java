package midter;

import java.util.Scanner;

public class specificchoice {
	
	public static void createlandvechile() {
		 Scanner next = new Scanner(System.in);
		   int choice;
			System.out.println("you have chose automobile \n select these choices of automobiles to choice from:\n 1 automobile \n 2 ken car, \n  3 barbie car \n  4 tank");
			choice=next.nextInt();
			if (choice==1) {
				Automobile a = new Automobile();
				System.out.println(a.getRepairChoices());
				choice = next.nextInt();
				System.out.println("repair time = " + a.doRepair(choice));
				writeFile.orderFileAutomobile(choice);
			
					}
					else	if (choice==2) {
						
						KenCar a = new KenCar();
						System.out.println(a.getRepairChoices());
						choice = next.nextInt();
						writeFile.orderFileKen(choice);
						System.out.println("repair time = " + a.doRepair(choice));
					
							}
					else	if (choice==3) {
						BarbieDreamCar a = new BarbieDreamCar();
						System.out.println(a.getRepairChoices());
						choice = next.nextInt();
						writeFile.orderFileBarbie(choice);
						System.out.println("repair time = " + a.doRepair(choice));
					
							}
					else	if (choice==4) {
				

						Tank a = new Tank();
						System.out.println(a.getRepairChoices());
						choice = next.nextInt();
						writeFile.orderFileTank(choice);
						System.out.println("repair time = " + a.doRepair(choice));
					
							}
			
		
		
	}
	
	
	public static void createairvechile() {
		 Scanner next = new Scanner(System.in);
		   int choice;
			System.out.println("you have chosen air vechile \n select these choices of automobiles to choice from:\n 1 ahot air ballon \n 2 sr71");
			choice=next.nextInt();
			if (choice==1) {
				HotAirballon a = new HotAirballon();
		System.out.println(a.getRepairChoices());
		choice = next.nextInt();
		writeFile.orderFileAirballon(choice);
		System.out.println("repair time = " + a.doRepair(choice));
	
			}
			else	if (choice==2) {
				SR71 a = new SR71();
				System.out.println(a.getRepairChoices());
				choice = next.nextInt();
				writeFile.orderFileSR71(choice);
				System.out.println("repair time = " + a.doRepair(choice));
			
					}
	}
			public static void createfarmvechile() {
				 Scanner next = new Scanner(System.in);
				   int choice;
					System.out.println("you have chose farm vechile \n select these choices of automobiles to choice from:\n 1 tractor \n 2 combineharvester");
					choice=next.nextInt();
					if (choice==1) {
						Tractor a = new Tractor();
				System.out.println(a.getRepairChoices());
				choice = next.nextInt();
				writeFile.orderFileTractor(choice);
				System.out.println("repair time = " + a.doRepair(choice));
			
					}
					else	if (choice==2) {
						CombineHarvester a = new CombineHarvester();
						System.out.println(a.getRepairChoices());
						choice = next.nextInt();
						writeFile.orderFileCombineHarvester(choice);
						System.out.println("repair time = " + a.doRepair(choice));
					
							}
				
	}
}
