package sjakk;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Brett extends JPanel {

	protected Felt[][] Sjakkbrett = new Felt[8][8];

	public Brett() {

		setLayout(new GridLayout(8, 0));
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				Sjakkbrett[i][j] = new Felt(i, j, this);
				add(Sjakkbrett[i][j]);
			}
		}
	}
}