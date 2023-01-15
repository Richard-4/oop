package Pertemuan7;

//class animal adalah class parent / superclass karena akan mewarisi attribute nya ke kelas Dog
public class Animal {
	// protected artinya attribute ini bisa diakses langsung oleh child classnya (class Dog)
	// kalo private class Dog gak akan bisa mengakses attribute animal dan harus pake getter setter

	protected String name;
	protected int age;

	public Animal(String name, int age) {
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

	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void breath() {
		System.out.println(name + " is breathing");
	}
}
