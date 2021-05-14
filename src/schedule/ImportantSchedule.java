package schedule;

import java.util.Scanner;

public class ImportantSchedule extends NoRegularSchedule{
	
	public ImportantSchedule(ScheduleKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setDate(input);
		setPlacewithYN(input);
		setBusinesswithYN(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + "place : "+ place + " date : " + date + " business : " + business );
	}
}
