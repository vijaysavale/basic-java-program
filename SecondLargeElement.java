package com.vijay;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeElement {
	
	static int largeone(int [] arr) {
		int large =Integer.MIN_VALUE;
		for (int i =0;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}
		return large;
	}
	static int secondlargeone(int [] arr) {
		int mx =largeone(arr);
		for (int i =0;i<arr.length;i++) {
			if(arr[i]==mx) {
				mx=Integer.MIN_VALUE;
			}
		}
		
		int second= largeone(arr);
		return second;
	}
	static int second(int []arr) {
		int n=arr.length;
		Arrays.sort(arr);
		for(int i =n-2;i>=0;i--) {
			if(arr[i]!=arr[n-1]) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int n=sc.nextInt();
		int[] arr= new int [n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("largest element in given array is :"+largeone(arr));
		System.out.println("Second largest element in given array is :"+secondlargeone(arr));
		System.out.println("Second largest element in given array is :"+second(arr));

	}

}
