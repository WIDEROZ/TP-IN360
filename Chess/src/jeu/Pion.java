package jeu;

public class Pion extends Piece{
	
	/**
	 * Couleur : 0 pour les blancs, 1 pour les noirs
	 */
	public Pion(boolean couleur) {
		super(couleur);
		dejaJoue = false;
	}
	
	public boolean deplacementEstOk(int indexDepart, int indexArrive) {
		boolean deplacementOk = false;
		if (indexDepart != indexArrive && dejaJoue == false && (indexArrive == indexDepart + 2)) {
			dejaJoue = true;
			deplacementOk = true;
		}
		else if(indexDepart != indexArrive && dejaJoue == true && (indexArrive == indexDepart + 2)) {
			deplacementOk = true;
		}
		return deplacementOk;
	}
	
	public void afficherPiece() {
		System.out.print("p" + couleur);
	}
}
