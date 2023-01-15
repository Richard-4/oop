package Pertemuan7;

import java.util.ArrayList;

public class Main {
	//Encapsulation
	
	//Inhertance
	//konsep OOP ketika suatu class mewarisi attribute/method  yang bisa diakses oleh class lain
	
	public static void main(String[] args) {new Main();}
	
	public Main() {
		Dog dog1 = new Dog("Dog", 4, "Bulldog");
		Bird bird1 = new Bird("Birb", 2, "Golden");
		
		//bisa ngakses semua method di parent class tapi gak bisa pake method di child class lain yang punya parent sama
		dog1.breath();
		dog1.run();
		
		bird1.breath();
		bird1.fly();
		
		//arraylist parent class bisa diisi oleh child classnya
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(dog1);
		animalList.add(bird1);
		
		
		for (Animal a : animalList) {
			//arraylist cuma bisa pake method dari classnya gak bisa pake method child classnya
//			a.fly();
//			a.run();
			
			//tapi bisa di typecast
			if (a instanceof Dog) {
				((Dog) a).run();
			} else if (a instanceof Bird) {
				((Bird) a).fly();
			}
		}
	}
}
