package com.vijay;

import java.util.Scanner;

public class targetSum {
	
	static int sum(int []arr,int x) {
		
		int ans=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if (arr[i]+arr[j]==x) {
				ans++;	
				}
			}
		}
		return ans;
	}

static int Triplet(int []arr,int x) {
		
		int ans=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
				if (arr[i]+arr[j]+arr[k]==x) {
				
					ans++;	
				}
				}
			}
		}
		return ans;
	}
 	static  void uniqueElement (int []arr) {
 		
 		int n =arr.length;
 		for(int i=0;i<arr.length;i++) {
 			for (int j=i+1;j<n;j++) {
 				if(arr[i]==arr[j]) {
 					arr[i]=arr[j]=-1;
 					//System.out.println("The unique element in given array is"+arr[i]);
 				}
 			}
 		}
 		for(int i=0;i<n;i++) {
 			if(arr[i]>0) {
 				System.out.print("unique element is "+arr[i]);
 			}
 			
 		}
 		
 		
 		//return arr;
 		
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the size of an array ");
		int n=sc.nextInt();
		int []arr= new int [n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("Enter the target sum number ");
		int x=sc.nextInt();
		
		System.out.println("Number of pairs are "+sum(arr,x));
		System.out.println("Number of triplets are "+Triplet(arr,x));
		uniqueElement(arr);
		
	}

}
