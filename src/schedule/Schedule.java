package schedule;

import java.util.Scanner;

public class Schedule {
	protected ScheduleKind kind = ScheduleKind.light;
	protected String place;
	protected int date;
	protected String business;
	
	public ScheduleKind getKind() {
		return kind;
	}

	public void setKind(ScheduleKind kind) {
		this.kind = kind;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}
	
	public Schedule() {
		
	}
	
	public Schedule(String place, int date, String business) {
		this.place = place;
		this.date = date;
		this.business = business;
	}
	
	public void printInfo() {
		System.out.println("place : "+ place + " date : " + date + " business : " + business );
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
}
