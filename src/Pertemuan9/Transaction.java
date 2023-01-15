package Pertemuan9;

public class Transaction {
	private String transactionId;
	private Pet pet;
	private int quantity;

	public Transaction(String transactionId, Pet pet, int quantity) {
		super();
		this.transactionId = transactionId;
		this.pet = pet;
		this.quantity = quantity;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void printDetail() {
		System.out.println("transaction Id    : " + transactionId);
		System.out.println("pet Id            : " + pet.getPetId());
		System.out.println("pet Name          : " + pet.getPetName());
		System.out.println("pet Price         : " + pet.getPetPrice());
		System.out.println("quantity          : " + quantity);
		System.out.println("total price       : $" + quantity * pet.getPetPrice());
		System.out.println();
	}
}
