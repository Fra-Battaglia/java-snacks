package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		int num;
		
		System.out.println("Inserisci un numero:");
		num = in.nextInt();
		in.close();
		
		if (num % 2 == 0) {
			System.out.println(num);
		} else {
			System.out.println(num + 1);
		}
	}
}
