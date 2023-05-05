package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Scrivi una parola:");
		String sentence = in.nextLine();
		in.close();
		
		int sentenceLng = sentence.length();
		
		for (int i = 0; i < sentenceLng/2; i++) {
			int revInd = sentenceLng - i - 1;
			
			if (sentence.charAt(i) != sentence.charAt(revInd)) {
				System.out.println("La parola " + sentence + " non è palindroma");
				return;
			}
		}
		
		System.out.println("La parola " + sentence + " è palindroma");
	}
}
