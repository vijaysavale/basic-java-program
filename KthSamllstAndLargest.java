package com.vijay;

import java.util.Arrays;
import java.util.Scanner;

public class KthSamllstAndLargest {
	
	static void SmallanLargest(int []arr) {
		Arrays.sort(arr);
		System.out.println("Smallest element in given array: "+arr[0]);
		System.out.println("Largest element in given array: "+arr[arr.length-1]);
	}
	static void KthSmallandLarge(int []arr,int x) {
		Arrays.sort(arr);
		//for(int i=0;i<arr.length;i++)
		System.out.println(x+" Smallest element in given array: "+arr[x-1]);
		System.out.println(x+" Largest element in given array: "+arr[arr.length-x]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter the size of an array:");
		int n=sc.nextInt();
		int []arr =new int [n];
		System.out.println("Enter the elements in array ");
		for (int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the K th Elements:");
		int x= sc.nextInt();
		
		SmallanLargest(arr);
		KthSmallandLarge(arr,x);
	}

}
