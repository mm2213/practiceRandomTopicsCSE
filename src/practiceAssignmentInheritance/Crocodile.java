package practiceAssignmentInheritance;

public class Crocodile extends Reptile {
	
	public Crocodile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Crocodile(boolean drySkin, boolean backBone, String eggType, double height, double weight, String aminalType,
			String bloodType) {
		super(drySkin, backBone, eggType, height, weight, aminalType, bloodType);
		// TODO Auto-generated constructor stub
	}

	public void ShowInfo() {
		toString();
	}

	@Override
	public String toString() {
		return "Crocodile [isDrySkin()=" + isDrySkin() + ", isBackBone()=" + isBackBone() + ", getEggType()="
				+ "Hard-shelled egg" + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAminalType()="
				+ getAminalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	
	
	
	
}
