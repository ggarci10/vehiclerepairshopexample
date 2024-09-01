package midter;

public class BarbieDreamCar extends LandVehicle {

	
	
	@Override
	protected String getRepairChoices() {
		// TODO Auto-generated method stub
		return "1: Fix Ken Ejector seat\n2:wheel repair \n3:gas fill3 ";
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
		  //debug
		}
		if(selectRepair == 2) {
			repairTime = getRepairTime(1);
			PartsAndSupplies.getItem("20 lugnuts");
			PartsAndSupplies.getItem("4 wheels");
		 //debug
		}
		if(selectRepair == 2) {
			repairTime = getRepairTime(2);
			PartsAndSupplies.getItem("insertted desiel");
			  //debug
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
			repairTime = 4.6;
		}
		if (repairChoiceNumber == 3) {
			repairTime = 5.7;
		}
		return repairTime;
	}
	
}
