package com.gaurav.main;

import java.util.Scanner;

public class Goldman1 {
	
	static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
        
        double fee=0;
        int upfrontFee=d;
        String message="";
        
        if(p!=null && p.length>0) {
        	
        	 for(int i=0; i<p.length ; i++) {
                 double temp=(double)(x*p[i])/100;
                 
                 if(temp>k) {
                     fee=fee+temp;
                 }
                 else {
                     fee=fee+k;
                 }
             }
        	 
        	// System.out.println(upfrontFee +"    "+fee);
             
        	 if(upfrontFee<fee) {
        		 message="upfront";
        	 }else {
        		 message="fee";
        	 }
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            int[] p = new int[n];
            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
            }
            String result = feeOrUpfront(n, k, x, d, p);
            System.out.println(result);
        }
        in.close();
    }
}
