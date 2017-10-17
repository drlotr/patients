
public class ChildPatient extends Patient {
	private int age;
	private String name;
	private String parentName;
	public ChildPatient(String name, int age, String parentName) {
		super(name, age);
		this.age = age;
		this.name = name;
		this.parentName =  parentName;
	}
	public String getParentName() {
		return parentName;
	}
	public String toString() {
		return "Patient " + name + " is " + age + " years old and has parent " + parentName;
	}
	public double dosage() {
		return 300.0;
	}

}
