package Pertemuan9;

import java.sql.*;
import java.util.*;

public class Main {
	ArrayList<Pet> pets = new ArrayList<>();
	ArrayList<Transaction> transactions = new ArrayList<>();

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		Connect connect = Connect.getConnection();

		String readPetData = "SELECT * FROM pet";
		String readPetTransaction = "SELECT * FROM pet_transaction JOIN pet ON pet_transaction.petId = pet.petId";
		ResultSet rs = connect.executeQuery(readPetTransaction);

//		try {
//			while (rs.next()) {
//				String petId = rs.getString("petId");
//				String petName = rs.getString("petName");
//				int petPrice = rs.getInt("petPrice");
//				
//				pets.add(new Pet(petId, petName, petPrice));		
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			while (rs.next()) {
				String petId = rs.getString("petId");
				String petName = rs.getString("petName");
				int petPrice = rs.getInt("petPrice");

				String transactionId = rs.getString("transaction_id");
				int quantity = rs.getInt("quantity");

				Pet pet = new Pet(petId, petName, petPrice);
				transactions.add(new Transaction(transactionId, pet, quantity));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Transaction t : transactions) {
			t.printDetail();
		}
	}
}
