package pertemuan8;

public class Bird extends Animal {

	private int wings;

	public Bird(String name, int age, int wings) {
		super(name, age);
		this.wings = wings;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public void eat() {
//		super.eat();
		System.out.println("Bird is eating");
	}
}
