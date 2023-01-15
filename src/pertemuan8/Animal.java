package pertemuan8;

public class Animal {
	protected String name;
	protected int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//overloading : *pastikan bedain parameternya*
	public void eat() {
		System.out.println("this animal is eating");
	}
	
	public void eat(String food) {
		System.out.println("this animal is eating a " + food);
	}
	
	public void eat(int servings) {
		System.out.println("this animal is eating " + servings + " food");
	}
	
	//kalo jml parameter sama & data typenya sama
	//bisa bedain urutannya. cth:
	public void eat(String food, int servings) {
		System.out.println("this animal is eating " + servings + " food");
	}
	
	public void eat(int servings, String food) {
		System.out.println("this animal is eating " + servings + " food");
	}
}
