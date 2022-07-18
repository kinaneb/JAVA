import java.util.Scanner;

public class LancerLaJeuV {
	protected Scanner sc = new Scanner(System.in);
	private Mouvement m;
	
	 protected void jouer() {
		 //System.err.println("vv11");
		Jeu j = new Jeu();
		j.getP().affich();
		while (!j.isFin() && !j.plusDeJoueurs()) {
			for (Joueur actuel : j.getListDeJoueur()) {
				// System.out.println(actuel.toString());
				if (actuel.isPeutJouer() && actuel.getNombreDeTours() == j.getDe().getTour()) {
					System.out.println("appuyez sur entrée pour lancer les dés " + actuel.toString());
					sc.nextLine();
					j.getDe().lancezLeDe();
					System.out.println(j.getDe() + "\n");
					m = new Mouvement(j.getP(), actuel, j.getDe());
					j.setFin(m.avancer());
					if (j.isFin()) {
						System.out.println("vous avez gagné  *** " + actuel.getNum() + " ***");
						return;
					}
					j.getP().affich();
				}
			}
			j.getDe().setTour();
		}
		
		
	}
}
