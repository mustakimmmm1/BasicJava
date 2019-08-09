package com.bridgelapz.fuctional;

import java.util.Scanner;


import com.bridgelapz.utilites.utilites;

public class CarLoan {

public static void main(String[] args) {
	utilites utility= new utilites();
    Scanner scanner= new Scanner(System.in);
	int principalLoanAmount,year;
	double rOI,amountToPayForMonth;

	System.out.println("Enter Principal Loan Amount");
	principalLoanAmount=scanner.nextInt();
	System.out.println("Enter Year");
	year=scanner.nextInt();
	System.out.println("Enter Rate Of Interest");
	rOI=scanner.nextDouble();
	amountToPayForMonth=utility.LoanCalculator(principalLoanAmount,year,rOI);
	System.out.println("Amount to Pay per month  :"+amountToPayForMonth+" For no of Years :"+year);
	scanner.close();

}

}
