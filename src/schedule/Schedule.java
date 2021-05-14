package schedule;

import java.util.Scanner;

import exception.PlaceFormatException;

public abstract class Schedule implements Scheduleinput{
	protected ScheduleKind kind = ScheduleKind.regular;
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

	public void setPlace(String place) throws PlaceFormatException {
		if (!place.contains("@") && !place.equals(" ") ) {
			throw new PlaceFormatException();
		}
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
	public Schedule(ScheduleKind kind) { // method overloading
		this.kind = kind;
	}
	public Schedule(ScheduleKind kind, String place, int date, String business) {// method overloading
		this.kind = kind;
		this.place = place;
		this.date = date;
		this.business = business;
	}
	
	public abstract void printInfo();
	
	public void setDate(Scanner input) {
		System.out.print("Appointed date");
		int date = input.nextInt();
		this.setDate(date);
	}
	
	public void setPlace(Scanner input) {
		String place = " ";
		while (!place.contains("@")) {
			System.out.print("Meeting place : ");
			place = input.next();
			try {
				this.setPlace(place);
			} catch (PlaceFormatException e) {
				System.out.println("Incorrect Place Format. Put the place contains @");
			}
		}
	}
	public void setBusiness(Scanner input) {
		System.out.print("the business : ");
		String business = input.next();
		this.setBusiness(business);
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case hangout:
			skind = "hangout";
			break;
		case important:
			skind = "important";
			break;
		case regular:
			skind = "regular";
			break;
		default:
		}
		return skind;	
	}
}
