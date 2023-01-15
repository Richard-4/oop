package Pertemuan7;

//class animal adalah class child karena mewarisi attribute dari class parent
public class Dog extends Animal {

	private String dogType;
	
	public Dog(String name, int age, String dogType) {
		// super ini akan memanggil constructor parent class
		super(name, age);
		this.dogType = dogType;
	}

	public String getDogType() {
		return dogType;
	}

	public void setDogType(String dogType) {
		this.dogType = dogType;
	}

	public void run() {
		System.out.println(dogType + " named " + name + " run");
	}
}
