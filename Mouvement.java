
public class Mouvement {
	Plateau p;
	Joueur j;
	De d;

	Mouvement(Plateau p, Joueur j, De d) {
		this.p = p;
		this.j = j;
		this.d = d;
		// d.lancezLeDe();
		j.setNombreDeTours(j.getNombreDeTours() + 1);
		// avancer();
	}

	public boolean avancer() {
		int n = j.getCaseActuel().getNombre() + d.getSommeDes();
		if (n >= 63) {
			return true;
		} else {
			regle(n);
			return false;
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
		j.setCaseActuel(p.getCase(12));
	}

	private void case_9() {
		if (j.getNombreDeTours() == 1) {
			if (d.getSommeDes() == 9) {
				if (d.getDes()[0] == 3 || d.getDes()[0] == 6) {

					j.setCaseActuel(p.getCase(26));
				} else {
					j.setCaseActuel(p.getCase(53));
				}
			}
		}
	}

	protected void hotel() {
		j.setNombreDeTours(j.getNombreDeTours() + 2);
	}

	protected void puits() {
		j.getCaseActuel().liberer();
		j.setPeutJouer(false);
		
	}

	private void labyrinthe() {
		j.setCaseActuel(p.getCase(30));
	}

	protected void prison() {
		j.getCaseActuel().liberer();
	}

	private void mort() {
		j.setCaseActuel(p.getCase(0));
	}
	
}
// mort