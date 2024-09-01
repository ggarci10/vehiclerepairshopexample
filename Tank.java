package midter;

public class Tank extends LandVehicle {

	
	@Override
	protected String getRepairChoices() {
		// TODO Auto-generated method stub
		return "1: fix funny looking wheels\n2:insert ammo\n3 replace music player  ";
	}

	@Override
	protected double doRepair(int selectRepair) {
		double repairTime = 0;
		if(selectRepair == 1) {
			repairTime = getRepairTime(1);
			PartsAndSupplies.getItem("2 long tracks");
			 //debug
		}
		if(selectRepair == 2) {
			repairTime = getRepairTime(2);
			PartsAndSupplies.getItem("shells");
			  //debug
		}
		if(selectRepair == 3) {
			repairTime = getRepairTime(3);
			PartsAndSupplies.getItem("A track ");
			 //debug
		}
		// TODO Auto-generated method stub
		return repairTime;
	}

	public static  double getRepairTime(int repairChoiceNumber) {
		double repairTime = 0;
		if (repairChoiceNumber == 1) {
			repairTime = 7.5;
		}
		if (repairChoiceNumber == 2) {
			repairTime = 10.5;
		}
		if (repairChoiceNumber == 3) {
			repairTime = 4.6;
		}
		return repairTime;
	}
}
