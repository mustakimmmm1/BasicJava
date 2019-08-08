package com.bridgelapz.utilites;

public class utilites {
	
	public int Operators1(int firstNum,int SecondNum ,int ThirdNum) {
	int result=firstNum + SecondNum *ThirdNum;
	return result;
	}
	
	public int Operators2(int firstNum,int SecondNum ,int ThirdNum) {
		int result=firstNum * SecondNum +ThirdNum;
		return result;
		}
		
	public int Operators3(int firstNum,int SecondNum ,int ThirdNum) {
		int result= ThirdNum+firstNum / SecondNum;
		return result;
		}
		
	public int Operators4(int firstNum,int SecondNum ,int ThirdNum) {
		int result=firstNum % SecondNum +ThirdNum;
		return result;
		}
	
	public boolean leapyear (int year) {

        if ((year % 4 == 0) && year % 100 != 0)
        {
            return true;
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
           return true;
          
        }
        else
        {
            return false;
        }
		}
	
	public boolean validateDate(int month,int day){
		if(month<1 || month>12)
			return false ;
		if(day<1 || day>31)
			return false;
		if(month==2)
			if(day<1 || day >28)
				return false;
		if(month==4 || month ==6 || month ==9 || month ==11)
			if(day<1 || day>30)
				return false; 
		return true;
	}	



	public boolean SpringSeason(int month, int day) {
		if(month==4 || month==5)
			return true;
		if((month==3&&day>=20)||(month==6&&day<=20))
			return true;
		return false;
	}
	
	public void calculate(Double a , Double b ,Double c){
		double root1, root2 ;
		double delta =b*b + 4* a *c;
		if(delta >0){
		root1=(-b + Math.sqrt(delta))/2*a;
		root2=(-b - Math.sqrt(delta))/2*a;
		System.out.printf("two roots of equation" +a+"x*x+"+b+"x+"+c+"is %f  %f:",root1,root2);
		}
		if(delta==0){
		root1=-b/2*a;
		root2=root1;
		System.out.printf("two roots of equation" +a+"x*x+"+b+"x+"+c+"is %f  %f :",root1,root2);
		}
		if(delta<0){
		double realpart=-b/2*a;
		double imagpart=Math.sqrt(delta)/2*a;
		root1=realpart+imagpart;
		root2=realpart-imagpart;
		System.out.printf("two roots of equation" +a+"x*x+"+b+"x+"+c+"is %f  %f :",root1,root2);
		}
	}
	
	
	public double Euclidean(double x, double y ) {
		 double result;
		 result=Math.sqrt(x*x+y*y);
		 return result;
	}
	
	public float random(int  max , int min ) {
		 int range = max;
		 float randnum= (float)(Math.random() * range) + min; 
		 
		 return randnum;
	}
	
	public double maxnum1(double a, double b) {
		 return Math.max(a, b);
	}
	public double minnum(double a, double b) {
		 return Math.min(a, b);
	}

	}
 
