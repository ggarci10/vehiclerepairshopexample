package midter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PartsAndSupplies {

	public static ArrayList<String> itemsUsed = new ArrayList<>();

	public static String getItem(String item) {
		itemsUsed.add(item);
		return "issued " + item;
	}

	public static void clearList() {
		itemsUsed.clear();
	}

	public static void createRestockOrderFile() {
	
		File myfile1 = new File("RestockOrder.txt");
	
	//   System.out.println(myfile1.exists());
		   
		try {
	
		myfile1.createNewFile();
			FileWriter fw1 = new FileWriter(myfile1);
			BufferedWriter bwriter = new BufferedWriter(fw1);
			
			   for (int i = 0; i < PartsAndSupplies.itemsUsed.size();i++) 
			      { 		  
				   bwriter.write(itemsUsed.get(i)+"\n");
			         
			      }   
			
			
		
			
			bwriter.flush();
			bwriter.close();
			System.out.println("have finished the restock order beep beep");
			
		}catch(Exception x) {
			System.out.println(x);
		}
		clearList();
	}
	
}
