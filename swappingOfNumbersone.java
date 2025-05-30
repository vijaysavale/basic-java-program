package com.vijay;

import java.util.Scanner;

public class swappingOfNumbersone {
	
	static void PrintArray(int []arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
	}
	
	static void swap(int arr[],int i, int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
	}
	
	static void swapfunction(int arr[]) {
		int n = arr.length;
		int left =0, right =n-1;
		while(left <right) {
			if(arr[left]%2==1 && arr[right]%2==0 ) {
				swap(arr,left,right);
				left++;
				right--;
			}
			if (arr[left]%2==0) {
				left++;
			}
			if (arr[right]%2==1) {
				right--;
			}
		}
		PrintArray(arr);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int []arr= new int[n];
		System.out.println("Enter the elements in the array ");
		for(int i=0;i<arr.length;i++ ) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("original array");
		PrintArray(arr);
		System.out.println("");
		System.out.print("Sorted array ");
		swapfunction(arr);
	}

}
