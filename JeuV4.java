
public class JeuV4 extends Jeu {
	//private int numbreDeJoueur;
	private JoueurV4[] listDeJoueur;
	private int numbreDeJoueur;
	
	public JeuV4(int n){
		this.numbreDeJoueur = nombreChoisi();
		initial();
	}
	//System.err.println("v3");
	public void initial() {
		listDeJoueur = new JoueurV4[numbreDeJoueur];
		for (int i = 0; i < listDeJoueur.length; i++) {
			//System.out.println(listDeJoueur.length + "  " + i);
			listDeJoueur[i] = new JoueurV4(nomChoisi(i + 1), p.getCase(0));
		}
	}
	public JoueurV4[] getListDeJoueur() {
		return listDeJoueur;
	}
	public boolean plusDeJoueurs() {
		for (JoueurV4 j : listDeJoueur) {
			if (j.isPeutJouer()) {
				return false;
			}
		}
		System.out.println("Jeu terminé, personne ne peut jouer");
		return true;
	}
}
