import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Qgenerator {
	private static Scanner scann = new Scanner(System.in);
	private static Random rand = new Random();
	private static String bonRep() {
		int n = rand.nextInt(3);
		switch(n) {
		case 0:
			return "A";
		case 1:
			return "B";
		case 2:
			return "C";
		}
		return null;
	}
	private static String geberate(int n) {
		String s ="";
		for(int i = 1; i<n;i++) {
			s += "Question " + i + "\n";
			s += bonRep() +"\n";
			s += "A\n";
			s += "B\n";
			s += "C\n";
		}
		return s;
	}
	public static int nombreChoisi() {
		System.out.println("Combien des questions générez-vous? (minimum 100 question pour chaque joueur)");
		String reponse = scann.nextLine();
		try {
			if (Integer.parseInt(reponse) > 0) {
				return Integer.parseInt(reponse);
			}
			System.out.println("Minimum nombre est 1");
		} catch (NumberFormatException e) {
			System.out.println("Ce n'est pas un nombre");
		}
		return nombreChoisi();
	}
	public static void myWriter(String t){   
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("question.txt"));
            out.write(t);
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception ");       
        }

        return ;
    }

	public static void main(String[] args) {
		String lisQ = geberate(nombreChoisi());
		myWriter(lisQ);
		
	}

}
