package sjakk;

import javax.swing.JFrame;

public class EntryPoint extends JFrame {

	public static void main(String[] args) {
		new EntryPoint();
		 System.out.println(Character.codePointAt("\u2654", 0));
	}

	public EntryPoint() {
		setTitle("Sjakkbrett");
		add(new Brett());
		setSize(600, 600);
		setVisible(true);
	}
}
