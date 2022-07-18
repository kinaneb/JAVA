
public class MouvementV2 extends Mouvement {

	public MouvementV2(Plateau p, Joueur j, De d) {
		super(p, j, d);
	}
	public boolean avancer() {
		int n = j.getCaseActuel().getNombre() + d.getSommeDes();
		if (n != 63) {
			if (n > 63) {
				n = n - 63;
				n = 63 - n;
			}
			regle(n);
			return false;
		} else {
			return true;
		}

	}

}
