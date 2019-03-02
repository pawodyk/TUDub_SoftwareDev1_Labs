/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	12/11/18 
 * Function:
 * 		Applet alows integers input 
 * 		Determines if the input was an even number and display result in the status line.  
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class P2AppletEven extends Applet implements ActionListener{
	Label lblPrompt;
	TextField txtInput;

	int number;

	public void init(){
		lblPrompt = new Label("Enter a number");
		add(lblPrompt);

		txtInput = new TextField(6);
		add(txtInput);

		txtInput.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){

		number = Integer.parseInt(e.getActionCommand());

		txtInput.setText("");

		if(number%2 == 0){
			showStatus("Even");
		} else {
			showStatus("Odd");
		}

	}

}