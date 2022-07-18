
import java.util.Scanner;

public class Jeu {
	private static Scanner scan = new Scanner(System.in);
	private int nombreDeJoueur;
	protected Plateau p = new Plateau();
	private De de = new De();
	private Joueur[] listDeJoueur;
	private boolean fin = false;

	public Jeu() {
		// System.err.println("v3");
		initial();
		// System.out.println(Arrays.toString(listDeJoueur));
	}

	public void initial() {
		this.nombreDeJoueur = nombreChoisi();
		listDeJoueur = new Joueur[nombreDeJoueur];
		for (int i = 0; i < listDeJoueur.length; i++) {
			// System.out.println(listDeJoueur.length + " " + i);
			listDeJoueur[i] = new Joueur(nomChoisi(i + 1), p.getCase(0));
		}
	}

	public boolean isFin() {
		return fin;
	}

	public boolean plusDeJoueurs() {
		for (Joueur j : listDeJoueur) {
			if (j.isPeutJouer()) {
				return false;
			}
		}
		System.out.println("Jeu terminé, personne ne peut jouer");
		return true;
	}

	public void setFin(boolean f) {
		this.fin = f;
	}

	public Joueur[] getListDeJoueur() {
		return listDeJoueur;
	}

	public Plateau getP() {
		return p;
	}

	public De getDe() {
		return de;
	}

	public static int nombreChoisi() {
		System.out.println("Combien de joueurs voulez-vous ?");
		String reponse = scan.nextLine();
		try {
			if (Integer.parseInt(reponse) > 1) {
				return Integer.parseInt(reponse);
			}
			System.out.println("Minimum nombre de joueur est 2 ");
		} catch (NumberFormatException e) {
			System.out.println("Ce n'est pas un nombre");
		}
		return nombreChoisi();
	}

	public static String nomChoisi(int n) {
		System.out.println("Entrez le nom du joueur numéro " + n + " maximum 10 lettres");
		String reponse = scan.nextLine();
		if (reponse.isEmpty() || reponse.matches("\\S")) {
			System.out.println("Le nom doit contenir au moins deux lettre");
			return nomChoisi(n);
		}
		if (reponse.length() > 10) {
			return reponse.substring(0, 9);
		}
		return reponse;
	}
}
