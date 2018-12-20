package Mathlabprograms;

import java.util.Scanner;

public class Arithmaticoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=6;
Scanner sc=new Scanner(System.in);
System.out.println("pls ");
String s=sc.nextLine();
sc.close();
switch(s)
{
case "+" :System.out.println(a+b);
           break;
case "-" :System.out.println(a-b);
           break;
           
case "*" :System.out.println(a*b);
           break;           
case "/" :System.out.println(a/b);
           break;
default :System.out.println(a%b);
          break;
}		
		
	}

}
