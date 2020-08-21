package practiceAssignmentInheritance;

public class Bird extends Animal{
	private boolean AnimalsWithfeathers;
	private boolean canFly;
	
	public Bird() {
		super();
		this.AnimalsWithfeathers = true;
		this.canFly = true;
	}
	
	public Bird(boolean animalsWithfeathers, boolean canFly,double height, double weight, String aminalType, String bloodType) {
		super(height,weight,aminalType,bloodType);
		AnimalsWithfeathers = animalsWithfeathers;
		this.canFly = canFly;
	}

	public boolean isAnimalsWithfeathers() {
		return AnimalsWithfeathers;
	}

	public boolean isCanFly() {
		return canFly;
	}

	@Override
	public String toString() {
		return "Bird [isAnimalsWithfeathers()=" + isAnimalsWithfeathers() + ", isCanFly()=" + isCanFly()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAminalType()="
				+ getAminalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	
	
	
}
