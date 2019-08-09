package com.bridgelapz.conditional;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the value of n ");
		int n=scanner.nextInt();
		double x=Math.pow(n, 2);
		for(int  i=0; i<x+1;i++) {
			System.out.println("power of "+i+" is "+(int) Math.pow(i,2));
		}
		scanner.close();
	}

}
