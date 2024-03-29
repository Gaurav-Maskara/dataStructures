package com.gaurav.codility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HackerRank_Abbreviation {
	
    static String abbreviation(String a, String b) {
              
    	a=a.toUpperCase();
    	String result="YES";
    	
    	char[] chrs=b.toCharArray();
    	for(int i=0; i<chrs.length; i++) {
    		
    		if(!a.contains(Character.toString(chrs[i]))) {
    			result="NO";
    			return result;
    		}else {
    			a=a.replaceFirst(Character.toString(chrs[i]), "");
    		}
    	}
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
