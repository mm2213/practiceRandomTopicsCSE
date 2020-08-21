package practiceAssignmentInheritance;

public class Reptile extends Animal {
	private boolean drySkin;
	private boolean backBone;
	private String eggType;
	
	public Reptile() {
		super();
		this.drySkin = true;
		this.backBone = true;
		this.eggType = "Soft Shelled eggs";
	}
	
	public Reptile(boolean drySkin, boolean backBone, String eggType,double height, double weight, String aminalType, String bloodType) {
		super(height,weight,aminalType,bloodType);
		this.drySkin = drySkin;
		this.backBone = backBone;
		this.eggType = eggType;
	}

	public boolean isDrySkin() {
		return drySkin;
	}

	public boolean isBackBone() {
		return backBone;
	}

	public String getEggType() {
		return eggType;
	}

	@Override
	public String toString() {
		return "Reptile [drySkin=" + drySkin + ", backBone=" + backBone + ", eggType=" + eggType + "]";
	}
	
	
	
}
