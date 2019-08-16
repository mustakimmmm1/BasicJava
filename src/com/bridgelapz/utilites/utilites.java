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
	
	public static boolean leapyear (int year) {

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
	
	public static boolean validateDate(int month,int day, int year){
		if (year<1582)
			return false;
		if(month<1 || month>12)
			return false ;
		if(day<1 || day>31)
			return false;
		boolean leapyear=utilites.leapyear(year);
		if(month==2) 
			if(leapyear) {
				if(day<1 || day > 29)
					return false;
		}else {
			if(day<1 || day >28)
					return false;
			}
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
	public double windChill(int t , int v) {
		double x= Math.pow(v, 0.16);
		double w=35.74+(0.6215*t)+(0.4275*t-35.75)*x;
		return w;
		
	}
	public void celsiusToFahrenheit(int celsius) {
		int f= (celsius * 9/5) + 32 ;
		System.out.println("the fahrenheit degree is "+f+" for celcius degree "+celsius);
	}

	public void fahrenheittocelsius(int fehrenheit){
		 int c=(fehrenheit - 32) * 5/9;
		 System.out.println("the celsius degree is "+c+" for fehrenheit degree "+fehrenheit);
		 }
	
	
	public double LoanCalculator(int principalLoanAmount, int year, double rOI) {

		double payment, r;
		int n;
		n = 12 * year;
		r = (rOI / (12 * 100));

		payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
		return payment;
		}

	public int day(int month, int day, int year) {
		int	y0 = year - (14 - month) / 12;
	    int	x = y0 + (y0/ 4) - (y0 /100) + (y0/400);
	    int	m0 = month + 12* ((14 - month) / 12) - 2;
	    int	d0 = (day + x + 31* m0/12)%7;
	    return d0;

		
	}

	public int daysOfMonth(int month, int year) {
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			return 31;
		if (month==4||month==6||month==9||month==11)
			return 30;
		boolean leapyear=utilites.leapyear(year);
		if(month==2) {
			if(leapyear)	
				return 29;
			}else {
				return 28;
			}
		return 0;
	}


	
}


 
