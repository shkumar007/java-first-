package Mathlabprograms;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
	
		 
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	       int  n = s.nextInt();
	       s.close();
	        int a = 0, b = 1, c; 
	      
	            System.out.print( a + " "); 
	     
	            System.out.print( b + " "); 
	        for (int i = 2; i <= n; i++)  
	        { 
	            c = a + b; 
	            System.out.print( c + " "); 
	            a = b; 
	            b = c; 
	        } 
	}

}
