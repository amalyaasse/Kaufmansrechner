
package FinanzKlassen;
import java.util.Scanner;

public class Finanzierung {

	public static void main(String[] args) {
		
	}
	
	Scanner einleser = new Scanner(System.in);
	
	public double berechneMonatsrate (double kredit, double kreditzinsatz){
		
		
		System.out.println("Anzahl der Monate angeben: ");
		int m = einleser.nextInt(); // Anzahl der Monate
		double  monatlicheZinsbelastung = (kredit*kreditzinsatz*m/1200);
		return monatlicheZinsbelastung;
	}
	
	
	public double berechneRueckzahlungsdauer(double kredit, double monatlicheTilgung) {
		
	
		
		
		return kredit/(monatlicheTilgung*12); }

}
