
public class LancerLaJeuV4 extends LancerLaJeuV3 {
	TelechargeDesQuestions t = new TelechargeDesQuestions();
	
	
	//t.read();
	public void jouer() {
		JeuV4 j = new JeuV4(4);
		j.getP().affich();
		int scor = 0;
		while (!j.isFin() && !j.plusDeJoueurs()) {
			for (JoueurV4 actuel : j.getListDeJoueur()) {
				// System.out.println(actuel.toString());
				if (actuel.isPeutJouer() && actuel.getNombreDeTours() == j.getDe().getTour()) {
					System.out.println("appuyez sur entrée pour lancer les dés " + actuel.toString() +" Votre score est: "+actuel.getScore());
					sc.nextLine();
					j.getDe().lancezLeDe();
					System.out.println(j.getDe() + "\n");
					m3 = new MouvementV3(j.getP(), actuel, j.getDe());
					j.setFin(m3.avancer());
					scor=t.poserQuestion();
					if (scor==-1) {return;}
					actuel.setScore(scor);
					if (j.isFin()) {
						System.out.println("vous avez gagné   *** " + actuel.getNum() + " ***"+" Votre score est: "+actuel.getScore());
						return;
					}
					j.getP().affich();
				}
			}
			j.getDe().setTour();
		}
	}

}
