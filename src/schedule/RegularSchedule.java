package schedule;

import java.util.Scanner;

public class RegularSchedule extends Schedule implements Scheduleinput {
	
	public RegularSchedule(ScheduleKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Appointed date");
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Meeting place");
		String place = input.next();
		this.setPlace(place);
		
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
