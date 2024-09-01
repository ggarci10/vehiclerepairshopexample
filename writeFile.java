package midter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
public class writeFile {

	static int jobnumber =1;
	
	public static void orderFileKen(int test) {
		
		
		try {
			
			FileWriter fwriter = new FileWriter("workorder.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);			
		
			
			outFile.write("Ken car\n");
			//System.out.println(jobnumber);
			if(test==1) {
				outFile.write("ejector seat\n");
				
				String s=String.valueOf(jobnumber);  
				outFile.write(KenCar.getRepairTime(1)+"\n");
				outFile.write(s+"\n");
			
			}
			else if(test==2) { 
				outFile.write("wheel change\n");
				String s=String.valueOf(jobnumber);  
				outFile.write(KenCar.getRepairTime(2)+"\n");
				outFile.write(s+"\n");
				
			}
			else if(test==3) {
				outFile.write("desiel\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(KenCar.getRepairTime(3)+"\n");
				outFile.write(s+"\n");
				
			}
			increment();	
			outFile.flush();
			outFile.close();
	
			
		}catch(Exception x) {
			System.out.println(x);
		}
		
	}
	
	
	public static void orderFileBarbie(int test) {
		
		File myfile1 = new File("workorder.txt");

		
		try {
			FileWriter fwriter = new FileWriter("workorder.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);		
			
			//System.out.println(jobnumber);
			outFile.write("barbie car\n");
			if(test==1) {
				outFile.write("ejector seat\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(BarbieDreamCar.getRepairTime(1)+"\n");
				outFile.write(s+"\n");
			}
			else if(test==2) { 
				outFile.write("wheel change\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(BarbieDreamCar.getRepairTime(2)+"\n");
				outFile.write(s+"\n");
				
			}
			else if(test==3) {
				outFile.write("desiel\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(BarbieDreamCar.getRepairTime(3)+"\n");
				outFile.write(s+"\n");
				
			}
			
			increment();
			outFile.flush();
			outFile.close();
			
		
		}catch(Exception x) {
			System.out.println(x);
		}
		
	}
	
	
	public static void orderFileTank(int test) {
		
		File myfile1 = new File("workorder.txt");

	
		try {
		
			FileWriter fwriter = new FileWriter("workorder.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);		
			//System.out.println(jobnumber);
			outFile.write("Tank\n");
			if(test==1) {
				outFile.write("tracks change\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(Tank.getRepairTime(1)+"\n");
				outFile.write(s+"\n");
				
			}
			else if(test==2) { 
				outFile.write("shells install\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(Tank.getRepairTime(2)+"\n");
				outFile.write(s+"\n");
				
			
			}
			else if(test==3) {
				outFile.write("A track music\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(Tank.getRepairTime(3)+"\n");
				outFile.write(s+"\n");
				
			
			}
			
			
			
			increment();			
			
			
			outFile.flush();
			outFile.close();
			
			
		}catch(Exception x) {
			System.out.println(x);
		}
		
	}
	
	public static void orderFileAirballon(int test) {
		
		File myfile1 = new File("workorder.txt");

	
		try {
			//System.out.println(jobnumber);
			FileWriter fwriter = new FileWriter("workorder.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);		
			
			outFile.write("air ballon\n");
			if(test==1) {
				outFile.write("patch balloon\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(HotAirballon.getRepairTime(1)+"\n");
				outFile.write(s+"\n");
				
			}
			else if(test==2) { 
				outFile.write("gas change\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(HotAirballon.getRepairTime(2)+"\n");
				outFile.write(s+"\n");
				
			
			}
			
			
			
			
			
			increment();			
			outFile.flush();
			outFile.close();
			
			
		}catch(Exception x) {
			System.out.println(x);
		}
		
	}
	
	
	
	
	public static void orderFileSR71(int test) {
		
		File myfile1 = new File("workorder.txt");

	
		try {
			//System.out.println(jobnumber);
			FileWriter fwriter = new FileWriter("workorder.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);		
			
			
			outFile.write("Sr71\n");
			if(test==1) {
				outFile.write("engine change\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(SR71.getRepairTime(1)+"\n");
				outFile.write(s+"\n");
				
			}
			else if(test==2) { 
				outFile.write("stealthing kit install\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(SR71.getRepairTime(2)+"\n");
				outFile.write(s+"\n");
				
			
			}
			
			
			
			increment();				
			outFile.flush();
			outFile.close();
			
			
		}catch(Exception x) {
			System.out.println(x);
		}
		
	}
	
	
	
	
	public static void orderFileTractor(int test) {
		
		File myfile1 = new File("workorder.txt");


		try {
			//System.out.println(jobnumber);
			FileWriter fwriter = new FileWriter("workorder.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);		
			
			
			outFile.write("tractor\n");
			
			
			if(test==1) {
				outFile.write("wheel change \n");
				String s=String.valueOf(jobnumber); 
				outFile.write(Automobile.getRepairTime(1)+"\n");
				outFile.write(s+"\n");
				
			}
			else if(test==2) { 
				outFile.write("hacking software\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(Tractor.getRepairTime(2)+"\n");
				outFile.write(s+"\n");
				
			
			}
			
			increment();			
			outFile.flush();
			outFile.close();
			
			
		}catch(Exception x) {
			System.out.println(x);
		}
		
	}
	
	
	
	
	public static void orderFileAutomobile(int test) {
		
		File myfile1 = new File("workorder.txt");

	
		try {
			//System.out.println(jobnumber);
			FileWriter fwriter = new FileWriter("workorder.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);		
			
			
			outFile.write("automobile\n");
			
			if(test==1) {
				outFile.write("wheel change\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(Automobile.getRepairTime(1)+"\n");
				outFile.write(s+"\n");
				
			}
			else if(test==2) { 
				outFile.write("carborator change\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(Automobile.getRepairTime(2)+"\n");
				outFile.write(s+"\n");
				
			
			}
			else if(test==3) { 
				outFile.write("paint job\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(Automobile.getRepairTime(3)+"\n");
				outFile.write(s+"\n");
				
			
			
			}
			increment();			
			outFile.flush();
			outFile.close();
			
			
		}catch(Exception x) {
			System.out.println(x);
		}
		
	}
	
	
	public static void orderFileCombineHarvester(int test) {
		
		File myfile1 = new File("workorder.txt");

		
		try {
			//System.out.println(jobnumber);			
			FileWriter fwriter = new FileWriter("workorder.txt", true);
			PrintWriter outFile = new PrintWriter(fwriter);		
			
			
			outFile.write("combine harvester\n");
			if(test==1) {
				outFile.write("A track music\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(CombineHarvester.getRepairTime(1)+"\n");
				outFile.write(s+"\n");
				
			}
			else if(test==2) { 
				outFile.write("hacking software\n");
				String s=String.valueOf(jobnumber); 
				outFile.write(CombineHarvester.getRepairTime(2)+"\n");
				outFile.write(s+"\n");
				
			
			}
			
			increment();		
			outFile.flush();
			outFile.close();
			
			
		}catch(Exception x) {
			System.out.println(x);
		}
		
	}
	
	public static void input() {
		try {	File myfile1 = new File("inputlot.txt");
		myfile1.createNewFile();
		FileWriter fw1 = new FileWriter(myfile1);
		BufferedWriter bwriter = new BufferedWriter(fw1);	
		
		bwriter.flush();
		bwriter.close();
		
	}catch(Exception x) {
		System.out.println(x);
	}
	}
	
public static void output() {
	
	try {	File myfile1 = new File("outputlot.txt");
	myfile1.createNewFile();
	FileWriter fw1 = new FileWriter(myfile1);
	BufferedWriter bwriter = new BufferedWriter(fw1);	
	
	bwriter.flush();
	bwriter.close();
	
}catch(Exception x) {
	System.out.println(x);
}
		
	}
	
	
	  public static void increment()
	   {
		  jobnumber++;
	   }
}
