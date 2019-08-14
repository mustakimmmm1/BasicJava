package com.bridgelapz.conditional;

import java.util.Scanner;

import com.bridgelapz.utilites.conditionalUtilities;
import com.bridgelapz.utilites.utilites;

public class ArrayRepeted {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		conditionalUtilities utility= new conditionalUtilities();
		utilites utility1= new utilites();
		int[] array=new int[101];
		int num=1;
		for(int i=0;i<100;i++) {
			array[i]=num;
			num++;
		}
		
		 array[100]=(int)utility1.random(100,1);
		 System.out.println();
		 System.out.println("random number generated in array "+array[100]);
		 int repetedNum=utility.repetedNum(array);
		 System.out.println("the reapeted number is "+repetedNum);
		 scanner.close();
	}

}
