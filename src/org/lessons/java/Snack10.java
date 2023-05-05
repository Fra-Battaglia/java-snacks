package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Raggio
		System.out.println("inserisci il valore del tuo raggio");
		float radius = in.nextFloat();
		float diameter = radius * 2;
		
		// Area
		double area = radius * radius * Math.PI;
		System.out.println("L'area misura " + area);
		
		// Perimetro
		double perimeter = diameter * Math.PI;
		System.out.println("Il perimetro misura " + perimeter);
	}
}
