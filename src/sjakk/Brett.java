package sjakk;

import java.awt.Color;
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
		leggBrikker(Sjakkbrett);
	}

	private void leggBrikker(Felt[][] sjakkbrett) {

		boolean erHvit = false;
		
		for (int rekke = 0, bondeRekke = 1; rekke < 8; rekke += 7, bondeRekke += 5) {
			for (int i = 0; i <= 7; i++) {
				Sjakkbrett[bondeRekke][i].add(new Bonde((erHvit) ? Color.WHITE : Color.BLACK));
			}

			Sjakkbrett[rekke][0].add(new Taarn((erHvit) ? Color.WHITE : Color.BLACK));
			Sjakkbrett[rekke][1].add(new Hest((erHvit) ? Color.WHITE : Color.BLACK));
			Sjakkbrett[rekke][2].add(new Loper((erHvit) ? Color.WHITE : Color.BLACK));
			Sjakkbrett[rekke][3].add(new Dronning((erHvit) ? Color.WHITE : Color.BLACK));
			Sjakkbrett[rekke][4].add(new Konge((erHvit) ? Color.WHITE : Color.BLACK));
			Sjakkbrett[rekke][5].add(new Loper((erHvit) ? Color.WHITE : Color.BLACK));
			Sjakkbrett[rekke][6].add(new Hest((erHvit) ? Color.WHITE : Color.BLACK));
			Sjakkbrett[rekke][7].add(new Taarn((erHvit) ? Color.WHITE : Color.BLACK));

			erHvit = true;
		}
	}
}