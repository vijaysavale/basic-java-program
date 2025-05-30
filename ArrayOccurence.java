package com.vijay;

import java.util.Scanner;

public class ArrayOccurence {
	
	static int Occurnce(int []arr, int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int []arr= new int[n];
		System.out.println("Enter the "+n+" elements in the array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of x:");
		int x=sc.nextInt();
		
		System.out.println("The number of occurrence of "+x+" is :"+Occurnce(arr,x));
		
	}

}
