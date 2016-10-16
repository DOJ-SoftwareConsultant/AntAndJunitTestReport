package com.dineshonjava.algo;

import java.util.Scanner;

public class MillyPens {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t ; i++){
			int N = sc.nextInt();
			int M = sc.nextInt();
			int P = sc.nextInt();
			int MM []=new int[M];
			for(int j=0;j<M;j++){
				MM[j]=sc.nextInt();
			}
			int PP []=new int[P];
			for(int j=0;j<P;j++){
				PP[j]=sc.nextInt();
			}
			int pen []=new int[N];
			for(int j=1;j<=N;j++){
				pen[j-1]=j;
			}
			if(buy(MM,PP,pen)){
				System.out.println("They can");
			}else{
				System.out.println("They can't");
			}
		}
	}

	private static boolean buy(int[] mM, int[] pP, int[] pen) {
		for(int i=0;i<mM.length;i++){
			for(int j=0;j<pen.length;j++){
				if(pen[j]==mM[i]){
					pen[j]=-1;
					break;
				}
			}
		}
		for(int i=0;i<pP.length;i++){
			for(int j=0;j<pen.length;j++){
				if(pen[j]==pP[i]){
					pen[j]=-1;
					break;
				}
			}
		}
		boolean f=true;
		for(int j=0;j<pen.length;j++){
			if(pen[j]>0){
				f=false;
				break;
			}
		}
		return f;
	}
}
