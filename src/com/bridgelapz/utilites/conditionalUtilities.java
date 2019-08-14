package com.bridgelapz.utilites;

import java.util.Scanner;

public class conditionalUtilities {
	public void sqrtNewton(int c) {
		int t;
		t=c;
		t=(t/c+c)/2;
		int epsilon=1+(10^-15);
		if(Math.abs(t -c/t) > epsilon*t) {
			t=c;
			t=(t/c+c)/2;
			System.out.println(t);
		}
		
		 }

		
	

	public void gamiling(int stake, int goal, int day) {
		 int win=0;
		 int trails=0;
		 for(int i=0;i<day;i++) {
			 int money=stake;
			 while(money>0 && money<goal) {
				 if(Math.random()>0.5) {
					 money++;
					 trails++;
				 }else {
				 		money--;
				 		trails++;
				 	}
			 }
			 if(money==goal)
				 win++;	
		 }
		 System.out.println("no of times won "+win);
		 System.out.println("percentage of win "+win*100/day);
		 System.out.println("avg no of bets made "+trails/day);
	}




	public boolean PrimeNum(int number) {
		int temp=number;
		
			for(int i=2; i<temp/2; i++) {
				if(temp%i==0)
				{
				 return false;
				}
			}
			return true;
		
	}




	public String Binarycalc(int n) {
		int a;
		String x ="";
		while(n>0)
		{
			a=n%2;
			x = a + "" + x;
			n=n/2;
			
			
		}
		
		  while (x.length() < 8) {    
		        x ="0" + x;
		  }
		return x;
		
	}




	public void taylorSin(double radAngle) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("please enter no for the series to stop at ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i+=2){
		   System.out.println(Math.pow(radAngle, i)+"/"+fact(i)+"+");
		}
		scanner.close();
	}
	public void taylorcos(double radAngle) {
		
	Scanner scanner= new Scanner(System.in);
		
		System.out.println("please enter no for the series to stop at ");
		int n=scanner.nextInt();
		for(int i=0;i<=n;i+=2){
		   System.out.println(Math.pow(radAngle, i)+"/"+fact(i)+"+");
		}
		scanner.close();
	}
	
	
	static int fact(int num ) {
		int factorial=1;
		for(int i=1;i<=num;i++) {
			 factorial=factorial*i;
		}
		return factorial;
		}




	public void SuggestNum(int[] a,int n) {
		int one=0,two=0,three=0,four=0,five=0,six=0;
		for(int i=0;i<n;i++)
			switch(a[i]) {
				case 1: one++;
					break;
				case 2: two++;
					break;
				case 3: three++;
					break;
				case 4 :four++;
					break;
				case 5: five++;
					break;
				case 6 :six++;
					break;
		}
		if(one>=two&&one>=three&&one>=four&&one>=five&&one>=six) 
			System.out.println("Dice 1 fall maximum times count is : "+one);
		else if(two>=one&&two>=three&&two>=four&&two>=five&&two>=six) 
			System.out.println("Dice 2 fall maximum times count is : "+two);
		else if(three>=one&&three>=two&&three>=four&&three>=five&&three>=six) 
			System.out.println("Dice 3 fall maximum times count is : "+three);
		else if(four>=one&&four>=two&&four>=three&&four>=five&&four>=six) 
			System.out.println("Dice 4 fall maximum times count is : "+four);
		else if(five>=one&&five>=two&&five>=three&&five>=four&&five>=six) 
			System.out.println("Dice 5 fall maximum times count is : "+five);
		else 
			System.out.println("Dice 6 fall maximum times count is : "+six);
		
	}




	public int repetedNum(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return array[i];
				}
			}
		}
		return 0;
		
	}




	public int findSecondSmaller(int smallest, int secondSmallest, int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] < smallest) {
				secondSmallest = smallest;
				smallest = numberArray[i];
			} else if (numberArray[i] < secondSmallest && numberArray[i] != smallest) {
				secondSmallest = numberArray[i];
			}
		}
		return secondSmallest;
	}




	public int findSecondLargest(int largest, int secondLargest, int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > largest) {
				secondLargest = largest;
				largest = numberArray[i];
			} else if (numberArray[i] > secondLargest && numberArray[i] != largest) {
				secondLargest = numberArray[i];
			}
		}
		return secondLargest;
	}




	public int SwapNibbles(int x) {
		return (((x & 0x0F) << 4) | ((x & 0xF0) >> 4));
	}





}
