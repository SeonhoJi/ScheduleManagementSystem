package schedule;

import java.util.Scanner;

public abstract class Schedule {
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
	
	
}
