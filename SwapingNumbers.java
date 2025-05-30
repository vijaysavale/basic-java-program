package com.vijay;

public class SwapingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {0,0,1,1,0,1,1};
		int j=arr.length-1;
		for(int i=0; i<arr.length/2;i++){
		    if(arr[i]==0 && arr[j]==1){
		        
		        arr[i]=0;
		        arr[j]=1;
		           }
		        if(i==j){
		            break;}
		        else{
		            arr[i]=0;
		            arr[j]=1;}
		   
		       j--;
		       }
		       
		       
		  for(int i=0; i<arr.length; i++){
		      System.out.println(arr[i]);}

	}

}
