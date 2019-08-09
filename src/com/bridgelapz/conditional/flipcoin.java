package com.bridgelapz.conditional;

import java.util.Scanner;



public class flipcoin {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	    System.out.println("please enter the no of times  u want t flip a coin ");
	    int flip=scanner.nextInt();
	    int counttail=0;
	    int counthead=0;
	    for(int i=0;i<flip;i++) {
	    	if(Math.random()>0.5) {
	    		System.out.println("it is a tail");
	    		counttail++;
	    		
	    	}else {
	    		System.out.println("it is a head");
	    		counthead++;
	    	}
	    }
		System.out.println("no of times tail occured"+counttail);
		System.out.println("no of times head occured"+counthead);

	    int headpercent=(counthead*100/flip);
		System.out.println(" head percentage is "+headpercent);

	    int tailpercent=(counttail*100/flip);
		System.out.println("tail percentage is "+tailpercent);

	    scanner.close();
	}

}
