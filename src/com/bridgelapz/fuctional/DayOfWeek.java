package com.bridgelapz.fuctional;

import java.util.Scanner;

import com.bridgelapz.utilites.utilites;

public class DayOfWeek {

	public static void main(String[] args) {
		utilites utility= new utilites();
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("please  enter day ");
	    int day=scanner.nextInt();
	    System.out.println("please  enter month");
	    int month=scanner.nextInt();
	    System.out.println("please  enter year ");
	    int year=scanner.nextInt();
	    if(utilites.validateDate(month,day,year)) {
	    	int d0=utility.day(month,day,year);
	    switch(d0) {
	    case 1 : System.out.println("its monday");
	    		  break;
	    case 2 : System.out.println("its tuesday");
	    		  break;
	    case 3 : System.out.println("its wednesday");
		    	  break;
	    case 4 : System.out.println("its thursday");
		  		  break;
	    case 5 : System.out.println("its friday");
		  		  break;
	    case 6 : System.out.println("its saturday");
		  		  break;
	    case 0 : System.out.println("its sunday");
		          break;
	    }
	    } else {
	    	System.out.println("please enter the valid date ");
	    }
	    scanner.close();
	}

}
