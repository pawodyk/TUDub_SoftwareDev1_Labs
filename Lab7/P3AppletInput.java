
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	12/11/18 
 * Function:
 * 		Applet is prompting for car make, car model, year, engine capacity, and approximate value
 * 		On entry of the last input field it display the car year in the status line.  
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class P3AppletInput extends Applet implements ActionListener{
	Label lblMake, lblModel, lblYear, lblEngine, lblValue;
	TextField txtMake, txtModel, txtYear, txtEngine, txtValue;

	int number;

	public void init(){
		lblMake = new Label("Enter car make");
		add(lblMake);

		txtMake = new TextField(10);
		add(txtMake);

		lblModel = new Label("Enter car model");
		add(lblModel);

		txtModel = new TextField(10);
		add(txtModel);

		lblYear = new Label("Enter Year");
		add(lblYear);

		txtYear = new TextField(10);
		add(txtYear);

		lblEngine = new Label("Enter engine capacity");
		add(lblEngine);

		txtEngine = new TextField(10);
		add(txtEngine);

		lblValue = new Label("Enter car value");
		add(lblValue);

		txtValue = new TextField(10);
		add(txtValue);

		txtValue.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){

		showStatus(txtYear.getText());

	}

}