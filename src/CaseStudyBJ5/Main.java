package CaseStudyBJ5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Customer> customers = new ArrayList<>();
	ArrayList<CustomersRatings> CustomersRating = new ArrayList<>();
	ArrayList<Menus> menus = new ArrayList<>();

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		menus.add(new Menus("Gelato (ice cream)", 85000));
		menus.add(new Menus("Agliata", 65000));
		menus.add(new Menus("Bagna cauda", 55000));
		menus.add(new Menus("Cioppino", 100000));
		menus.add(new Menus("Minestrone", 95000));
		menus.add(new Menus("Risi e bisi", 45000));
		menus.add(new Menus("Pesto", 35000));
		menus.add(new Menus("Neccio", 25000));
		menus.add(new Menus("Tetarolo", 40000));
		menus.add(new Menus("Calzone", 45000));
		while (true) {
			int chooseMenu = mainMenu();
			if (chooseMenu == 1) {
				viewAllRestaurantData();
			} else if (chooseMenu == 2) {
				inputCustomer();
			} else if (chooseMenu == 3) {
				inputRating();
			} else {
				System.exit(0);
			}
		}
	}

	public int mainMenu() {
		int choose = -1;
		do {
			System.out.println("1. View all restaurant data.");
			System.out.println("2. Input new customer.");
			System.out.println("3. Input rates");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choose = scan.nextInt();
			scan.nextLine();
		} while (choose < 1 || choose > 4);
		return choose;
	}

	public void viewAllRestaurantData() {
		while (true) {
			int chooseView = viewMenu();
			if (chooseView == 1) {
				// view menu
				viewMenus();
			} else if (chooseView == 2) {
				// view customer
				viewCustomers();
			} else if (chooseView == 3) {
				// view rates
				viewRates();
			} else {
				break;
			}
		}
	}

	public void viewMenus() {
		int count = 1;
		System.out.println("Ristorante Gistoso");
		for (Menus i : menus) {
			System.out.println(count + ". " + i.getName() + " - " + i.getPrice());
			count++;
		}
		promptEnterKey();
	}

	public void viewCustomers() {
		int count = 1;
		System.out.println("Ristorante Gistoso");
		if (customers.isEmpty()) {
			System.out.println("No data");
		} else {
			for (Customer i : customers) {
				System.out.println(count + ". " + i.getName() + " - " + i.getGender());
				count++;
			}
		}
		promptEnterKey();
	}
	
	public void viewRates() {
		int count = 1;
		System.out.println("Ristorante Gistoso");
		if (CustomersRating.isEmpty()){
			System.out.println("No data");
		} else {
			for (CustomersRatings i : CustomersRating) {
				System.out.println(count + ". " + i.getRate() + " - " + i.getComment());
				count++;
			}
		}
		promptEnterKey();
	}

	public int viewMenu() {
		int choose = -1;
		do {
			System.out.println("1. View menus");
			System.out.println("2. View customer.");
			System.out.println("3. View rates");
			System.out.println("4. Back");
			System.out.print(">> ");
			choose = scan.nextInt();
		} while (choose < 1 || choose > 4);
		return choose;
	}

	private void inputCustomer() {
		String name = "";
		do {
			System.out.println("Input name of customer");
			System.out.print(">> ");
			name = scan.nextLine();
		} while (name.isEmpty());

		String gender = "";
		do {
			System.out.println("Input geneder of customer");
			System.out.print(">> ");
			gender = scan.nextLine();
		} while (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"));

		customers.add(new Customer(name, gender));
	}

	private void inputRating() {
		int rate = -1;
		do {
			try {
				System.out.println("Insert rating of restaurant");
				System.out.print(">> ");
				rate = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (rate < 1 || rate > 10);

		String comment = "";
		do {
			System.out.println("Insert comment");
			System.out.print(">> ");
			comment = scan.nextLine();
		} while (comment.isEmpty());

		CustomersRating.add(new CustomersRatings(rate, comment));
	}

	public void promptEnterKey() {
		scan.nextLine();
	}
}
