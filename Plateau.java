import java.util.ArrayList;

public class Plateau {
	private final ArrayList<Case> cases = new ArrayList<>();

	public Plateau() {
		initialisationDuPlateau();

	}

	private void initialisationDuPlateau() {
		for (int i = 0; i <= 63; i++) {

			switch (i) {
			case 6:
				cases.add(new Case("   Pont   ", i));
				break;

			case 9:
				cases.add(new Case("  Case 9  ", i));
				break;

			case 19:
				cases.add(new Case("  Hôtel   ", i));
				break;

			case 31:
				cases.add(new Case("  Puits   ", i));
				break;

			case 42:
				cases.add(new Case("Labyrinthe", i));
				break;

			case 52:
				cases.add(new Case(" Prison  ", i));
				break;

			case 58:
				cases.add(new Case("   Mort   ", i));
				break;

			default:
				cases.add(new Case(" Normale  ", i));
				break;
			}
		}
	}
	//for test purpose
	@Override
	public String toString() {
		return "Plateau [cases=" + cases + "]";
	}

	public Case getCase(int n) {
		return cases.get(n);
	}

	public String affichGD(int i, String s) {
		for (int j = i + 8; i < j; i++) {
			s += "| " + cases.get(i) + " ";
			/*
			 * if (t[i] < 10) { s += " "; }
			 */
		}
		s += "|\n";
		return s;
	}

	public String affichDG(int i, String s) {

		for (int j = i + 7; j >= i; j--) {
			s += "| " + cases.get(j) + " ";
			/*
			 * if (t[j] < 10) { s += " "; }
			 */
		}
		if (i == 0) {
			s += "| <—————\n";
		} else {
			s += "|\n";
		}
		return s;
	}

	public void affich() {
		String s = "";
		int l = 0;
		int i = 0;

		while (i < 63) {
			if (i % 8 == 0) {
				if (l % 2 == 0) {
					s = affichDG(i, s);
					i += 8;
					l++;
				}
				s = affichGD(i, s);
				i += 8;
				l++;
			}
		}
		System.out.println(s);
	}
}
