package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		Random random = new Random();

		int evenCount = 0;
		int oddCount = 0;
		
		Integer[] evenArr = new Integer[10];
		Integer[] oddArr = new Integer[10];
		
		
		for (int i = 0; i < 10; i++) {
			
			int num = random.nextInt(100);
			
			System.out.println(num);
			
			if (num % 2 == 0) {
				evenArr[evenCount++] = num;
			} else {
				oddArr[oddCount++] = num;
			}
			
		}
		
//		System.out.println(Arrays.asList(evenArr));
//		System.out.println(Arrays.asList(oddArr));
		
		// Clean Arrays
		
		Integer[] evenArrClean = new Integer[evenCount];
		Integer[] oddArrClean = new Integer[oddCount];
		
		for (int i = 0; i < evenCount; i++) {
			int evenNum = evenArr[i];
			evenArrClean[i] = evenNum;
		}
		
		for (int i = 0; i < oddCount; i++) {
			int oddNum = oddArr[i];
			oddArrClean[i] = oddNum;
		}
		
		System.out.println(Arrays.asList(evenArrClean));
		System.out.println(Arrays.asList(oddArrClean));
		
	}
}
