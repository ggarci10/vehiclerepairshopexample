package midter;

public class SR71 extends AirVehicles{

	
	@Override
	protected String getRepairChoices() {
		// TODO Auto-generated method stub
		return "1: fix power enigine \n2:intsall stealth kit ";
	}

	@Override
	protected double doRepair(int selectRepair) {
		double repairTime = 0;
		if(selectRepair == 1) {
			repairTime = getRepairTime(1);
			PartsAndSupplies.getItem("high powered engine");
			 //debug
		}
		if(selectRepair == 2) {
			repairTime = getRepairTime(2);
			PartsAndSupplies.getItem("stealth kit");
			 
		}
		
		return repairTime;
	}

	public static double getRepairTime(int repairChoiceNumber) {
		double repairTime = 0;
		if (repairChoiceNumber == 1) {
			repairTime = 6.6;
		}
		if (repairChoiceNumber == 2) {
			repairTime = 12.3;
		}
		return repairTime;
	}
}
