package com.bridgelapz.conditional;

import java.util.Scanner;

import com.bridgelapz.utilites.conditionalUtilities;
import com.bridgelapz.utilites.utilites;

public class RollDie {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility1= new conditionalUtilities();
		utilites utility= new utilites();
    	int max = 6; 
        int min = 1; 
        
        
        System.out.println("please enter the no of times u want to roll a die");
        int n=scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	 a[i]=(int)utility.random(max,min);	 
        }
        
        utility1.SuggestNum(a,n);
        
        scanner.close();
	}

}
