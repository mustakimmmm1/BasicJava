package com.bridgelapz.fuctional;
import java.util.Scanner;

import com.bridgelapz.utilites.utilites;
public class Quadratic {

	public static void main(String[] args) {

		utilites utility= new utilites();
	    Scanner scanner= new Scanner(System.in);
		System.out.println("please enter value of x*x i.e a");
		double a=scanner.nextDouble();
		System.out.println("please enter value of x i.e b");
		double b=scanner.nextDouble();
		System.out.println("please enter value of constant i.e c");
		double c=scanner.nextDouble();
		utility.calculate(a,b,c);
		scanner.close();

	}

}
