
public class Score {

	private final IndividualPlayerScore iPlayerOneScore;
	private final IndividualPlayerScore iPlayerTwoScore;

	public Score(int playerOneScore, int playerTwoScore) {
		this.iPlayerOneScore = new IndividualPlayerScore(playerOneScore);
		this.iPlayerTwoScore = new IndividualPlayerScore(playerTwoScore);
	}
	

	public boolean equals(Object o) {
		
		if (!(o instanceof Score))
			return false;
		
		Score targetScore = (Score)o;
		return targetScore.iPlayerOneScore.equals(iPlayerOneScore) && targetScore.iPlayerTwoScore.equals(iPlayerTwoScore);
	}
	
	public void incrementPlayerOneScore() {
		iPlayerOneScore.method();
		
	}
	public void incrementPlayerTwoScore() {
		iPlayerTwoScore.method();
	}
}
