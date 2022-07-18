
public class Question {
	final private String intituleQ;
	final private int pointsQ;
	final private String[] reponses = new String[4];

	public Question(String i, int p, String[] r) {
		this.intituleQ = i;
		this.pointsQ = p;
		for(int j = 0; j < 4; j++) {
			this.reponses[j] = r[j];
		}
	}

	public String getIntituleQ() {
		return intituleQ;
	}

	public int getPointsQ() {
		return pointsQ;
	}
	public boolean estCorrecte(int n) {
		return (reponses[n].equals(reponses[0]));
			
	}

	@Override
	public String toString() {
		String s ="-"+intituleQ + "?		("+pointsQ+" pionts)\n";
		for(int i = 1; i < 4; i++) {
			s += i + ".) " + reponses[i] +".\n";
		}
		return s;
	}
	
	
}
