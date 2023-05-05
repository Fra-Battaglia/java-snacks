package org.lessons.java;

public class Snack3 {
	public static void main(String[] args) {
		int[] Numbers = {
				0,
				1,
				2,
				3,
				4,
				5,
				6,
				7,
				8,
				9,
		};
		
		int sum = 0;
		
		for (int i = 0; i < Numbers.length; i++) {
			if (i % 2 != 0) {
				sum += i;
				
			}
		}
		
		System.out.println("La somma dei numeri nell'array in posizione dispari è uguale a " + sum);
	}
}
