package pertemuan8part2;
							   //implements bisa pake 2+ interface
public class Bird extends Animal implements IFlyable{

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

	@Override
	public void walk() {
		System.out.println("bird walk");
	}

	@Override
	public void fly() {
		System.out.println("bird fly");
	}
	
}
