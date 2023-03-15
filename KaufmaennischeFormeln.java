package Aufgabe3_;
import java.util.Scanner;

public class KaufmaennischeFormeln {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		berechneBruttopreis();
	
		
		

	}
	
	static void berechneBruttopreis(){
		System.out.println("Geben Sie Nettopreis an:");
		Scanner Einleser = new Scanner(System.in);
		int Nettopreis = Einleser.nextInt();
		double Bruttopreis = Nettopreis*0.19 +Nettopreis;
		System.out.println("Bruttopreis: "+Bruttopreis);
	}

}
