package studio7;

public class Fraction {
	private int num;
	private int denom;

	public Fraction(int n, int d) {
		this.num = n;
		this.denom = d;
	}

	public Fraction sum(Fraction other) {
		int tempNum1 = this.num * other.denom;
		int tempNum2 = this.denom * other.num;
		int tempdenom = this.denom * other.denom;
		Fraction sum = new Fraction(tempNum1 + tempNum2, tempdenom);
		return sum;
	}
	public void print() {	
		System.out.println(this.num + "/" + this.denom);
	}
	public Fraction prod(Fraction other) {
		int tempdenom = this.denom * other.denom;
		int tempnum = this.num * other.num;
		Fraction prod = new Fraction(tempnum, tempdenom);
		return prod;
	}

	public Fraction recip() {
		Fraction recip = new Fraction(this.denom, this.num);
		return recip;
	}

	public Fraction simplify() {
		int tempnum = this.num, tempdenom = this.denom;
		for (int i = 1; i < this.num; i++) {
			if (num % i == 0 && denom % i == 0) {
				tempnum = num / i;
				tempdenom = denom / i;
			}
		}
		Fraction reduce = new Fraction(tempnum, tempdenom);
		return reduce;
	}
public static void main(String args[]) {
	Fraction f1 = new Fraction(2,4);
	Fraction f2 = new Fraction(5,7);
	Fraction f3 = f1.sum(f2);
	f3 = f3.simplify();
	f3.print();
	
}
}
