package Pertemuan4;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {new Main();}
	
	public Main( ) {
		// classname objname = new constructor
		Dog dogA = new Dog("Neapolitan Mastiff", "Large", 5, "Black");
		
		//Vector(Class object name) Vectorname = new Vector<>();
		Vector<Dog> dogs = new Vector<>();
		
		dogs.add(new Dog("Chow Chow", "Small", 15, "White"));
		
		// foreach ctrl + space
		for(Dog i : dogs) {
			System.out.println("Dog Breed: " + i.getBreed());
		}
	}
}