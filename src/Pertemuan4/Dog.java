package Pertemuan4;

//alt + shift + s + r = getter setter
//alt + shift + s + o = constructor
public class Dog {
	//att / prop
	private String breed;
	private String size;
	private int age;
	private String color;

	// constructor special method untuk bikin object
	public Dog(String breed, String size, int age, String color) {
		super();
		this.breed = breed;
		this.size = size;
		this.age = age;
		this.color = color;
	}

	//get = buat ngambil set = buat assign pake getter setter biar bisa dikasih validasi di dlm method
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}