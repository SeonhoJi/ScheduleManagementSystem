package schedule;

import java.util.Scanner;

public interface Scheduleinput {
	
	
	public int getDate();
	
	public void setDate(int date);
	
	public void setBusiness(String business);
	
	public void setPlace(String place);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
}
