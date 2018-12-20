package Mathlabprograms;

import java.util.Scanner;

public class DecimalToBinaryHexaOctal {
int num;
	public static void main(String[] args) {
		
		DecimalToBinaryHexaOctal obj=new DecimalToBinaryHexaOctal();
		obj.var();
		obj.convert();
		
		
	}
		// TODO Auto-generated method stub
	void var() {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number : ");
 num=sc.nextInt();
	}
	void convert() {
		String hexa=Integer.toHexString(num);
		System.out.println("Hexa : "+hexa);
		String octa=Integer.toOctalString(num);
		System.out.println("Octa : "+octa);
		String binary=Integer.toBinaryString(num);
		System.out.println("Binary : "+binary);
	}

}
