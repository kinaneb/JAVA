
public class MouvementV3 extends MouvementV2 {

	public MouvementV3(Plateau p, Joueur j, De d) {
		super(p, j, d);
	}

	public int verfierCase(int n) {
		if ((p.getCase(n).getNombreDeJoueur() != 0) && (n != 0)) {
			//System.err.println(n + "  " +p.getCase(n).getNumbreDeJoueur());
			if (n == 31 || n == 52) {
				return n;
			}
			return verfierCase(n - 1);
		}
		return n;
	}

	public boolean avancer() {
		int n = j.getCaseActuel().getNombre() + d.getSommeDes();
		if (n != 63) {
			if (n > 63) {
				n = n - 63;
				n = 63 - n;
			}
			n = verfierCase(n);
			regle(n);
			return false;
		} else {
			return true;
		}

	}
	
	protected void regle(int n) {
		j.setCaseActuel(p.getCase(n));
		switch (j.getCaseActuel().getType()) {
		case "   Pont   ":
			pont();
			break;
		case "  Case 9  ":
			case_9();
			break;
		case "  Hôtel   ":
			hotel();
			break;
		case "  Puits   ":
			puits();
			break;
		case "Labyrinthe":
			labyrinthe();
			break;
		case " Prison  ":
			prison();
			break;
		case "   Mort   ":
			mort();
			break;
		default:
		}
	}
	
	private void pont() {
		j.setCaseActuel(p.getCase(verfierCase(12)));
	}

	private void case_9() {
		if (j.getNombreDeTours() == 1) {
			if (d.getSommeDes() == 9) {
				if (d.getDes()[0] == 3 || d.getDes()[0] == 6) {

					j.setCaseActuel(p.getCase(verfierCase(26)));
				} else {
					j.setCaseActuel(p.getCase(verfierCase(53)));
				}
			}
		}
	}


	private void labyrinthe() {
		j.setCaseActuel(p.getCase(verfierCase(30)));
	}

	private void mort() {
		j.setCaseActuel(p.getCase(0));
	}

}
