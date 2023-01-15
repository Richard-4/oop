package pertemuan8;

public class Main {
	// Polymorphis
	// -> kemapuan suatu objek untuk memiliki berbagai bentuk

	// -> overloading
	// -kemampuan suatu kelas/objek untuk memiliki 2 method/lebih dgn nama yang sama

	// -> overriding
	// -kondisi dimana subclass menimpa method dari parent class

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		Animal a = new Animal("animal", 20);
//		a.eat();
//		a.eat("meat");
//		a.eat();
		
		Cat c = new Cat("Felis Catus", 15, "Long");
//		c.eat();
		
		//upcasting (cast child ke parent) 
		//cuma bisa ambil method yang di override
		Animal a2 = new Bird("birb", 10, 2);
		a2.eat();
		
		a2 = new Cat("Felis", 3, "short");
		a2.eat();
		
		//downcasting (cast parent ke child)
		System.out.println(((Cat)a2).getTail());//cara1
		Cat cat2 = (Cat)a2;//cara2
		System.out.println(cat2.getName());
	}
}
