package studio7;

public class Die {
	private int numSides;

	public Die(int n) {
		this.numSides = n;
	}

	public int roll() {
		return (int) (Math.random() * (this.numSides)+1);
	}
	public static void main(String args[]) {
		Die die = new Die(1);
		System.out.println(die.roll());
	}
}
