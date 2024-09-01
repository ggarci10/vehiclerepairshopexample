package midter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class JobList {
	static ArrayList<String> list=new ArrayList<String>();
	public static int getSize() {
		return list.size() ;
	}
	public static ArrayList<String> getStringList() {
	    return list;
	}
	
	 
		public static ArrayList<String> joblist(String item) {
			
			//ArrayList<String> list=new ArrayList<String>();//Creating arraylist    

			File FN = new File(item);
			// if (!FN.exists()) {
			// FN.createNewFile();
			// }
			
			Scanner myScanFN = null;
			
//creates a phonebook
			File joblist = new File(item);
			FileWriter fw1;
			try {
				fw1 = new FileWriter(joblist, true);
		
			BufferedWriter bwriter = new BufferedWriter(fw1);

			myScanFN = new Scanner(FN);
			String tempText = "";
			while (myScanFN.hasNext()) { 
				tempText = myScanFN.nextLine();
				list.add(tempText);
			//	System.out.println(tempText);
			}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return list;
		}
}



