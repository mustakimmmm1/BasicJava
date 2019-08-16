package com.bridgrlapz.Day4;

import java.util.Scanner;

import com.bridgelapz.utilites.day4utilites;



public class permutation {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("please enter the string ");
		String str1=scanner.nextLine();
		day4utilites utility= new day4utilites();
		utility.itreative(str1);
		scanner.close();
	}
}


