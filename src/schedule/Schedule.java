package ScheduleManagementSystem;

public class Schedule {
	String place;
	int date;
	String business;
	
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


}
