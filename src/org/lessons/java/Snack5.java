package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero:");
		int num = in.nextInt();
		in.close();
		
		Random random = new Random();
		int sum = 0;
		int evnSum = 0;
		int oddSum = 0;
		int oddCount = 0;
		float avg = 0f;
		float oddAvg = 0f;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.println("");
		
		// Estrazione numeri;
		System.out.println("Ecco i tuoi numeri:");
		
		for (int i = 0; i < num; i++) {
			
			int rdm = random.nextInt(100);
			System.out.println(rdm);
			
			// Somma
			sum += rdm;
			
			// Somma valori pari
			
			if (rdm % 2 == 0) {
				evnSum += rdm;
				
			// Media valori dispari
			} else {
				oddCount++;
				oddSum += rdm;
				oddAvg = oddSum/oddCount;
			}
			
			// Media
			avg = sum/num;
			
			// Minimo e massimo
			if (rdm < min) {
				min = rdm;
			}
			
			if (rdm > max) {
				max = rdm;
			}
			
		}
		
		System.out.println("");
		
		// Stampa somma
		System.out.println("Ecco la loro somma:");
		System.out.println(sum);
		
		System.out.println("");
		
		// Stampa Somma valori pari
		System.out.println("Ecco la somma dei numeri pari:");
		System.out.println(evnSum);
		
		System.out.println("");
		
		// Stampa Media
		System.out.println("Ecco la loro media:");
		System.out.println(avg);
		
		System.out.println("");
		
		// Stampa Media valori dispari
		System.out.println("Ecco la media dei numeri dispari:");
		System.out.println(oddAvg);
		
		System.out.println("");
		
		// Stampa minimo
		System.out.println("Ecco il numero più basso");
		System.out.println(min);
		
		System.out.println("");
		
		// Stampa massimo
		System.out.println("Ecco il numeo più alto");
		System.out.println(max);
	}
}
