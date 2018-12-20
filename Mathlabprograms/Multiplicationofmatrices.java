package Mathlabprograms;

import java.util.Scanner;

public class Multiplicationofmatrices {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row and column:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x[][]=new int[n][m];
		int y[][]=new int[n][m];
		int z[][]=new int[n][m];
		System.out.println("Please enter a number:");
		for(int i=0;i<n;i++)
		{
		for (int j=0;j<m;j++)
		{
		x[i][j]=sc.nextInt();
		}
		}
		System.out.println("Please enter a number:");
		for(int i=0;i<n;i++)
		{
		for (int j=0;j<m;j++)
		{
		y[i][j]=sc.nextInt();
		}
		}
	    System.out.println("Multiplication of arrays:");
		for(int i=0;i<n;i++)
		{
		for (int j=0;j<m;j++)
		{
		for(int k=0;k<n;k++)
		{
		z[i][j]=z[i][j]+x[i][k]*y[k][j];
		}
		}
		}
		System.out.println("Display the array:");
		
		for(int k[]:z)
		{
			for(int o:k)
			{
				System.out.print(o+"\t");
			}
			System.out.println();
		}
		
		
	
		
	}
}
