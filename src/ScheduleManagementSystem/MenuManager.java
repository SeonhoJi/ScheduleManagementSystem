package ScheduleManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScheduleManager scheduleManager = new ScheduleManager(input);
		
		selectMenu(input, scheduleManager);
	}
	public static void selectMenu(Scanner input, ScheduleManager scheduleManager) {
		int num = 0;
		while(num!=5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					scheduleManager.addSchedule();
					break;
				case 2:
					scheduleManager.deleteSchedule();
					break;
				case 3:
					scheduleManager.editSchedule();
					break;
				case 4:
					scheduleManager.veiwSchedules();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 4 !");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Schedule Management System Menu***");
		System.out.println("1. Add Schedule");
		System.out.println("2. Delete Schedule");
		System.out.println("3. Edit Schedule");
		System.out.println("4. View Schedules");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5 : ");
	}
}
