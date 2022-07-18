
public class Joueur {
	private String mon;
	private int nombreDeTours = 0;
	private Case caseActuel;
	private boolean peutJouer = true;

	public Joueur(String n, Case c) {
		this.mon = n;
		caseActuel = c;
		caseActuel.ajouterJoueur(this);
	}

	public String getNum() {
		return mon;
	}

	public void setNum(String nom) {
		this.mon = nom;
	}

	public int getNombreDeTours() {
		return nombreDeTours;
	}

	public void setNombreDeTours(int nombreDeTours) {
		this.nombreDeTours = nombreDeTours;
	}

	public Case getCaseActuel() {
		return caseActuel;
	}

	public void setCaseActuel(Case c) {
		caseActuel.retirerJoueur(this);
		//caseActuel.setNumbreDeJoueur(caseActuel.getNumbreDeJoueur()-1);
		caseActuel = c;
		//caseActuel.setNumbreDeJoueur(caseActuel.getNumbreDeJoueur()+1);
		caseActuel.ajouterJoueur(this);
	}

	public boolean isPeutJouer() {
		return peutJouer;
	}

	public void setPeutJouer(boolean b) {
		this.peutJouer = b;
	}

	@Override
	public String toString() {
		return " " + mon ;
	}

}
