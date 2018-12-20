package Mathlabprograms;

import java.util.Scanner;

// -b+sqrt((b*b)-(4*a*c))/2*a
// -b-sqrt((b*b)-(4*a*c))/2*a
public class Quadraticequation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 values :  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double determinant=(b*b)-(4*a*c);
double sqrt=Math.sqrt(determinant);
		double root1=(-b+sqrt)/(2*a);
		double root2=(-b-sqrt)/(2*a);
		if(determinant>0) {
		System.out.println("the both root values are :"+root1+" & "+root2 );
		
}
else if(determinant==0)
{
	System.out.println("root are : "+root1);
}
}
}