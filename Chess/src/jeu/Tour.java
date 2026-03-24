package jeu;

public class Tour extends Piece {
	
	/**
	 * Couleur : 0 pour les blancs, 1 pour les noirs
	 */
	public Tour(boolean couleur) {
		super(couleur);
		dejaJoue = true;
	}

	public boolean deplacementEstOk(int indexDepart, int indexArrive) {
		boolean deplacementOk = false;
		if (indexDepart != indexArrive && (indexArrive%10 - indexDepart%10 == 0 || indexArrive/10 - indexDepart/10 == 0)) {
			deplacementOk = true;
		}
		return deplacementOk;
	}

	public void afficherPiece() {
		System.out.print("t" + couleur);
	}
}
