package com.bridgelapz.conditional;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number for harmonic series");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			if(i!=n)
				System.out.print("1/"+i+"+");
			if (i==n)
				System.out.print("1/"+i);
		}
		scanner.close();
	}
}
