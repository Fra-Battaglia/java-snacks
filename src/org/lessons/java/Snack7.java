package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		Random random = new Random();
		int num = 0;
		
		while (num >= 0) {
			num = random.nextInt(100);
			System.out.println(num);
			
			if (num % 3 == 0 && num % 5 == 0) {
				break;
			}
		}
	}
}
