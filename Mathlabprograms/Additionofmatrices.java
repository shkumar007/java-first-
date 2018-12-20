package Mathlabprograms;

import java.util.Scanner;

public class Additionofmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					Scanner sc=new Scanner(System.in);
			System.out.println("Enter the row and column size:");
			int r=sc.nextInt();
			int c=sc.nextInt();
			int x[][]=new int[r][c];
			int y[][]=new int[r][c];
			int z[][]=new int[r][c];
			System.out.println("Please enter a number:");
			for(int i=0;i<r;i++)
			{
			for (int j=0;j<c;j++)
			{
			x[i][j]=sc.nextInt();
			}
			}
			
			System.out.println("Please enter a number:");
			for(int i=0;i<r;i++)
			{
			for (int j=0;j<c;j++)
			{
			y[i][j]=sc.nextInt();
			}
			}
			
			System.out.println("Addition of 2 arrays:");
			for(int i=0;i<r;i++)
			{
			for (int j=0;j<c;j++)
			{
			z[i][j]=x[i][j]+y[i][j];
			}
			}
			System.out.println("Display the array:");
			
			for(int k[]:z)
			{
				for(int j:k)
				{
					System.out.print(j+"\t");
				}
				System.out.println();
			}
			}
			

		
			
	

}
