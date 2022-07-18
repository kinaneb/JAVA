
public class LancerLaJeuV3 extends LancerLaJeuV2 {
	protected MouvementV3 m3;
	public void jouer() {
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
					m3 = new MouvementV3(j.getP(), actuel, j.getDe());
					j.setFin(m3.avancer());
					if (j.isFin()) {
						System.out.println("vous avez gagné   *** " + actuel.getNum() + " ***");
						return;
					}
					j.getP().affich();
				}
			}
			j.getDe().setTour();
		}
	}

}
