package pertemuan8part2;

public class Main {
	public static void main(String[] args) {new Main();}
	//abstract class adalah class yg cuma bisa diturunkan
	//gk bisa di instance
	
	//interface
	//class untuk ngasih method khusus di beberapa class
	public Main() {
		Cat c = new Cat("cat1", 5, "medium");
		c.walk();
		
		Bird b = new Bird("birb", 9, 2);
		b.fly();
	}
}
