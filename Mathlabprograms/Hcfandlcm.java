package Mathlabprograms;

import java.util.Scanner;

public class Hcfandlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a, b, x, y, t, hcf, lcm;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Two Number : ");
	        x = scan.nextInt();
	        y = scan.nextInt();
			
	        a = x;
	        b = y;
			
	        while(b != 0)
	        {
	            t = b;
	            b = a%b;
	            a = t;
	        }
			
	        hcf = a;
	        lcm = (x*y)/hcf;
			
	        System.out.print("HCF = " +hcf);
	        System.out.print("\nLCM = " +lcm);
		
	}

}
