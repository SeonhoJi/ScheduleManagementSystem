package ScheduleManagementSystem;

import java.util.Scanner;

public class ScheduleManager{
	
	Schedule schedule;
	Scanner input;
	ScheduleManager(Scanner input){
		this.input = input;
	}
	
	public void addSchedule() {
		schedule = new Schedule();
		System.out.print("Appointed date");
		schedule.date = input.nextInt();
		System.out.print("Meeting place");
		schedule.place = input.next();
		System.out.print("The business");
		schedule.business = input.next();
	}
	public void deleteSchedule() {
		System.out.print("Appointed date");
		int date = input.nextInt();
		if (schedule == null) {
			System.out.println("the schedule has not been registered");
			return;
		}
		if (schedule.date == date) {
			schedule = null;
			System.out.println("the schedule is deleted");
		}
		
	}
	public void editSchedule() {
		System.out.print("Appointed date");
		int date = input.nextInt();
		if (schedule.date == date) {
			System.out.println("the schedule to be edited is "+ date);
		}
	}
	public void veiwSchedule() {
		System.out.print("Appointed date");
		int date = input.nextInt();
		if (schedule.date == date) {
			schedule.printInfo();
		}
	}
}
