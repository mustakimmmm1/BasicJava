package com.bridgelapz.fuctional;

import java.util.Scanner;

import com.bridgelapz.utilites.utilites;

public class WindChill {

	public static void main(String[] args) {
		utilites utility= new utilites();
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("please enter the  tempreture less than 50 Fahrenheit)");
	    int t=scanner.nextInt();
	    System.out.println("please enter the  wind speed between 3 to 120 ");
	    int v=scanner.nextInt();
	    if (t>50 || 3>v || v>120 ) {
	    	System.out.println("please enter the correct value");
	    } else {
	    	double  w= utility.windChill(t,v);
	    	System.out.println("National Weather Service defines the effective temperature (the wind chill) to\n" + 
	    			"be:"+w);
	    }
	    scanner.close();
	}

}


