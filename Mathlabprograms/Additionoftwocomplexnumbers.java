package Mathlabprograms;

public class Additionoftwocomplexnumbers {
	

	    double real;
	    double imag;

	    public Additionoftwocomplexnumbers(double real, double imag) {
	        this.real = real;
	        this.imag = imag;
	    }

	    public static void main(String[] args) {
	        Additionoftwocomplexnumbers n1 = new Additionoftwocomplexnumbers(2, 4),
	                n2 = new Additionoftwocomplexnumbers(3, 5),
	                temp;

	        temp = add(n1, n2);
	      
	        

	        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
	    }

	    public static Additionoftwocomplexnumbers add(Additionoftwocomplexnumbers n1, Additionoftwocomplexnumbers n2)
	    {
	        Additionoftwocomplexnumbers temp = new Additionoftwocomplexnumbers(0.0, 0.0);

	        temp.real = n1.real + n2.real;
	        temp.imag = n1.imag + n2.imag;

	        return(temp);
	    }
	
}
