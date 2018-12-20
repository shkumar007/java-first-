package Mathlabprograms;

public class sumofindividualdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		int num=511;
		do
		{
			x=num%10;
			y=y+x;
			num=num/10;
		}while(num>0);
		System.out.println("sum of individual digits are : "+y);	
	}

}
