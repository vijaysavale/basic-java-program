package com.vijay;

import java.util.Scanner;

public class FindBiggerNumber {
	static int strictlyBig (int []arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>count) {
				count=arr[i];
			}
		}

		return count ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n= sc.nextInt();
		int [] arr=new int [n];
		System.out.println("Enter the "+n+" elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		System.out.println("Enter the value of x: ");
//		int x=sc.nextInt();
		
		System.out.println("In a given array bigger is "+ strictlyBig(arr));

	}

}
