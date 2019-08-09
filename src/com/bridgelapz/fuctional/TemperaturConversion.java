package com.bridgelapz.fuctional;

import java.util.Scanner;

import com.bridgelapz.utilites.utilites;

public class TemperaturConversion {

	public static void main(String[] args) {
		utilites utility= new utilites();
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("please enter the  case you want");
	    System.out.println("1.Celsius to Fahrenheit:");
	    System.out.println("2.Fahrenheit to Celsius:");
	    int no=scanner.nextInt();
	    
	    switch(no) {
	    case 1: System.out.println("please enter celsius");
	    		int celsius=scanner.nextInt();
	    		utility.celsiusToFahrenheit(celsius);
	    		break;
	    case 2: System.out.println("please enter fehrenheit");
				int fehrenheit=scanner.nextInt();
				utility.fahrenheittocelsius(fehrenheit);
				break;
	    	
	    default: System.out.println("please enter the valid input");
	    }
	    scanner.close();

	}

}


