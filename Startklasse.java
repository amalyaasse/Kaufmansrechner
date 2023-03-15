package Aufgabe3_;

import java.util.Scanner;

public class Startklasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gewinnermittlung gewinnermittlung = new Gewinnermittlung();
		System.out.println("Geben Sie produktionspreis an: ");
		Scanner einleser = new Scanner(System.in);
		double produktionsPreis = einleser.nextDouble();  
		
		gewinnermittlung.berechneNettopreis(produktionsPreis);
		gewinnermittlung.berechneGewinnzuschlag(produktionsPreis);
				}

	

}
