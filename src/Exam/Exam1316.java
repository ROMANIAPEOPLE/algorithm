package Exam;

import java.util.Scanner;

public class Exam1316 {

	 private static boolean isResult(String word) {
	        for(int i=0; i<word.length(); i++) {
	            char a = word.charAt(i);
	            boolean continuos = true;
	            for(int j=i+1; j<word.length(); j++) {
	                char b = word.charAt(j);
	                if( a == b ) {
	                    if( !continuos ) {
	                    	return false;
	                    
	                    }
	                    i++;
	                }
	                else {
	                    continuos = false;
	                }
	            }
	        }
	        return true;
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int count = 0;
	        for( int i=0; i<n; i++ ) {
	            String word = sc.next();
	            if( isResult(word) ) count++;
	        }
	        System.out.println( count );
	    }
	}
