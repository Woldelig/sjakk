package sjakk;


import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;



public abstract class Brikke extends JPanel{

	Color farge;
	JLabel brikkeIkon;
	Brett brett;

	

	public Brikke(Color farge, Brett brett) {
		this.farge = farge;
		this.brett = brett;
		
		setOpaque(false);
	}

}