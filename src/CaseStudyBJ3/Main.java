package CaseStudyBJ3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {new Main();}
	Scanner in = new Scanner(System.in);
	ArrayList<Participant> participants = new ArrayList<>();
	private Main () {
		participants.add(new Participant(1, "Artoria"));
		participants.add(new Participant(2, "Claudio"));
		participants.add(new Participant(3, "Django"));
		while(true) {
			int input = mainMenu();
			if (input == 1) {
				startSharing();
			} else if (input == 2) {
				updateParticipant();
			} else if (input == 3){

			} else {
				System.exit(0);
			}
		}
	}

	private int mainMenu() {
		int input = 0;
		while (input < 1 || input > 4) {
			System.out.println("1. Start sharing");
			System.out.println("2. Update participant");
			System.out.println("3. Delete participant");
			System.out.println("4. Close app");
			System.out.print("Choice >> ");
			input = in.nextInt();in.nextLine();
		}
		return input;
	}
	
	private void startSharing() {
		int input = -1;
		
		while (input<0 || input>100) {
			try {
				System.out.print("Input a number [0 - 100] : ");
				input = in.nextInt();
				in.nextLine();
			} catch (Exception e) {
				System.out.println("Input must be numberic");
				in.nextLine();
				continue;	
			}	
		}
		
		String username;
		while (true) {
			System.out.print("Input username [5 - 20] : ");
			username = in.nextLine();
			if(username.length() <= 20 && username.length() >= 5) {
				if (participants.isEmpty()) {
					break;
				} else {
					Boolean found = false;
					for (Participant p : participants) {
						if (p.getUsername().equals(username)) {
							found = true;
							System.out.println("Username taken");
						}
					}
					if (found == false) {
						break;
					}
				}
			}	
		}
		participants.add(new Participant(input, username));
		System.out.println("You are the " + participants.size() + " that are join");
		System.out.println("Your share number " + input);
	}
	
	private void updateParticipant() {
		int i = 1;
		for (Participant p : participants) {
			System.out.println(i + " | " + p.getUsername() + " | " + p.getShareNumber());
			i++;
		}
		System.out.println("");
	}
}