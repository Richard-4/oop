package CaseStudyBJ8;
import java.util.*;

public class Main {
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {new Main();}
	
	public Main() {
		while(true) {
			int chooseMenu = mainMenu();
			if (chooseMenu == 1) {
				
			} else if (chooseMenu == 2) {
				
			} else if (chooseMenu == 3) {
				
			} else if (chooseMenu == 4) {
				
			} else if (chooseMenu == 5) {
				System.exit(0);
			}
		}
	}
	
	public int mainMenu() {
		int choose = -1;
		do {
			try {
				System.out.println("1. Add Zoo Animal\r\n"
						+ "2. View Zoo Animal\r\n"
						+ "3. Take For A Walk\r\n"
						+ "4. Release Zoo Animal\r\n"
						+ "5. Close Program");
				System.out.print("Choice >> ");
				choose = scan.nextInt();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (choose < 0 || choose > 5);
		return choose;
	}
}
