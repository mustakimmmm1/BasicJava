package com.bridgelapz.fuctional;
import java.util.Scanner;
import com.bridgelapz.utilites.utilites;
public class Operations {

	public static void main(String[] args) {
		utilites utility= new utilites();
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter first Integer");
		int FristInteger=scanner.nextInt();
		System.out.println("enter Second Integer");
		int SecondInteger=scanner.nextInt();
		System.out.println("enter Third Integer");
		int ThirdInteger=scanner.nextInt();
		System.out.println("enter the no of times u want to perform operations");
		int n=scanner.nextInt();
		int i;
		for(i=0;i<n;i++) {
		System.out.println("select the operations \n 1 a+b*c \n 2 a*b+c \n 3 c+a/b \n 4 a%b+c ");
		int Operater=scanner.nextInt();
		int result;
		
		switch (Operater) {
		case 1:
				result=utility.Operators1(FristInteger,SecondInteger,ThirdInteger);
				System.out.println("operation 1 : "+result);
				break;
		case 2:
			result=utility.Operators2(FristInteger,SecondInteger,ThirdInteger);
			System.out.println("operation 2 : "+result);
			break;
		case 3:
			result=utility.Operators3(FristInteger,SecondInteger,ThirdInteger);
			System.out.println("operation 3 : "+result);
			break;
		case 4:
			result=utility.Operators4(FristInteger,SecondInteger,ThirdInteger);
			System.out.println("operation 4 : "+result);
			break;
		default:
			System.out.println("please enter the correct number");
			break;
		}
		
	}
	scanner.close();
	}

}
