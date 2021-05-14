package schedule;

import java.util.Scanner;

import exception.PlaceFormatException;

public class HangoutSchedule extends NoRegularSchedule {
	
	public HangoutSchedule(ScheduleKind kind) {
		super(kind);
	}
	
	protected String wheretoplay;
	protected String whattoplay;
	

	public void getUserInput(Scanner input) {
		setDate(input);
		setBusinesswithYN(input);
		setPlacewithYN(input);
		setwheretoplaywithYN(input);
		setwhattoplaywithYN(input);
	}
	public void setwheretoplaywithYN(Scanner input) {
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
	public void setwhattoplaywithYN(Scanner input) {
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
