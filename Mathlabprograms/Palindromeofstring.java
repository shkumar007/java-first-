package Mathlabprograms;

import java.util.Scanner;

public class Palindromeofstring {
	
		public static void main(String[] args)  throws java.lang.Exception 
		{
			// TODO Auto-generated method stub
	
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the string : ");
			String s=sc.nextLine();
	char []ch=new char[s.length()];

	for (int i = 0,j=s.length()-1; j >=0 ;j--, i++) {
		ch[i]=s.charAt(j);
		
	}
	String s1=new String(ch);
	if(s.equals(s1))
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");

		}
		

	

}
