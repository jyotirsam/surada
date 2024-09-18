package com.practice;

import java.util.Scanner;

public class Triangle_Pattern {
//Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your line");
		int line=new Scanner(System.in).nextInt() ;
		int space = line-1;
		 for (int l=1;l<=5;l++ ) {
			 for(int s=1;s<=space;s++) {
				 System.out.print(" ");
			 }
			 for(int star=1 ; star<=l;star++) {
				 System.out.print("*" + " ");
			 }
		 space--;
		 System.out.println();
		 }
		 
	}

}
