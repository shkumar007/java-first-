package Mathlabprograms;

public class Pyramidnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u=1;
		for(int x=1; x<=3;x++)
		{
		for(int y=4;y>=x;y--)
		{
		System.out.print(" ");
		}
		for(int z=1;z<=(2*x-1);z++)
		{
		System.out.print(u);
		u++;
		}
		System.out.println();
		}
	}

}
