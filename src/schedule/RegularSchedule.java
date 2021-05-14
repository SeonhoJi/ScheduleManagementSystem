package schedule;

import java.util.Scanner;

public class RegularSchedule extends Schedule{
	
	public RegularSchedule(ScheduleKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setDate(input);
		
		setPlace(input);
		
		setBusiness(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + "place : "+ place + " date : " + date + " business : " + business );
	}
}
