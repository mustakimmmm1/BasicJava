package com.bridgelapz.conditional;

import java.util.Scanner;

import com.bridgelapz.utilites.conditionalUtilities;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility= new conditionalUtilities();
		int n;
		System.out.println("Enter a number");
		n = scanner.nextInt();
		utility.Binarycalc(n);
		scanner.close();
}

}
