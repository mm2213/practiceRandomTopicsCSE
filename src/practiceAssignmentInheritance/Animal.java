package practiceAssignmentInheritance;

public class Animal {
	private double height;
	private double weight;
	private String aminalType;
	private String bloodType;
	
	public Animal() {
		this.height = 10;
		this.weight = 10;
		this.aminalType = "A";
		this.bloodType = "B";
	}
	
	public Animal(double height, double weight, String aminalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.aminalType = aminalType;
		this.bloodType = bloodType;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public String getAminalType() {
		return aminalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", aminalType=" + aminalType + ", bloodType="
				+ bloodType + "]";
	}
	
	
	
}
