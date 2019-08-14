package com.bridgelapz.conditional;

import java.util.Scanner;
import com.bridgelapz.utilites.conditionalUtilities;
import com.bridgelapz.utilites.utilites;

public class Array2nd {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility= new conditionalUtilities();
		utilites utility1= new utilites();
		System.out.println("please enter the no of elements on array ");
		int n=scanner.nextInt();
		int[] numberArray = new int[n];
		for(int i=0;i<n;i++) {
			numberArray[i]=(int) utility1.random(2147483647,-2147483647);
			System.out.print(numberArray[i]);
		}

		int smallest, secondSmallest;
		smallest = Integer.MAX_VALUE;
		secondSmallest = Integer.MAX_VALUE;
		int largest, secondLargest;
		largest = Integer.MIN_VALUE;
		secondLargest = Integer.MIN_VALUE;
		System.out.println();
		secondSmallest = utility.findSecondSmaller(smallest, secondSmallest, numberArray);
		secondLargest = utility.findSecondLargest(largest, secondLargest, numberArray);

		System.out.println("Second Smallest is : " + secondSmallest);
		System.out.println("Second Largest is : " + secondLargest);
		scanner.close();
	}

}
