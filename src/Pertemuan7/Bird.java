package Pertemuan7;

public class Bird extends Animal{

	private String featherColor;

	public Bird(String name, int age, String featherColor) {
		super(name, age);
		this.featherColor = featherColor;
	}

	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}
	
	public void fly() {
		System.out.println(name + " fly with " + featherColor + " wings");
	}
	
}
