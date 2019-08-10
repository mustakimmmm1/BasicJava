package com.bridgelapz.conditional;

import java.util.Scanner;

import com.bridgelapz.utilites.conditionalUtilities;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility= new conditionalUtilities();
		System.out.println("enter the number u want to start the range for prime number");
		int rangeStart=scanner.nextInt();
		System.out.println("enter the number u want to end the range for prime number");
		int rangeEnd=scanner.nextInt();
		int temp;
		for(temp=rangeStart;temp <=rangeEnd;temp++) {
			 boolean prime = utility.PrimeNum(temp);
				if(prime){
					System.out.println(" prime number"+ temp);
				}
		}
		scanner.close();
	}

}
