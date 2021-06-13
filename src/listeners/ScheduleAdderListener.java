package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import ScheduleManagementSystem.ScheduleManager;
import exception.PlaceFormatException;
import schedule.RegularSchedule;
import schedule.ScheduleKind;
import schedule.Scheduleinput;

public class ScheduleAdderListener implements ActionListener {
	JTextField fieldDate;
	JTextField fieldPlace;
	JTextField fieldBusiness;
	
	ScheduleManager scheduleManager;
	
	public ScheduleAdderListener(
			JTextField fieldDate,
			JTextField fieldPlace,
			JTextField fieldBusiness, ScheduleManager scheduleManager) {
		
		this.fieldDate = fieldDate;
		this.fieldPlace = fieldPlace;
		this.fieldBusiness = fieldBusiness;
		this.scheduleManager = scheduleManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Scheduleinput schedule = new RegularSchedule(ScheduleKind.regular);
		
		try {
			schedule.setDate(Integer.parseInt(fieldDate.getText()));
			schedule.setPlace(fieldPlace.getText());
			schedule.setBusiness(fieldBusiness.getText());
			scheduleManager.addSchedule(schedule);
			putObject(scheduleManager, "scheduleManager.ser");
			schedule.printInfo();
		} catch (PlaceFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static void putObject(ScheduleManager scheduleManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
		
			out.writeObject(scheduleManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
			
}




