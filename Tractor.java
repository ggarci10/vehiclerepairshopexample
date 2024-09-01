package midter;

public class Tractor extends FarmVehicle {

	
	@Override
	protected String getRepairChoices() {
		// TODO Auto-generated method stub
		return "1: repair wheels \n2:hack program ";
	}

	@Override
	protected double doRepair(int selectRepair) {
		double repairTime = 0;
		if(selectRepair == 1) {
			repairTime = getRepairTime(1);
		
		  //debug
		}
		if(selectRepair == 2) {
			repairTime = getRepairTime(2);
			PartsAndSupplies.getItem("hacking set");
		}
		
		return repairTime;
	}

	public static double getRepairTime(int repairChoiceNumber) {
		double repairTime = 0;
		if (repairChoiceNumber == 1) {
			repairTime = 7.5;
		}
		if (repairChoiceNumber == 2) {
			repairTime = 12.3;
		}
		return repairTime;
	}
}
