package studio7;

public class Complex {
	private double real;
	private double imag;
	
	public Complex(double r, double i) {
		this.real=r;
		this.imag=i;
	}
	public Complex sum(Complex other) {
		Complex sum = new Complex(this.real+other.real, this.imag+other.imag);
		return sum;
	}
	public Complex product(Complex other) {
		double a = this.real;
		double b = this.imag;
		double c = other.real;
		double d = other.imag;
		return new Complex((a*c-b*d), (a*b+b*c));
	}
	public void print() {
		System.out.println(this.real + "+" + this.imag + "i");
	}


	public static void main(String[] args) {
		Complex c1 = new Complex (10, 3);
		Complex c2 = new Complex (3, 4);
		Complex c3 = c1.product(c2);
		c3.print();
	

	}

}
