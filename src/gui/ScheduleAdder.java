package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ScheduleAdder extends JFrame {

	public ScheduleAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelDate = new JLabel("Date : ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel labelPlace = new JLabel("Place : ", JLabel.TRAILING);
		JTextField fieldPlace = new JTextField(10);
		labelPlace.setLabelFor(fieldPlace);
		panel.add(labelPlace);
		panel.add(fieldPlace);
		
		JLabel labelBusiness = new JLabel("Business : ", JLabel.TRAILING);
		JTextField fieldBusiness = new JTextField(10);
		labelBusiness.setLabelFor(fieldBusiness);
		panel.add(labelBusiness);
		panel.add(fieldBusiness);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
