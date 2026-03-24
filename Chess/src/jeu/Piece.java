package jeu;

public abstract class Piece {

	private boolean couleur;
	private boolean dejaJoue;
	
	public boolean getCouleur() {
		return couleur;
	}

	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}

	public boolean getDejaJoue() {
		return dejaJoue;
	}

	public void setDejaJouer(boolean dejaJoue) {
		this.dejaJoue = dejaJoue;
	}
	
	public abstract void deplacement();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
