package com.bridgelapz.conditional;

import java.util.Scanner;

import com.bridgelapz.utilites.conditionalUtilities;

public class Sqrt {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility= new conditionalUtilities();
		System.out.println("please enter the non negative number ");
		int c=scanner.nextInt();
		if(c>0)
		utility.sqrtNewton(c);
		else
		System.out.println("please enter a positive integer");	
		
	}

}
