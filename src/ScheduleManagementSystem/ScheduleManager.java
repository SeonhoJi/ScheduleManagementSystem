package ScheduleManagementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import schedule.HangoutSchedule;
import schedule.ImportantSchedule;
import schedule.RegularSchedule;
import schedule.ScheduleKind;
import schedule.Scheduleinput;

public class ScheduleManager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8632506672144333923L;
	
	ArrayList<Scheduleinput> schedules = new ArrayList<Scheduleinput>();
	transient Scanner input;
	ScheduleManager(Scanner input){
		this.input = input;
	}
	
	public void addSchedule() {
		int kind = 0;
		Scheduleinput scheduleinput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for regular Schedule");
				System.out.println("2 for Important Schedule");
				System.out.println("3 for hangout Schedule");
				System.out.print("Select num for Schedule Kind between 1, 2 or 3 : ");
				kind = input.nextInt();
				if (kind == 1) {
					scheduleinput = new RegularSchedule(ScheduleKind.regular);
					scheduleinput.getUserInput(input);
					schedules.add(scheduleinput);
					break;
				}
				else if (kind == 2) {
					scheduleinput = new ImportantSchedule(ScheduleKind.important);
					scheduleinput.getUserInput(input);
					schedules.add(scheduleinput);
					break;
				}
				else if (kind == 3) {
					scheduleinput = new HangoutSchedule(ScheduleKind.hangout); 
					scheduleinput.getUserInput(input);
					schedules.add(scheduleinput);
					break;
				}
				else {
					System.out.print("Select num for Schedule Kind between 1, 2 or 3: ");
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 3 !");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void deleteSchedule() {
		System.out.print("Appointed date");
		int date = input.nextInt();
		int index = findindex(date);
		removefromSchedule(index, date);
		
	}
	
	public int findindex(int date) {
		int index = -1;
		for(int i = 0; i<schedules.size();i++) {
			if (schedules.get(i).getDate() == date) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromSchedule(int index, int date) {
		if(index > 0) {
			schedules.remove(index);
			System.out.println("the schedule" + date + "is deleted");
			return 1;
		}
		else {
			System.out.println("the schedule has not been registered");
			return -1;
		}
	}
	
	public void editSchedule() {
		System.out.print("Appointed date");
		int date = input.nextInt();
		for(int i = 0; i<schedules.size();i++) {
			Scheduleinput schedule = schedules.get(i);
			if (schedule.getDate() == date) {
				int num = -1;
				while(num!=4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						schedule.setDate(input);
						break;
					case 2:
						schedule.setPlace(input);
						break;
					case 3:
						schedule.setBusiness(input);
						break;
					default:
						continue;
					}
				} //while
				break;
			} //if
		}//for
	}
	public void veiwSchedules() {
		System.out.println("# of registered students : " + schedules.size());
		for(int i = 0; i<schedules.size();i++) {
			schedules.get(i).printInfo();
		}
	}
	
	
	
	public void showEditMenu() {
		System.out.println("*** Schedule Info Edit Menu***");
		System.out.println("1. Edit date");
		System.out.println("2. Edit Place");
		System.out.println("3. Edit Business");
		System.out.println("4. Exit");
		System.out.println("Select one number between 1-4 : ");
		
	}
}
