package com.bridgelapz.conditional;

import java.util.Scanner;

import com.bridgelapz.utilites.conditionalUtilities;

public class GamlingSimulator {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility= new conditionalUtilities();
		System.out.println("please enter the stake you want to have");
		int stake=scanner.nextInt();
		System.out.println("please enter the goal you want to have");
		int goal=scanner.nextInt();
		System.out.println("please enter the no of days u wnat to play");
		int day=scanner.nextInt();
		utility.gamiling(stake, goal, day);
		scanner.close();
		
		

	}

}
