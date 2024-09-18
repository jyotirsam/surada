package com.practice;

public class MaxOf_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=122;
		int num2=12;
		int num3=18;
		int temp;
		int max;
		temp = (num1 > num2) ? ( num1 ) : (num2) ;
		max= (num3>temp) ? (num3):(temp);
		System.out.println("bigger number is :"+ max);
	}

}
