package Mathlabprograms;

import java.util.Scanner;

public class Simplecalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		// TODO Auto-generated method stub
int a=10;
int b=6;



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
