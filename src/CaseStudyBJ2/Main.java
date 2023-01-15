package CaseStudyBJ2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {new Main();}
	Scanner in = new Scanner(System.in);
	public Main () {
		while (true) {
			int input = mainMenu();
			if (input == 1) {
				mathMenu();
			} else if (input == 2) {
				
			} else {
				System.exit(0);
			}
		}
	}

	private int mainMenu() {
		int input;
		while (true) {
			System.out.println("SUBJECT");
			System.out.println("=======");
			System.out.println("1. Mathematics");
			System.out.println("2. English");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			input = in.nextInt();
			if (input<=3 && input >=1) {return input;}
		}
	}

	private Object mathMenu(){
		int input;
		while (true) {
			System.out.println("MATH MENU");
			System.out.println("=========");
			System.out.println("1. Calculate circle area");
			System.out.println("2. Calcluate rectangle area");
			System.out.print("Choice: ");
			input = in.nextInt();
			if (input==1) {
				return circleOption();
			} else if (input == 2) {
				return rectangleOption();
			}
		}
	}

	private Object circleOption () {
		String input;
		while (true) {
			System.out.print("Choose input type [Radius | Diameter](Case Insensitive): ");
			input = in.nextLine();
			if (input.equalsIgnoreCase("radius")) {
				return radiusFormula();
			} else if (input.equalsIgnoreCase("diameter")) {
				return diameterFormula();
			}
		}
	}

	private Object radiusFormula () {
		int RNGnum = createRNGMax100();
		System.out.println("The generated radius is " + RNGnum);
		System.out.println("The area of circle is " + (float)(Math.PI * RNGnum * RNGnum));
		pressEnterToContinue();
		return null;
	}
	
	private Object diameterFormula () {
		int RNGnum = createRNGMax100();
		System.out.println("The generated diameter is " + RNGnum);
		System.out.println("The area of circle is " + (float)(Math.PI * RNGnum * RNGnum / 2));
		pressEnterToContinue();
		return null;
	}
	
	private Object rectangleOption () {
		String input;
		while (true) {
			System.out.print("Input width and length[format: WidthxLength]: ");
			input = in.nextLine();
			if (input.contains("x")) {
				return rectangleFormula(input);
			}
		}
	}
	
	private Object rectangleFormula(String input) {
		String[] parts = input.split("x");
		int width = Integer.parseInt(parts[0]);
		int length = Integer.parseInt(parts[1]);
		System.out.println("The area of rectangle is " + (width*length));
		pressEnterToContinue();
		return null;
	}

	private int createRNGMax100() {
		Random rand = new Random();
		int number = rand.nextInt(101);
		return number;
	}

	private void pressEnterToContinue()
	{ 
		System.out.println();
		System.out.println();
		System.out.println("Press any key to continue...");
		try
		{
			System.in.read();
			in.nextLine();
		}  
		catch(Exception e)
		{}  
	}
}