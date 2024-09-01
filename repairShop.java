package midter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class repairShop {
	static int daynumAir=1;
	static int daynumLand=1;
	static int daynumFarm=1;
	static int clearnum=1;
	static int threenum=3;
	public static void incrementair()
	   {
		daynumAir++;	   
		}

	public static void incrementland()
	   {
		daynumLand++;	   
		
	   }
	public static void incrementfarm()
	   {
		daynumFarm++;	   
	   }
	
	public static List<String> factory1 (List<String> land ) {
		   ArrayList<String> inunfinishedlot = new ArrayList<String>();
		   ArrayList<String> finishedLot = new ArrayList<String>();
		double factory1 = 20;
		int numberofvehicles = land.size()/4;
		int count=0;
		
		int replacernum=2;
		double leftover;
		
//		System.out.println(land);
		
  while (factory1 > 0 && count < numberofvehicles) {
	//  replacernum =basenum+skipper;
				if (factory1 -Double.parseDouble(land.get(replacernum)) < 0) {
						
					//System.out.println(factory1-Double.parseDouble(land.get(replacernum)));
				//	System.out.println(factory1);
					leftover=Double.parseDouble(land.get(replacernum))-factory1;
					land.set(replacernum,Double.toString(leftover) );
					//System.out.println("doesthiswork");
					//System.out.println(land);
					factory1=0;
				System.out.println("day "+daynumLand +"for land factory");
				incrementland();
				for (int i=0;i<land.size();i++) {
				inunfinishedlot.add(land.get(i));
				
				}
				
				}
				else {
					factory1= factory1-Double.parseDouble(land.get(replacernum)) ;
					
					for (int i=0; i<=replacernum+1;i++) {
						//System.out.println(land.get(i));
						finishedLot.add(land.get(0));
						land.remove(0);
						
					}
					
				
				}
				
				count++;
				

 
		}
  //System.out.println(finishedLot);
 // System.out.println(inunfinishedlot);

  createlistoutputlot(finishedLot);
  createlistinputlot(inunfinishedlot);
  return land;
	}
	
public static List<String> factory2 (List<String> Air  ) {
	   ArrayList<String> inunfinishedlot = new ArrayList<String>();
	   ArrayList<String> finishedLot = new ArrayList<String>();
	double factory1 = 20;
	int numberofvehicles = Air.size()/4;
	int count=0;
	
	int replacernum=2;
	double leftover;
 

while (factory1 > 0 && count < numberofvehicles) {
//  replacernum =basenum+skipper;
			if (factory1 -Double.parseDouble(Air.get(replacernum)) < 0) {
					
				//System.out.println(factory1-Double.parseDouble(land.get(replacernum)));
				//System.out.println(factory1);
				leftover=Double.parseDouble(Air.get(replacernum))-factory1;
				Air.set(replacernum,Double.toString(leftover) );
			//	System.out.println(Air);
				factory1=0;
		//	System.out.println("day "+daynumAir+"for air factory");
			incrementair();
			
			for (int i=0;i<Air.size();i++) {
			inunfinishedlot.add(Air.get(i));
			}
			}
			else {
				factory1= factory1-Double.parseDouble(Air.get(replacernum)) ;
				
				for (int i=0; i<=replacernum+1;i++) {
					finishedLot.add(Air.get(0));
					Air.remove(0);
					
				}
				
			
			}
			
			count++;
			}

createlistoutputlot(finishedLot);
createlistinputlotAir(inunfinishedlot);
return Air;
}
	

 public static  List<String> factory3 (List<String> Farm  ) {
	 ArrayList<String> done = new ArrayList<String>();
	   ArrayList<String> notdone = new ArrayList<String>();
	 double factory2 = 20;
		int numberofvehicles = Farm.size()/4;
		int count=0;
		
		int replacernum=2;
		double leftover;
		
		//System.out.println(Farm);
	while (factory2 > 0 && count < numberofvehicles) {
	//  replacernum =basenum+skipper;
				if (factory2 -Double.parseDouble(Farm.get(replacernum)) < 0) {
						
				//	System.out.println(factory2-Double.parseDouble(Farm.get(replacernum)));
				//	System.out.println(factory2);
					leftover=Double.parseDouble(Farm.get(replacernum))-factory2;
					Farm.set(replacernum,Double.toString(leftover) );
					//System.out.println(Farm);
					factory2=0;
				System.out.println("day "+daynumFarm+"for farm factory");
				incrementfarm();
				for (int i=0;i<Farm.size();i++) {
				notdone.add(Farm.get(i));
				}
				}
				else {
					factory2= factory2-Double.parseDouble(Farm.get(replacernum)) ;
					
					for (int i=0; i<=replacernum+1;i++) {
						done.add(Farm.get(0));
						Farm.remove(0);
						
					}
					
				
				}
				
				count++;
				}

	createlistoutputlot(done);
	createlistinputlotFarm(notdone);
	return Farm;
}

 public static void createlistoutputlot( List<String> list) {
	 File myfile1 = new File("outputlot.txt");

		
		try {
			//System.out.println(jobnumber);
			FileWriter fwriter = new FileWriter("outputlot.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);		
				
				   for (int i = 0; i <list.size() ;i++) 
				      { 		  
					
					   fwriter.write(list.get(i)+"\n");
				         
				      }   
				
				
				   outFile.flush();
					outFile.close();
			
				//System.out.println("have finished the restock order beep beep");
				
			}catch(Exception x) {
				System.out.println(x);
			}
	 
 }
 //make the inputlot only delete after every 3 tries
 public static void createlistinputlot( List<String> list) {
	 
	
	
		
		try {
			//System.out.println(jobnumber);
		
			FileWriter fwriter = new FileWriter("inputlot.txt",true);
			PrintWriter outFile = new PrintWriter(fwriter);		
				
				   for (int i = 0; i <list.size() ;i++) 
				      { 		  
					
					   fwriter.write(list.get(i)+"\n");
				         
				      }   
				
				
				   outFile.flush();
					outFile.close();
			
				//System.out.println("have finished the restock order beep beep");
				
			}catch(Exception x) {
				System.out.println(x);
			}
	 
 }

 public static void createlistinputlotAir( List<String> list) {
	
	
		
		try {
			//System.out.println(jobnumber);
		
			FileWriter fwriter = new FileWriter("inputlot.txt",true );
			PrintWriter outFile = new PrintWriter(fwriter);		
				
				   for (int i = 0; i <list.size() ;i++) 
				      { 		  
					
					   fwriter.write(list.get(i)+"\n");
				         
				      }   
				
				
				   outFile.flush();
					outFile.close();
			
				//System.out.println("have finished the restock order beep beep");
				
			}catch(Exception x) {
				System.out.println(x);
			}
	 
 }
 public static void createlistinputlotFarm( List<String> list) {
	
	
		
		try {
			//System.out.println(jobnumber);
		
			FileWriter fwriter = new FileWriter("inputlot.txt",true);
			PrintWriter outFile = new PrintWriter(fwriter);		
				
				   for (int i = 0; i <list.size() ;i++) 
				      { 		  
					
					   fwriter.write(list.get(i)+"\n");
				         
				      }   
				
				
				   outFile.flush();
					outFile.close();
			
				//System.out.println("have finished the restock order beep beep");
				
			}catch(Exception x) {
				System.out.println(x);
			}
	 
 }

}
