package schedule;

import java.util.Scanner;

import exception.PlaceFormatException;

public interface Scheduleinput {
	
	
	public int getDate();
	
	public void setDate(int date);
	
	public void setBusiness(String business);
	
	public void setPlace(String place) throws PlaceFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setDate(Scanner input);
	
	public void setPlace(Scanner input);
	
	public void setBusiness(Scanner input);
}
