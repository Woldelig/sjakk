package sjakk;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class Felt extends JPanel implements MouseListener {
	
	protected int xPosisjon;
	protected int yPosisjon;
	protected BufferedImage image = null;
	protected Brett brett;


	public Felt(int x, int y, Brett brett) {

		this.xPosisjon = x;
		this.yPosisjon = y;
		this.brett = brett;

		setBackground(kalkulerFarge(x, y));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		addMouseListener(this);
	}
	private Color kalkulerFarge(int xPosisjon, int yPosisjon) {
		boolean annenhverRute = (xPosisjon % 2 == 0);
		boolean annenhverRad = (yPosisjon % 2 == 0);
		return (annenhverRute != annenhverRad ? Color.BLACK : Color.WHITE);
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Du klikket på felt: " + xPosisjon + " " + yPosisjon);

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}