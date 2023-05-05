package org.lessons.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] FirstNames = {
			"Leonardo",
			"Alessandro",
			"Tommaso",
			"Francesco",
			"Lorenzo",
			"Sofia",
			"Aurora",
			"Giulia",
			"Ginevra",
			"Beatrice",
		};
		
		String[] LastNames = {
				"Rossi",
				"Russo",
				"Ferrari",
				"Esposito",
				"Bianchi",
				"Romano",
				"Colombo",
				"Bruno",
				"Ricci",
				"Marino",
		};
		
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int rdm1 = random.nextInt(10);
			int rdm2 = random.nextInt(10);
			System.out.println(FirstNames[rdm1] + " " + LastNames[rdm2]);
		}
	}
}
