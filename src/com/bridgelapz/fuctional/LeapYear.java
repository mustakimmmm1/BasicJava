package com.bridgelapz.fuctional;

import java.util.Scanner;

import com.bridgelapz.utilites.utilites;

public class LeapYear {

	public static void main(String[] args) {
		utilites utility= new utilites();
		Scanner scanner= new Scanner(System.in);
		System.out.println("please enter a year greater than 1582");
		int year=scanner.nextInt();
		if (year>= 1582 && year <=9999) {
			if(utility.leapyear(year)) {
				System.out.println("its a leap year");
			}
			else {
				System.out.println("its not a leap year");
			}
		}else {
			System.out.println("please enter a valid year ");
		}
		
		scanner.close();

	}

}
