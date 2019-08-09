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
}
