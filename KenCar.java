package midter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class KenCar extends LandVehicle{



@Override
protected String getRepairChoices() {
	// TODO Auto-generated method stub
	return "1: Fix  Barbie ejector seat\n2:wheel repair \n3:gas fill";
	
}

@Override
protected double doRepair(int selectRepair) {
	double repairTime = 0;
	if(selectRepair == 1) {
		repairTime = getRepairTime(1);
		PartsAndSupplies.getItem("4 high powered springs");
		PartsAndSupplies.getItem("replace upholster pads");
		PartsAndSupplies.getItem("lubricate bearings");
		PartsAndSupplies.getItem("4 ml bering oil");
		//System.out.println("repaired ejector seat");  //debug
	}
	if(selectRepair == 2) {
		repairTime = getRepairTime(1);
		PartsAndSupplies.getItem("20 lugnuts");
		PartsAndSupplies.getItem("4 wheels");
		//System.out.println("wheel repair done");  //debug
	}
	if(selectRepair == 3) {
		repairTime = getRepairTime(3);
		PartsAndSupplies.getItem("insertted desiel");
		//System.out.println("repaired ejector seat");  //debug
	}
	// TODO Auto-generated method stub
	return repairTime;
}

public static double getRepairTime(int repairChoiceNumber) {
	double repairTime = 0;
	if (repairChoiceNumber == 1) {
		repairTime = 7.5;
	}
	
	if (repairChoiceNumber == 2) {
		repairTime = 4.3;
	}
	if (repairChoiceNumber == 3) {
		repairTime = 1.4;
	}
	return repairTime;
}
}
