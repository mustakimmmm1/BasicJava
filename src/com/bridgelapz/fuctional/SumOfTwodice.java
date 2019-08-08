package com.bridgelapz.fuctional;


import com.bridgelapz.utilites.utilites;

public class SumOfTwodice {

	public static void main(String[] args) {
		 utilites utility= new utilites();
    	 int max = 6; 
         int min = 1; 
    ;
        
         int a=(int)utility.random(max,min);
         System.out.println("frist random no on 1st dice is "+a);
         int b=(int)utility.random(max,min);
         System.out.println("second random no on 2nd dice is "+b);
         int sum=a+b;
    	 System.out.println("sum of two dice is "+sum);
         }
	}


