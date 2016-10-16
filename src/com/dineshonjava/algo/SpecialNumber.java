package com.dineshonjava.algo;

import java.util.Scanner;

public class SpecialNumber {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t ; i++){
			int Q = sc.nextInt();
			for(int j = 0; j < Q ; j++){
				int N = sc.nextInt();
				int start = 1, end = N / 2;
				int mid = 0;
		        while(start <= end) {
		            mid = start + (end - start) / 2;
		            if(mid == N / mid) {
		                break;
		            }
		            if(mid < N / mid) {
		                start = mid + 1;
		            } else {
		                end = mid - 1;
		            }
		        }
		        System.out.println(N-mid*mid);
			}
		}
	}
}
