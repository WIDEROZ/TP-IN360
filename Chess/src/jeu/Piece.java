package jeu;

public abstract class Piece {

	protected boolean couleur;
	protected boolean dejaJoue;
	
	/**
	 * Couleur : 0 pour les blancs, 1 pour les noirs
	 */
	public Piece(boolean couleur) {
		this.couleur = couleur;
	}
	
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
	
	/**
	 * Retourne un boolean : true si le deplacement est valide.
	 * Paramètres :
	 * indexDepart (entier representant la position de depart du pion); 
	 * indexArrive (entier representant la position d'arrive du pion). 
	 * NB : Un index de position est de la forme intColonneintLigne. ex : a1 -> 11, b1 -> 21
	 * 
	 */
	public abstract boolean deplacementEstOk(int indexDepart, int indexArrive);
	
	/**
	 * Affiche la piece
	 */
	public abstract void afficherPiece();

	public static void main(String[] args) {

	}

}
