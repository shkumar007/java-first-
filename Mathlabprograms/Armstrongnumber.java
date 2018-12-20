package Mathlabprograms;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =new Scanner(System.in).nextInt();
		
		if(num==arm(num)) {
			System.out.println(num + " arm strong number");
		}
		else {
			System.out.println(num+" is not armstring number");
		}
		

		
		
		}
		public static int arm(int num)
		{
			
			int x=0;
			int y=0;
			do
			{
				x=num%10;
				y=y+x*x*x;
				num=num/10;
			}while(num>0);
			return y;	
		
		}
	}

