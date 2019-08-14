package com.bridgelapz.conditional;

import java.util.Scanner;

import com.bridgelapz.utilites.conditionalUtilities;

public class sin {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility= new conditionalUtilities();
		System.out.println("please  enter the angle ");
		int angle=scanner.nextInt();
		double radAngle=angle%(2*Math.PI);
		utility.taylorSin(radAngle);
		scanner.close();
	}

}
