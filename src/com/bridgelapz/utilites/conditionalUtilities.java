package com.bridgelapz.utilites;

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




	public void Binarycalc(int n) {
		int a;
		String x ="";
		while(n>0)
		{
			a=n%2;
			x = a + "" + x;
			n=n/2;
			
			
		}
		
		  while (x.length() < 32) {    
		        x = "0" + x;
		  }
		System.out.println("Biinar of is = " +x);
		
	}
}
