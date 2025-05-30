package com.vijay;

public class CopyArray {
	static void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 12;
		arr[1] = 22;
		arr[2] = 32;
		arr[3] = 42;
		arr[4] = 52;

		System.out.print("Original array is:");

		PrintArray(arr);

		System.out.println();

		int[] arr_2;

		arr_2 = arr;

		System.out.print("Copied array is:  ");

		PrintArray(arr_2);
		arr_2[0]=0;
		arr_2[1]=0;
		System.out.println();
		System.out.println("After changing the array ");
		System.out.print("Original array is:");
		
		PrintArray(arr);
		System.out.println();
		System.out.print("Copied array is:  ");

		PrintArray(arr_2);
	}

}
