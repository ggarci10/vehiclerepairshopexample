package midter;

public class CombineHarvester extends FarmVehicle {
	@Override
	protected String getRepairChoices() {
		// TODO Auto-generated method stub
		return "1: install music kit \n2:hack it so you dont need subcription to use it  ";
	}

	@Override
	protected double doRepair(int selectRepair) {
		double repairTime = 0;
		if(selectRepair == 1) {
			repairTime = getRepairTime(1);
			PartsAndSupplies.getItem("A track");
			//debugif(selectRepair == 1) {
			repairTime = getRepairTime(2);
			PartsAndSupplies.getItem("hacking software");
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
			repairTime = 12.7;
		}
		return repairTime;
	}
}
