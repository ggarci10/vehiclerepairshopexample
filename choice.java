package midter;

import java.util.Scanner;

public class choice {

	public static void createchoices() {
	 Scanner next = new Scanner(System.in);
	   int choice=5;
	System.out.println("Welcome to Vehicle Repair Awsome System Management Tool");
	

	
	while (choice!=4) {
		System.out.println("Enter Vehicles repair requests\n 1 is for air \n 2 is for farm \n 3 is for land \n 4 is leave: ");
		choice=next.nextInt();
	if (choice==1) {
		specificchoice.createairvechile();
		
		
	}
	else if (choice==2) {
		specificchoice.createfarmvechile();
	}
	else if (choice==3) {
	specificchoice.createlandvechile();
	}
	else if (choice==4) { 
		System.out.println("closing");
	}
	}
}
}
