package Mathlabprograms;

import java.util.Scanner;

public class TwooperandfrominputandARithmatic {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);	
			// TODO Auto-generated method stub
			System.out.println("enter a value : ");
	int a=sc.nextInt();
	System.out.println("enter b value : ");
	int b=sc.nextInt();
	sc.nextLine();
	
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
