import java.util.LinkedList;

public class Case {
	private final String type;
	private final int nombre;
	private LinkedList<Joueur> joueurSurMoi = new LinkedList<Joueur>();

	public Case(String s, int n) {
		this.type = s;
		this.nombre = n;
	}

	@Override
	public String toString() {
		if (joueurSurMoi.isEmpty()) {
			return nombre + " " + type;
		} else {
			return nombre + joueurSurMoi.toString().replace("[", " <").replace("]", " >");
		}
	}

	public void ajouterJoueur(Joueur j) {
		joueurSurMoi.add(j);
	}

	public void retirerJoueur(Joueur j) {
		joueurSurMoi.remove(j);
	}

	public String getType() {
		return type;
	}

	public int getNombre() {
		return nombre;
	}

	public int getNombreDeJoueur() {
		return joueurSurMoi.size();
	}

	public LinkedList<Joueur> surMoi() {
		return joueurSurMoi;
	}

	public void liberer() {
		//System.err.println("b");
		for (Joueur x : joueurSurMoi) {
			x.setPeutJouer(true);
		}
		//System.err.println("a");
	}

}
