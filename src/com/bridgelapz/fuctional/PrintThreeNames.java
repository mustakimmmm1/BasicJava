package com.bridgelapz.fuctional;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			System.out.println("enter first Name");
			String FristName=scanner.next();
			System.out.println("enter Second Name");
			String SecondName=scanner.next();
			System.out.println("enter Third Name");
			String ThirdName=scanner.next();
			System.out.println(" hi "+ThirdName + " , " +SecondName+ " and " +FristName);
			scanner.close();
			

	}

}
