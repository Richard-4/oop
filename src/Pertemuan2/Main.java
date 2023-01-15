package Pertemuan2;

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {new Main();}

	Scanner scan = new Scanner(System.in);

	private Main() {
		//RUN -> CTRL + F11
		//comment -> CTRL + /


		//primitive data type
		//int, long, boolean, double, char
		//wrapper class
		//suatu class yang membungkus primitive type untuk dujadikan suatu objek
		//integer, character, float, double	

//		strMethod();
//		dateMethod();
//		exceptionHandling();
		
//		String s = Utility.getInstance().addS("a");
		
		
	}	
	private void integerAndNumMethod() {
		Integer num = 0;
		System.out.println(num.compareTo(-10));
		System.out.println(num.equals(0));
		System.out.println(Integer.sum(50, 100));

		System.out.println(Math.PI);
		System.out.println(Math.ceil(1.001));
		System.out.println(Math.floor(1.999));
		System.out.println(Math.round(1.49));
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
	}

	private void charMethod () {
		Character ch = 'Z';
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isAlphabetic(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.isUpperCase(ch));
	}

	private void strMethod () {
		String str = "Hello World";
		System.out.println(str.charAt(4));
		System.out.println(str.length());
		String a = str.toUpperCase();
		System.out.println(a);
		System.out.println(str.toUpperCase());
		System.out.println(str.equalsIgnoreCase("hello World"));
		System.out.println(str.contains("allo"));
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("World"));
	}

	private void dateMethod () {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDay());
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getYear() + 1900);
	}

	private void exceptionHandling() {
//		float decimal = (float) 3.14;
//		int num = (int) decimal;
//		System.out.println(num);
//
//		String str = "123456";
//		Double test = Double.parseDouble(str);
//		System.out.println(test);
//
//		int x = Integer.parseInt(str);
//		System.out.println(x);
//		System.out.println(x + 1);
//
//		Integer y = 400;
//		String str_y = y.toString();
//		System.out.println(str_y + 400);
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Input Number");
//		int num1 = 0;
//
//				try {
//					//masukin statement yang kira2 bakal error
//					num = scan.nextInt();
//				} catch (Exception e) {
//					// TODO: handle exception
//					System.out.println("Wrong input!");
//					// e.printStackTrace();
//				}
//				scan.nextLine();
//				System.out.println(num);
		int choice = 0;
		do {
			System.out.println("SUBJECT");
			System.out.println("============");
			System.out.println("1. Mathematics");
			System.out.println("2. English");
			System.out.println("3. Exit");
			System.out.print("4. Choice: ");

			choice = scan.nextInt(); scan.nextLine();
			if (choice == 1) {
				// menu mathematics
				System.out.println("MATH MENU");
				System.out.println("=========");
				System.out.println("1. Calculate Circle Area");
				System.out.println("2. Calculate Rectangle Area");
				System.out.print("Choice: ");
				int mathChoice = scan.nextInt();scan.nextLine();

				if(mathChoice == 1) {
					// calculate circle area
					String type;
					do {
						System.out.print("Choose input type [Radius | Diameter]: ");
						type = scan.nextLine();
					} while(!type.equalsIgnoreCase("Radius") && !type.equalsIgnoreCase("Diameter"));

				}
				else if (mathChoice == 2) {
					// calculate rectangle area
				}
			}
			else if (choice == 2) {
				// menu english
			}
		} while(choice !=3);	
	}
}