import java.io.File;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class TelechargeDesQuestions {
	Scanner sc;
	Scanner sc1 = new Scanner(System.in);
	LinkedList<Question> listeQ;
	private static Random rand = new Random();

	public TelechargeDesQuestions() {
		File f = new File("question.txt");
		if (!f.exists()) {
			Qgenerator.main(null);
		}
		sc = null;
		try {
			sc = new Scanner(f);
		} catch (Exception e) {
			Qgenerator.main(null);
			System.out.println("Erreur lors d’ouverture fichier:");
			e.printStackTrace();
			System.exit(1);
		}
		listeQ = new LinkedList<Question>();
		read();
	}

	private void read() {
		int j = 1;
		// System.err.println("ss");
		String[] rep = new String[4];
		String intitule = "";
		while (sc.hasNextLine()) {
			intitule = sc.nextLine();
			rep[0] = sc.nextLine();
			rep[1] = sc.nextLine();
			rep[2] = sc.nextLine();
			rep[3] = sc.nextLine();
			listeQ.add(new Question(intitule, j, rep));
			j++;
		}
	}

	public int nombreChoisi() {
		System.out.println("Quelle est votre réponse choisissez le numéro entre 1 et 3");
		String reponse = sc1.nextLine();
		try {
			if (Integer.parseInt(reponse) > 0 && Integer.parseInt(reponse) < 4) {
				return Integer.parseInt(reponse);
			}
			System.out.println("Vous devez choisir le numéro entre 1 et 3");
		} catch (NumberFormatException e) {
			System.out.println("Ce n'est pas un nombre");
		}
		return nombreChoisi();
	}

	private Question getQues() {
		if (!listeQ.isEmpty()) {
			//System.err.println("l not emp");
			int n = rand.nextInt(listeQ.size());
			return listeQ.get(n);
		}
		System.out.println("Il n'y a plus de questions, désolé :(");
		return null;
	}

	public int poserQuestion() {
		Question q = null;
		q = getQues();
		//if (q==null) {System.err.println("null");}
		if (q!=null) {
			System.out.println(q);
			if (q.estCorrecte(nombreChoisi())) {
				listeQ.remove(q);
				System.out.println("Bonne réponse :), vous gagnez " + q.getPointsQ() + " points");
				return q.getPointsQ();
			}
			listeQ.remove(q);
			System.out.println("Mauvais numéro Désolé :(");
			return 0;
		}
		return -1;
	}

}
