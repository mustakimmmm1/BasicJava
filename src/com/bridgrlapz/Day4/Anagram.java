package com.bridgrlapz.Day4;

import java.util.Scanner;

import com.bridgelapz.utilites.day4utilites;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		day4utilites utility= new day4utilites();
		System.out.println("please enter string one ");
		String one=scanner.nextLine();
		System.out.println("please enter string two  ");
		String two=scanner.nextLine();
		utility.anagram(one,two);
		scanner.close();
		
	}

}
