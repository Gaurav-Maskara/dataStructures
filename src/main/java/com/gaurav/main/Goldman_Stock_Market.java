package com.gaurav.main;

import java.util.Scanner;

public class Goldman_Stock_Market {

	 static long buyMaximumProducts(int n, long k, int[] a) {

		 double walletStrength=k;
		 long sharesBought=0;
		 
	    outer:for(int i=0; i<a.length; i++) {
			     int counter=i+1;
			 
			    for(int j=1; j<=counter; j++) {
				     if(walletStrength >=a[i]) {
				    	 sharesBought++;
				    	 walletStrength=(double)(walletStrength-a[i]);
				     }
				     else {
				    	 break outer;
				     } 
			    }
		 }
		 return sharesBought;
	 }
	 

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        long k = in.nextLong();
	        long result = buyMaximumProducts(n, k, arr);
	        System.out.println(result);
	        in.close();
	    }
}
