package studio7;

public class HockeyP {

	private static final int LEFT = -1;
	private static final int RIGHT = 1;
	private static final int AMBI = 0;

	private String name;
	private int jersey;
	private int hand;
	private int goals;
	private int assists;
	private int games;
	private int points;

	public HockeyP(String n, int j, int hand) {
		this.name = n;
		this.jersey = j;
		this.hand = hand;
	}

	public void game(int goals, int assists) {
		this.goals = this.goals + goals;
		this.assists = this.assists + assists;
		this.games++;
	}

	public void points() {
		this.points = this.assists + this.goals;
	}

	public String toString() {
		return "Name: " + this.name + " Number: " + this.jersey + " Goals: " + this.goals + " Assists: " + this.assists;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HockeyP p1 = new HockeyP("Cole", 1,LEFT);
		System.out.println(p1.toString());
	}

}
