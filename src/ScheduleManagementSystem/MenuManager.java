package ScheduleManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while(num!=6) {
			System.out.println("1. Add Schedule");
			System.out.println("2. Delete Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedule");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6 : ");
			num = input.nextInt();
			
			
			if(num==1) {
				System.out.print("Appointed date");
				int date = input.nextInt();
				System.out.print("Meeting place");
				String place = input.next();
				System.out.print("The business");
				String business = input.next();
			}
			
			else if(num==2) {
				System.out.print("Appointed date");
				int date = input.nextInt();
			}
			
			else if(num==3) {
				System.out.print("Appointed date");
				int date = input.nextInt();
			}
			
			else if(num==4) {
				System.out.print("Appointed date");
				int date = input.nextInt();
			}
		}
	}

}
