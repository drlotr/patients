
public class Patient {
	private String name;
	private int age;
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "Patient " + name + " is " + age + " years old.";
	}
	public double dosage() {
		return 600.0;
	}
	public double bmi(double heightInMeters, double weightInKilograms) {
		heightInMeters = heightInMeters * heightInMeters;
		return weightInKilograms / heightInMeters;
	}
	public double bmi(double height, String heightUnits, double weight, String weightUnits) {
		if(heightUnits.equals("cm")) {
			height = height / 100;
		}
		if(heightUnits.equals("in")) {
			height = height / 39.3701;
		}
		if(weightUnits.equals("stones")) {
			weight = weight / 0.157473;
		}
		if(weightUnits.equals("lbs")) {
			weight = weight / 2.20462;
		}
		height = height * height;
		return weight / height;
	}
}
