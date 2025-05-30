package com.vijay;

import java.util.Scanner;

//import java.util.Scanner;

public class ArraysJavaOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the size of an array");
		int s= sc.nextInt();
		int[] arr= new int[s];
		System.out.println("Enter the "+s+" elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print("& "+arr[i]);
		}
		
		//System.out.println("Hello world");
	}

}
