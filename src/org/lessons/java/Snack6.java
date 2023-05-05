package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lim = 0;
		int sum = 0;
				
		while (lim <= 0) {
			System.out.println("Inserisci valore positivo:");
			lim = in.nextInt();
			
			if (lim > 0) {
				System.out.println("Grazie!");
				break;
			}
		}
		
		in.close();
		
		System.out.println("");
		
		Random random = new Random();
		
		System.out.println("Ecco i tuoi numeri:");
		
		while (sum < lim) {
			int num = random.nextInt(100);
			
			
			// Somma
			if((sum + num) <= lim) {
				System.out.println(num);
				sum += num;
			}
			
			if (sum == lim) {
				break;
			}
		}
		
		System.out.println("che sommati risultano: " + sum);
		
	}
}
