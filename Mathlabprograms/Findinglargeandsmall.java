package Mathlabprograms;

import java.util.Scanner;

public class Findinglargeandsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			  
			  Scanner sc=new Scanner(System.in);
			  System.out.println("enter size of array : ");
			  int size=sc.nextInt();
			  int a[]=new int[size];
			  System.out.println("Enter elements in to an array : ");
			  for (int i = 0; i <size; i++) {
				  a[i]=sc.nextInt();
			}
			  int m=a[0];
			  int n=a[0];
			  for (int i = 0; i < a.length; i++) {
				if(m<a[i]){//if(m>a[i])
					n=m;
					m=a[i];
				}
				/*else if(n<a[i])
				n=a[i];*/
		      }
			  
			  System.out.println("Largest value in array is : "+m);
			  
			  
			//System.out.println("min value in array is : "+n);
			  
	
			  
			  
			  
			  
			  
			  
		  

	

	}}
