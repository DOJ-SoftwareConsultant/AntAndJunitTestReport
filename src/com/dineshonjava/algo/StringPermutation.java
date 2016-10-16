package com.dineshonjava.algo;

import java.util.Scanner;

public class StringPermutation {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] charArray = new String [N];
		for(int i = 0; i < N ; i++){
			charArray [i] = sc.next();
		}
		int k = sc.nextInt();
		calculatePermutations(k, charArray, "");
	}
	
	private static void calculatePermutations(final int k, final String[] syllables, final String currentWord) {
	    if (k == 0) {
	        System.out.println(currentWord);
	    } else {
	        for (int i = 0; i < syllables.length; i++) {
	        	calculatePermutations(k - 1, syllables, currentWord + syllables[i]);
	        }
	    }
	}
}
