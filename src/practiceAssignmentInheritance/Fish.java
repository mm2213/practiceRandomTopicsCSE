package practiceAssignmentInheritance;

public class Fish extends Animal{
	private boolean liveInWater;
	private boolean hasGills;
	
	public Fish() {
		super();
		this.liveInWater = true;
		this.hasGills = true;
	}
	
	public Fish(boolean liveInWater, boolean hasGills,double height, double weight, String aminalType, String bloodType) {
		super(height,weight,aminalType,bloodType);
		this.liveInWater = liveInWater;
		this.hasGills = hasGills;
	}

	public boolean isLiveInWater() {
		return liveInWater;
	}

	public boolean isHasGills() {
		return hasGills;
	}

	@Override
	public String toString() {
		return "Fish [liveInWater=" + liveInWater + ", hasGills=" + hasGills + "]";
	}
	
	
	
}
