package Mathlabprograms;

import java.util.Scanner;

public class Multiplicationoftwocomplexnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the complex numbers : ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(complexnumbermultiply(s1,s2)); 
		
	}
	
	public static String complexnumbermultiply(String a,String b) {
		String x[]=a.split("\\+|i");
		String y[]=b.split("\\+|i");
		int a_real=Integer.parseInt(x[0]);
		int b_real=Integer.parseInt(y[0]);
		int a_img=Integer.parseInt(x[1]);
		int b_img=Integer.parseInt(y[1]);
		return (a_real*b_real - a_img*b_img)+"+"+(a_real*b_img + a_img*b_real)+"i";
	}

}
