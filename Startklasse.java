package FinanzKlassen;

public class Startklasse {
	
	
	
	 
	

	public static void main(String[] args) {
		
		
		Finanzierung testobj = new Finanzierung();
		
		//Scanner einleser = new Scanner(System.in);
		// double kredit = einleser.nextDouble(); // kredit
		 //double kreditzinsatz = einleser.nextDouble(); //zinssatz
		System.out.println("monatliche Zinsbelastung: " + testobj.berechneMonatsrate(5000, 10));
		System.out.println("Rueckzahlungsdauer in Jahren: " +testobj.berechneRueckzahlungsdauer(5000, 300));
		
	}

}
