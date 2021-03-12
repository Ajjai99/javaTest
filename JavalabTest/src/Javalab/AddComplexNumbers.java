package Javalab;


public class AddComplexNumbers {

	    double real;
	    double imag;

	    public AddComplexNumbers(double real, double imag) {
	        this.real = real;
	        this.imag = imag;
	    }

	    public static void main(String[] args)
	    {
	        AddComplexNumbers n1 = new AddComplexNumbers(2.3, 4.5),
	                n2 = new AddComplexNumbers(3.4, 5.0),
	                temp;

	        temp = add(n1, n2);

	        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
	    }

	    public static AddComplexNumbers add(AddComplexNumbers n1, AddComplexNumbers n2)
	    {
	        AddComplexNumbers temp = new AddComplexNumbers(0.0, 0.0);

	        temp.real = n1.real + n2.real;
	        temp.imag = n1.imag + n2.imag;

	        return(temp);
	    }
	}