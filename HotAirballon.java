package midter;

public class HotAirballon extends AirVehicles {
	

		
		@Override
		protected String getRepairChoices() {
			// TODO Auto-generated method stub
			return "1: Fix hole \n2:fix chamber of gas ";
		}

		@Override
		protected double doRepair(int selectRepair) {
			double repairTime = 0;
			if(selectRepair == 1) {
				repairTime = getRepairTime(1);
				PartsAndSupplies.getItem("cloth");
			
			}
			if(selectRepair == 2) {
				repairTime = getRepairTime(2);
				PartsAndSupplies.getItem("metal");
			}
			return repairTime;
		}

		public static double getRepairTime(int repairChoiceNumber) {
			double repairTime = 0;
			if (repairChoiceNumber == 1) {
				repairTime = 4.4;
			}
			if (repairChoiceNumber == 2) {
				repairTime = 2.2;
			}
			return repairTime;
		}
	}

