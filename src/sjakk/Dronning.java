package sjakk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

class Dronning extends Brikke{

	public Dronning(Color farge, Brett brett) {
		super(farge, brett);
		
		
		if(farge.equals(Color.BLACK)) {
			brikkeIkon = new JLabel("\u265B");
			brikkeIkon.setFont(new Font("", 0, 60));
			add(brikkeIkon);
		}
		else {
			brikkeIkon = new JLabel("\u2655");
			brikkeIkon.setFont(new Font("", 0, 60));
			add(brikkeIkon);
		}
	}
}