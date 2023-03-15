package Aufgabe3_;

import java.util.Scanner;

//erweitern Kaufmannsrechner um eine Klasse mit der Bezeichnung "Gewinnermittlung"
public class Gewinnermittlung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/*eine Methode zur Ermittlung des Gewinnzuschlags
	// Der Gewinnzuschlag beträgt immer 35%
	//Der Methode muss als Wert den Produktionspreis eines Artikels empfangen*/
	
	public void berechneNettopreis(double produktionsPreis){
		
		//Scanner einleser = new Scanner(System.in);
		//double produktionsPreis = einleser.nextDouble();
		double gewinnzuschlag = produktionsPreis*0.35;
		double nettoPreis = produktionsPreis + gewinnzuschlag;
		System.out.println("Nettopreis: " + nettoPreis);
		
	}
	
	public void berechneGewinnzuschlag(double produktionsPreis){
		
		double gewinnzuschlag = produktionsPreis*0.35;
		System.out.println("Gewinnzuschlag beträgt: " + gewinnzuschlag);
		
	}
	}

