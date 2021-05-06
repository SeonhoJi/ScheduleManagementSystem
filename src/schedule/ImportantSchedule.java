package schedule;

import java.util.Scanner;

public class ImportantSchedule extends Schedule implements Scheduleinput {
	
	public ImportantSchedule(ScheduleKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Appointed date");
		int date = input.nextInt();
		this.setDate(date);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know where to meet? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer =='y') {
				System.out.print("Meeting place");
				String place = input.next();
				this.setPlace(place);
				break;
			}
			else if (answer == 'Y' || answer =='y') {
				this.setPlace("");
				break;
			}
			else {
				
			}
		}

		System.out.print("The business");
		String business = input.next();
		this.setBusiness(business);
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case regular:
			skind = "regular";
			break;
		case important:
			skind = "important";
			break;
		case hangout:
			skind = "hangout";
			break;
		}
		System.out.println("kind : " + skind + "place : "+ place + " date : " + date + " business : " + business );
	}
}
