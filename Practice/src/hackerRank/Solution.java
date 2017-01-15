package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
	        
	        int arr[];
			
	        Scanner scan = new Scanner(System.in);
	        
	        /* Declare second integer, double, and String variables. */
	        int a;
	        double b;
	        String c;

	        /* Read and save an integer, double, and String to your variables.*/

	        a = Integer.parseInt(scan.next());
	            
	        b = Double.parseDouble(scan.next());
	        
	        c = scan.nextLine();
	        
	        

	        /* Print the sum of both integer variables on a new line. */
	        System.out.println(a+i);
	               
	        /* Print the sum of the double variables on a new line. */
	        System.out.println(d+b);
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */
	        System.out.println(s+c);

	        scan.close();
	        

	}

}
