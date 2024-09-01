package midter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Create3list {
	static ArrayList<String> Land=new ArrayList<String>();
	static ArrayList<String> Air=new ArrayList<String>();
	static ArrayList<String> Farm=new ArrayList<String>();
	public static int getLandSize() {
		return Land.size() ;
	}
	
	public static int getAirSize() {
		return Air.size() ;
	}
	public static int getFarmSize() {
		return Farm.size() ;
	}
	
	
	public static  String getFarmA(int a) {
		return Farm.get(a) ;
	}
	public static  String getAirA(int a) {
		return Farm.get(a) ;
	}

	public static  String getLandA(int a) {
		return Farm.get(a) ;
	}


//create 2 more different of these
	public static ArrayList<String> joblistLand(String item) {  

		File FN = new File(item);
	
		
		Scanner myScanFN = null;
		

		File joblist = new File(item);
		FileWriter fw1;
		try {
			fw1 = new FileWriter(joblist, true);
	
		BufferedWriter bwriter = new BufferedWriter(fw1);

		myScanFN = new Scanner(FN);
		String tempText = " ";
		int count=1;
		 
		 while (myScanFN.hasNext()) { 
	            tempText = myScanFN.nextLine();
	            //System.out.println(tempText);
	            if(tempText.equals("Ken car")||tempText.equals("barbie car")||tempText.equals("Tank")||tempText.equals("automobile")) {
	              //  System.out.println("it works and its reading it");
	            Land.add(tempText);
	            tempText = myScanFN.nextLine();
	            Land.add(tempText);
	            tempText = myScanFN.nextLine();
	            Land.add(tempText);
	            Land.add(String.valueOf(count));
	            count++;
	            //System.out.println(tempText);
	        }
	
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Land;
	}
	public static ArrayList<String> joblistAir(String item) {  

		File FN = new File(item);
	
		
		Scanner myScanFN = null;
		

		File joblist = new File(item);
		FileWriter fw1;
		try {
			fw1 = new FileWriter(joblist, true);
	
		BufferedWriter bwriter = new BufferedWriter(fw1);

		myScanFN = new Scanner(FN);
		String tempText = "";
		int count=1;
		while (myScanFN.hasNext()) { 
			tempText = myScanFN.nextLine();
			if(tempText.equals("air ballon")||tempText.equals("Sr71")){
			Air.add(tempText);
			tempText = myScanFN.nextLine();
			Air.add(tempText);
			tempText = myScanFN.nextLine();
			Air.add(tempText);
			Air.add(String.valueOf(count));
			count++;
			//System.out.println(tempText);
		}
	
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Air;
	}
	
	
	public static ArrayList<String> joblistFarm(String item) {  

		File FN = new File(item);
	
		
		Scanner myScanFN = null;
		

		File joblist = new File(item);
		FileWriter fw1;
		try {
			fw1 = new FileWriter(joblist, true);
	
		BufferedWriter bwriter = new BufferedWriter(fw1);

		myScanFN = new Scanner(FN);
		String tempText = "";
		int count=1;
		while (myScanFN.hasNext()) { 
			tempText = myScanFN.nextLine();
			if(tempText.equals("tractor")||tempText.equals("combine harvester")) {
				Farm.add(tempText);
			tempText = myScanFN.nextLine();
			Farm.add(tempText);
			tempText = myScanFN.nextLine();
			Farm.add(tempText);
			Farm.add(String.valueOf(count));
			count++;
			//System.out.println(tempText);
		}
		
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Farm;
	}
	
	public static ArrayList<String> getStringLand() {
	    return Land;
	}
	public static ArrayList<String> getStringAir() {
	    return Air;
	}
	public static ArrayList<String> getStringFarm() {
	    return Farm;
	}
}
