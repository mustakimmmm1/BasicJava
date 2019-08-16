package com.bridgrlapz.Day4;

import java.util.Scanner;

import com.bridgelapz.utilites.utilites;

public class Calender {

	public static void main(String[] args) {
		utilites utility= new utilites();
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("please  enter month");
	    int month=scanner.nextInt();
	    System.out.println("please  enter year ");
	    int year=scanner.nextInt();
	    if(utilites.validateDate(month,1,year)) {
	    	int day=utility.day(month, 1, year);
	    	int days =utility.daysOfMonth(month,year);
	    	switch(day) {
	    	case 0:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				for (int i = 1; i <= days; i++) {
					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i % 7 == 0) {
						System.out.println();
					}
				}
				break;
	    	case 1:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				System.out.print("    ");
				for (int i = 1; i <= days; i++) {
					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i % 7 == 6) {
						System.out.println();
					}
				}
				break;
	    	case 2:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				System.out.print("        ");
				for (int i = 1; i <= days; i++) {
					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i % 7 == 5) {
						System.out.println();
					}
				}
				break;
	    	
	    	case 3:
	    		System.out.println("SUN MON TUE WED THU FRI SAT");
	    		System.out.print("            ");
	    		for (int i = 1; i <= days; i++) {
	    			if (i <= 9) {
	    				System.out.print(i + "   ");
	    			} else {
	    				System.out.print(i + "  ");
	    			}
	    			if (i % 7 == 4) {
	    				System.out.println();
	    			}
	    		}
	    		break;
	    	case 4:
	    		System.out.println("SUN MON TUE WED THU FRI SAT");
	    		System.out.print("                ");
	    		for (int i = 1; i <= days; i++) {
	    			if (i <= 9) {
	    				System.out.print(i + "   ");
	    			} else {
	    				System.out.print(i + "  ");
	    			}
	    			if (i % 7 == 3) {
	    				System.out.println();
	    			}
	    		}
	    		break;
	    	case 5:
	    		System.out.println("SUN MON TUE WED THU FRI SAT");
	    		System.out.print("                    ");
	    		for (int i = 1; i <= days; i++) {
	    			if (i <= 9) {
	    				System.out.print(i + "   ");
	    			} else {
	    				System.out.print(i + "  ");
	    			}
	    			if (i % 7 == 2) {
	    				System.out.println();
	    			}
	    		}
	    		break;
	    	case 6:
	    		System.out.println("SUN MON TUE WED THU FRI SAT");
	    		System.out.print("                         ");
	    		for (int i = 1; i <= days; i++) {
	    			if (i <= 9) {
	    				System.out.print(i + "   ");
	    			} else {
	    				System.out.print(i + "  ");
	    			}
	    			if (i % 7 == 1) {
	    				System.out.println();
	    			}
	    		}
	    		break;
	    	}
	    }else { 
	    	System.out.println("please enter the valid date ");
	    }
	    scanner.close();
	}
	

}
