package com.bridgelapz.utilites;

import java.util.Arrays;

public class day4utilites {

	public void anagram(String one, String two) {
		char[] onestr=one.toCharArray();
		char[] twostr=two.toCharArray();
		Arrays.sort(onestr); 
		Arrays.sort(twostr);
		if(onestr.length != twostr.length) {
			System.out.println("enter strings are not anagram ");
		}else {
			for (int i=0;i<onestr.length;i++) {
				if(twostr[i]==onestr[i]) {
					
				}else {
					System.out.println("enter strings are not anagram");
				}
			}
		}
		System.out.println("enter strings are anagrams");
	}

	
	public void palindrome(String one) {
		char[] arrayone=one.toCharArray();
		int i = 0;
		boolean flag=false;
	      for(@SuppressWarnings("unused") char c: arrayone) {
	         i++;
	      }
	      System.out.println("Length of the given string ::"+i);
		char[] temp=new char[i];
		int k=0;
		for(int j=i-1;j>=0;j--) {
			temp[k]=arrayone[j];
			k++;
		}
		
		for(int l=0;l<i;l++) {
		
			if(temp[l]!=arrayone[l]) {
				flag=true;
		}
		}if(flag==false)
			System.out.println("its  a palindrome");
		else
			System.out.println("its not a palindrome");
	}


	public void itreative(String str1) {
		char[] string=str1.toCharArray();
		int[] p = new int[str1.length()];
		int i = 1, j = 0;
		System.out.print(str1);

		while (i < str1.length())
		{
			if (p[i] < i)
			{
				j = (i % 2) * p[i];
				swap(string, i, j);
				System.out.print(" " + String.valueOf(string));
				p[i]++;
				i = 1;	
			}else {
				
				p[i] = 0;
			}
		}
	}
	private static String swap(char[] a, int i, int j) {
		char ch = a[i];
		a[i] = a[j];
		a[j] = ch;
		return String.valueOf(ch); 
	}


	public void Recursive(String str1, int i, int j) {
		char[] array=str1.toCharArray();
		if (i == j) 
            System.out.println(str1); 
        else
        { 
            for (int i1 = j; i1 <= j; i1++) 
            { 
                str1 = swap(array,1,i1); 
                Recursive(str1, i1+1, j); 
                str1 = swap(array,1,i1); 
            } 
        } 
		
	}


	
	
}


