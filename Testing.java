import java.util.LinkedList;

public class Testing {
	/*public static String affichGD(int[] t, int i, String s) {
		for (int j = i + 8; i < j; i++) {
			s +="| "+ t[i] + " ";
			if (t[i] < 10) {
				s += " ";
			}
			
		}
		s += "|\n";
		return s;
	}

	public static String affichDG(int[] t, int i, String s) {
		for (int j = i + 7; j >= i; j--) {
			s += "| "+ t[j] + " ";
			if (t[j] < 10) {
				s += " ";
			}
			
		}
		s += "|\n";
		return s;
	}*/

	public static void main(String[] args) {
		LinkedList <String> s = new LinkedList<String>();
		System.out.println(s.size());
		s.add("dd");
		s.add("ff");
		System.out.println(s.size());
		//TelechargeDesQuestions t = new TelechargeDesQuestions();
		//t.read();
		//System.out.println(t.listeQ.toString());
		/*int[] t = new int[64];
		for (int i = 0; i < 64; i++) {
			t[i] = i;
		}

		System.out.println(Arrays.toString(t));
		String s = "";
		int l = 0;
		int i = 0;

		while (i < 63) {
			if (i % 8 == 0) {
				if (l % 2 == 0) {
					s = affichDG(t, i, s);
					i += 8;
					l++;
				}
				s = affichGD(t, i, s);
				i += 8;
				l++;
			}
		}
		System.out.println(s);*/
		// Jeu j = new Jeu();
		/*
		 * De d = new De(); Plateau p = new Plateau(); Joueur j1 = new Joueur("1",
		 * p.getCase(0)); //System.out.println("€€€   "+p.cases.size());
		 * //j1.setPeutJouer(false); Joueur j2 = new Joueur("2", p.getCase(0));
		 * j2.setPeutJouer(false); //System.out.println(p.toString());
		 * //j2.getCaseActuel().libérer(j2); j2.setCaseActuel(p.getCase(31));
		 * j1.setCaseActuel(p.getCase(24));
		 * 
		 * Mouvement m = new Mouvement(p, j1, d);
		 * 
		 * System.out.println(Arrays.toString(d.getDes())+"****\n"+p.toString());
		 */
	}

}
