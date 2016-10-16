package com.dineshonjava.algo;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMaximization {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < n ; i++){
			arr [i] = sc.nextInt();
		}
		productMaximize(n, arr);
	}

	private static void productMaximize(int n, int[] arr) {
		if(n < 3){
			System.out.println(0);
		}else{
			Arrays.sort(arr);
			int max = 0;
			if(arr[0] < 0 && arr[1] < 0){
				if(Math.abs(arr[0]) >= arr[n-1] || Math.abs(arr[0]) >= arr[n-2]){
					max = arr[0]*arr[1]*arr[n-1];
				}else{
					max = arr[n-3]*arr[n-2]*arr[n-1];
				}
			}else{
				max = arr[n-3]*arr[n-2]*arr[n-1];
			}
			System.out.println(max);
		}
	}
}
