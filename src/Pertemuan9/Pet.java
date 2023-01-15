package Pertemuan9;

import javax.print.DocFlavor.STRING;

public class Pet {
	private String petId;
	private String petName;
	private int petPrice;

	public Pet(String petId, String petName, int petPrice) {
		this.petId = petId;
		this.petName = petName;
		this.petPrice = petPrice;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetPrice() {
		return petPrice;
	}

	public void setPetPrice(int petPrice) {
		this.petPrice = petPrice;
	}

	public void printDetail() {
		System.out.println("pet Id    : " + petId);
		System.out.println("pet Name  : " + petName);
		System.out.println("pet Price : " + petPrice);
		System.out.println();
	}
}
