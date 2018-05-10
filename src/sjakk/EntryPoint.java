package sjakk;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class EntryPoint extends JFrame {

	public static void main(String[] args) {
		new EntryPoint();
		/*System.out.println("\u2654");
		System.out.println("\u2655");
		System.out.println("\u2656");
		System.out.println("\u2657");
		System.out.println("\u2658");
		System.out.println("\u2659");
		
		
		System.out.println("\u265A");
		System.out.println("\u265B");
		System.out.println("\u265C");
		System.out.println("\u265D");
		System.out.println("\u265E");
		System.out.println("\u265F");*/
	}

	public EntryPoint() {
		setTitle("Sjakkbrett");
		add(new Brett());
		setSize(800, 800);
		setVisible(true);
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
}
