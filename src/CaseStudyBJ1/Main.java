package CaseStudyBJ1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	private Main() {
		menu();
	}

	private void menu() {
		Scanner inputMenu = new Scanner(System.in);
		int startOrExit = 0;
		while (startOrExit < 1 || startOrExit > 2) {
			System.out.println("1. Start program");
			System.out.println("2. exit");
			System.out.print("Choise >> ");
			startOrExit = inputMenu.nextInt();
			if (startOrExit == 1) {
				start();
			} else if (startOrExit == 2) {
				System.exit(0);
			}
		}
		dataTypeTable(69, 69);
	}

	private void start() {
//		System.out.println("start kebuka")
		Scanner inputNumberStart = new Scanner(System.in);
		int firstNumber = -1, secondNumber = -1;

		while (firstNumber <= 1 || firstNumber >= 100) {
			System.out.print("Input the first number [1 - 100](inclusive) : ");
			firstNumber = inputNumberStart.nextInt();
		}

		while (secondNumber <= 1 || secondNumber >= 100) {
			System.out.print("Input the second number [1 - 100](inclusive) : ");
			secondNumber = inputNumberStart.nextInt();
			dataTypeTable(firstNumber, secondNumber);
		}
	}
	
	private boolean equalOrNo(int firstNum, int secNum) {
		boolean res = (firstNum == secNum) ? true : false;
		return res;
	}

	private void dataTypeTable(int firstNum, int secNum) {
		String stringTypeFormat = String.format("%8d" + " + " + "%-8d", firstNum, secNum);
		String characterTypeFormat = String.format("%9c" + "   " + "%-8c", firstNum, secNum);
		String integerTypeFormat = String.format("%12d %7s", firstNum*secNum,"");
		String floatTypeFormat = String.format("%16f%5s", (float)firstNum/secNum, "");
		String boolTypeFormat = String.format("%18b%18s", equalOrNo(firstNum, secNum),"");
		printDataTypeTableHead();
		System.out.printf("+" + stringTypeFormat + "|" + characterTypeFormat + "|" + integerTypeFormat + "|" + floatTypeFormat + "|" + boolTypeFormat + "+\n");
		System.out.println("+========================================================================================================================+");
	}
	
	private void printDataTypeTableHead() {
		System.out.println("+========================================================================================================================+");
		System.out.println("+  + (String type)  |  (Character Type)  |  * (Integer type)  |  / (Floating type)  |  input 1 == input2 (Boolean type)  |");
		System.out.println("+========================================================================================================================+");
	}
}

//+========================================================================================================================+
//+  + (String type)  |  (Character Type)  |  * (Integer type)  |  / (Floating type)  |  input 1 == input2 (Boolean type)  | 
//+========================================================================================================================+


