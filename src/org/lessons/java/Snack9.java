package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Base
		System.out.println("inserisci una base:");
		float base = in.nextInt();
		
		// Altezza
		System.out.println("Inserisci un'altezza:");
		float height = in.nextInt();
		
		in.close();
		
		// Area
		float area = base * height;
		
		System.out.println("L'area misura " + area);
	}
}