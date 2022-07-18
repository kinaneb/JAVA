import java.util.Scanner;

public class Lancer {
	static Scanner sca1 = new Scanner(System.in);

	public static int nombreChoisi() {
		System.out.println("Quelle variants vous voulez jouer?");
		String reponse = sca1.nextLine();
		try {
			if (Integer.parseInt(reponse) > 0 && Integer.parseInt(reponse)<5) {
				return Integer.parseInt(reponse);
			}
			System.out.println("Vous devez choisir le numéro entre 1 et 4");
		} catch (NumberFormatException e) {
			System.out.println("Ce n'est pas un nombre");
		}
		return nombreChoisi();
	}
	public static int nombreReChoisi() {
		System.out.println("vous voulez rejouer ? 1 pour Oui, 2 pour Non");
		String reponse = sca1.nextLine();
		try {
			if (Integer.parseInt(reponse) > 0 && Integer.parseInt(reponse)<3) {
				return Integer.parseInt(reponse);
			}
			System.out.println("Vous devez choisir le numéro entre 1 et 2");
		} catch (NumberFormatException e) {
			System.out.println("Ce n'est pas un nombre");
		}
		return nombreReChoisi();
	}
	public static void rejouer() {
		if(nombreReChoisi() == 1) {
			main(null);
		}
		else {System.out.println("A bientôt !!!");}
	}
	 

	public static void main(String[] args) {
		//int n = nombreChoisi();
		switch (nombreChoisi()) {
		case 1:
			LancerLaJeuV l1 = new LancerLaJeuV();
			l1.jouer();
			break;
		case 2: 
			LancerLaJeuV2 l2 = new LancerLaJeuV2();
			l2.jouer();
			break;
		case 3:
			LancerLaJeuV3 l3 = new LancerLaJeuV3();
			l3.jouer();
			break;
		case 4:
			LancerLaJeuV4 l4 = new LancerLaJeuV4();
			l4.jouer();
			break;
		}
		rejouer();
	}

}
