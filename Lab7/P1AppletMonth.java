
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	12/11/18 
 * Function:
 * 		Applet is displaying appropriate label and text field to allow entry of a month number using ActionListener
 * 		Action performed display either valid or not valid to the status line.  
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class P1AppletMonth extends Applet implements ActionListener{
	Label lblPrompt;
	TextField txtInput;
	Button but;

	int monthNum;

	public void init(){
		lblPrompt = new Label("Enter Month number");
		add(lblPrompt);


		txtInput = new TextField(6);
		add(txtInput);

		but = new Button("Clicks!!");
		add(but);
		but.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){

		monthNum = Integer.parseInt(txtInput.getText());

		if(monthNum <=12 && monthNum > 0 ){
			showStatus("Valid");
		} else {
			showStatus("Not Valid");
		}


	}

}