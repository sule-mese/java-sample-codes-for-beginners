
public class FootballPlayer {

	int no;
	String name;
	int minutes;
	boolean inPlay;
	int numberOfGoals;
	
	public void play(int minutesToPlay)
	{
		minutes=minutesToPlay;
	}
	
	public void score()
	{
	   numberOfGoals+=1;
	}
}
