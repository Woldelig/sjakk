package sjakk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

class Bonde extends Brikke{

	public Bonde(Color farge,  Brett brett ) {
		super(farge, brett);
		
		
		if(farge.equals(Color.BLACK)) {
			brikkeIkon = new JLabel("\u265F");
			brikkeIkon.setFont(new Font("", 0, 60));
			add(brikkeIkon);
		}
		else {
			brikkeIkon = new JLabel("\u2659");
			brikkeIkon.setFont(new Font("", 0, 60));
			add(brikkeIkon);
		}
	}
}