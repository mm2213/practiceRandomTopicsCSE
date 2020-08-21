package practiceAssignmentInheritance;

public class Eel extends Fish{
	 private boolean releaseElectronicCharge;

	public Eel() {
		super();
		this.releaseElectronicCharge=false;
		// TODO Auto-generated constructor stub
	}

	public Eel(boolean liveInWater, boolean hasGills, double height, double weight, String aminalType,
			String bloodType,boolean releaseElectronicCharge) {
		super(liveInWater, hasGills, height, weight, aminalType, bloodType);
		this.releaseElectronicCharge=releaseElectronicCharge;
		// TODO Auto-generated constructor stub
	}

	public boolean isReleaseElectronicCharge() {
		return releaseElectronicCharge;
	}

	
	public void ShowInfo() {
		toString();
	}
	
	@Override
	public String toString() {
		return "Eel [releaseElectronicCharge=" + releaseElectronicCharge + ", isReleaseElectronicCharge()="
				+ isReleaseElectronicCharge() + ", isLiveInWater()=" + isLiveInWater() + ", isHasGills()="
				+ isHasGills() + ", toString()=" + super.toString() + ", getHeight()=" + getHeight() + ", getWeight()="
				+ getWeight() + ", getAminalType()=" + getAminalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	 
	 
	 
	 
}
