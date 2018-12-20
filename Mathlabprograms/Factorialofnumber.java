package Mathlabprograms;

import java.util.Scanner;

public class Factorialofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int number=sc.nextInt(),temp=1;;
for (int i = 1; i <=number; i++) {
	temp=temp*i;
}
		System.out.println(temp);
		
	}

}
