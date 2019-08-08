package com.bridgelapz.fuctional;

import java.util.Scanner;

import com.bridgelapz.utilites.utilites;

public class SpringSeason {

	public static void main(String[] args) {
			utilites utility= new utilites();
	    	Scanner scanner= new Scanner(System.in);
	    	System.out.println("please enter the month");
	    	int month=scanner.nextInt();
	    	System.out.println("please enter the day");
	    	int day=scanner.nextInt();
	    	if(utility.validateDate(month,day)){
			if(utility.SpringSeason(month,day)){
				System.out.println("it is spring season");
			}else{
				System.out.println("its not a spring season ");
			}
	    	}else{
			System.out.println("please enter a valid date");		

		}
		scanner.close();
	}

}

