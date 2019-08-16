package com.bridgrlapz.Day4;

import java.util.Scanner;

import com.bridgelapz.utilites.day4utilites;

public class palindrom {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		day4utilites utility= new day4utilites();
		System.out.println("please enter string one ");
		String one=scanner.nextLine();
		utility.palindrome(one);
		scanner.close();

	}

}
