package ScheduleManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import schedule.HangoutSchedule;
import schedule.ImportantSchedule;
import schedule.Schedule;
import schedule.ScheduleKind;

public class ScheduleManager{
	
	ArrayList<Schedule> schedules = new ArrayList<Schedule>();
	Scanner input;
	ScheduleManager(Scanner input){
		this.input = input;
	}
	
	public void addSchedule() {
		int kind = 0;
		Schedule schedule;
		while (kind!=1 && kind!=2) {
			System.out.println("1 for regular Schedule");
			System.out.println("2 for Important Schedule");
			System.out.println("3 for hangout Schedule");
			System.out.print("Select num for Schedule Kind between 1, 2 or 3 : ");
			kind = input.nextInt();
			if (kind == 1) {
				schedule = new Schedule(ScheduleKind.regular);
				schedule.getUserInput(input);
				schedules.add(schedule);
				break;
			}
			else if (kind == 2) {
				schedule = new ImportantSchedule(ScheduleKind.important);
				schedule.getUserInput(input);
				schedules.add(schedule);
				break;
			}
			else if (kind == 3) {
				schedule = new HangoutSchedule(ScheduleKind.hangout); 
				schedule.getUserInput(input);
				schedules.add(schedule);
				break;
			}
			else {
				System.out.print("Select num for Schedule Kind between 1, 2 or 3: ");
			}
		}
		
		
	}
	public void deleteSchedule() {
		System.out.print("Appointed date");
		int date = input.nextInt();
		int index = -1;
		for(int i = 0; i<schedules.size();i++) {
			if (schedules.get(i).getDate() == date) {
				index = i;
				break;
			}
		}
		
		if(index > 0) {
			schedules.remove(index);
			System.out.println("the schedule" + date + "is deleted");
		}
		else {
			System.out.println("the schedule has not been registered");
			return;
		}
	}
	public void editSchedule() {
		System.out.print("Appointed date");
		int date = input.nextInt();
		for(int i = 0; i<schedules.size();i++) {
			Schedule schedule = schedules.get(i);
			if (schedules.get(i).getDate() == date) {
				int num = -1;
				while(num!=4) {
					System.out.println("*** Schedule Info Edit Menu***");
					System.out.println("1. Edit date");
					System.out.println("2. Edit Place");
					System.out.println("3. Edit Business");
					System.out.println("4. Exit");
					System.out.println("Select one number between 1-4 : ");
					num = input.nextInt();
					
					if(num==1) {
						System.out.print("Appointed date");
						date = input.nextInt();
						schedule.setDate(date);
					}
					
					else if(num==2) {
						System.out.print("Meeting place");
						String place = input.next();
						schedule.setPlace(place);
					}
					
					else if(num==3) {
						System.out.print("The business");
						String business = input.next();
						schedule.setBusiness(business);
					}
					else {
						continue;
					}// if
				} //while
				break;
			} //if
		}//for
	}
	public void veiwSchedules() {
//		System.out.print("Appointed date");
//		int date = input.nextInt();
		System.out.println("# of registered students : " + schedules.size());
		for(int i = 0; i<schedules.size();i++) {
			schedules.get(i).printInfo();
		}
	}
}
