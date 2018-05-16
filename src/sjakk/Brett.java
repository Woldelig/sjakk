package sjakk;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Brett extends JPanel {

	protected Felt[][] Sjakkbrett = new Felt[8][8];
	protected Felt Markertfelt = null;

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
	
	protected void klikketBrikke(Felt felt) {
		Markertfelt = felt;
	}
	
	protected void klikketFelt(Felt felt) {
		if(Markertfelt == null) {
			return;
		}
		felt.setBrikke(Markertfelt.getBrikke());
		Markertfelt.fjernBrikke();
		
		Markertfelt = null;	
		repaint();
	}

	private void leggBrikker(Felt[][] sjakkbrett) {

		boolean erHvit = false;
		
		for (int rekke = 0, bondeRekke = 1; rekke < 8; rekke += 7, bondeRekke += 5) {
			for (int i = 0; i <= 7; i++) {
				Sjakkbrett[bondeRekke][i].setBrikke(new Bonde((erHvit) ? Color.WHITE : Color.BLACK, this));
			}

			Sjakkbrett[rekke][0].setBrikke(new Taarn((erHvit) ? Color.WHITE : Color.BLACK, this));
			Sjakkbrett[rekke][1].setBrikke(new Hest((erHvit) ? Color.WHITE : Color.BLACK, this));
			Sjakkbrett[rekke][2].setBrikke(new Loper((erHvit) ? Color.WHITE : Color.BLACK, this));
			Sjakkbrett[rekke][3].setBrikke(new Dronning((erHvit) ? Color.WHITE : Color.BLACK, this));
			Sjakkbrett[rekke][4].setBrikke(new Konge((erHvit) ? Color.WHITE : Color.BLACK, this));
			Sjakkbrett[rekke][5].setBrikke(new Loper((erHvit) ? Color.WHITE : Color.BLACK, this));
			Sjakkbrett[rekke][6].setBrikke(new Hest((erHvit) ? Color.WHITE : Color.BLACK, this));
			Sjakkbrett[rekke][7].setBrikke(new Taarn((erHvit) ? Color.WHITE : Color.BLACK, this));

			erHvit = true;
		}
	}
}