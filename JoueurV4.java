
public class JoueurV4 extends Joueur {
	int score = 0;
	public JoueurV4(String n, Case c) {
		super(n, c);
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score += score;
	}
	
}
