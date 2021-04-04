package ScheduleManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScheduleManager scheduleManager = new ScheduleManager(input);
		
		int num = 0;
		
		while(num!=5) {
			System.out.println("*** Schedule Management System Menu***");
			System.out.println("1. Add Schedule");
			System.out.println("2. Delete Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedule");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5 : ");
			num = input.nextInt();
			
			
			if(num==1) {
				scheduleManager.addSchedule();
			}
			
			else if(num==2) {
				scheduleManager.deleteSchedule();
			}
			
			else if(num==3) {
				scheduleManager.editSchedule();
			}
			
			else if(num==4) {
				scheduleManager.veiwSchedule();
			}
		}
		
	}
	
}
