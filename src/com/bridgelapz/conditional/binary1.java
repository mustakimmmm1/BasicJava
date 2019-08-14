package com.bridgelapz.conditional;

import java.util.Scanner;

import com.bridgelapz.utilites.conditionalUtilities;

public class binary1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility= new conditionalUtilities();
		int n;
		System.out.println("Enter a number");
		n = scanner.nextInt();
		String x=utility.Binarycalc(n);
		System.out.println("binary represntation is "+x);
		int y=utility.SwapNibbles(n);
		System.out.println("after swaping of nibbles the decimal is "+y);
		scanner.close();
	}

}

