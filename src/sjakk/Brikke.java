package sjakk;


import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;



public abstract class Brikke extends JPanel implements MouseListener {

	Color farge;
	JLabel brikkeIkon;

	

	public Brikke(Color farge) {
		this.farge = farge;
		
		setOpaque(false);
	}

}