
public class FootballPlayerTest {

	public static void main(String[] args) {
		FootballPlayer hagi = new FootballPlayer();
		hagi.no = 10;
		hagi.name = "George Hagi";
		hagi.minutes = 0;
		hagi.inPlay = true;
		hagi.numberOfGoals = 0;
		hagi.play(90);
		hagi.score();
		hagi.score();
		System.out.println("Number of goals Hagi scored: "
		+ hagi.numberOfGoals); // number of goals 2
		System.out.println("Hagi played totally " + hagi.minutes
		+ " minutes so far."); // minutes is 90

	}

}
