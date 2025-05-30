package com.vijay;

import java.util.Scanner;

public class IsSorted {
	
	static boolean sort(int []arr) {
		boolean sort=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				sort =false;
			}
		}
		return sort;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the "+n+" elements in array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("The given array is sorted :"+sort(arr));
	}

}
