package pertemuan8;

public class Cat extends Animal {

	private String tail;

	public Cat(String name, int age, String tail) {
		super(name, age);
		this.tail = tail;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	@Override
	public void eat() {
//		super.eat();
		System.out.println("Cat is eating");
	}

}
