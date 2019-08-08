package com.bridgelapz.fuctional;

import java.util.Scanner;

import com.bridgelapz.utilites.utilites;

public class Distance {

	public static void main(String[] args) {
		utilites utility= new utilites();
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("please enter the coordinates X & Y");
	    double x = scanner.nextDouble();
	    double y = scanner.nextDouble();
	    double result;
	    result=utility.Euclidean(x,y);
	    System.out.println("the  Euclidean distane is : "+result);
	    scanner.close();

	}

}
