package schedule;

import java.util.Scanner;

import exception.PlaceFormatException;

public abstract class NoRegularSchedule extends Schedule {

	public NoRegularSchedule(ScheduleKind kind) {
		super(kind);
	}
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + "place : "+ place + " date : " + date + " business : " + business+ " wheretoplay : "+ place + " whattoplay : " + business  );
	}
	public void setPlacewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know where to play? (Y/N)");
			answer = input.next().charAt(0);
			try {	
				if (answer == 'Y' || answer =='y') {
					setPlace(input);
					break;
				}
				else if (answer == 'N' || answer =='n') {
					this.setPlace(" ");
					break;
				}
				else {
					
				}
			}
			catch(PlaceFormatException e) {
				System.out.println("Incorrect Place Format. Put the place contains @");
			}
		}
	}
	public void setBusinesswithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know what to play? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer =='y') {
				setBusiness(input);
				break;
			}
			else if (answer == 'N' || answer =='n') {
				this.setBusiness("");
				break;
			}
			else {
				
			}
		}
	}

}
