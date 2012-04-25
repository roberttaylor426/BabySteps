
public class Score {

	private final IndividualPlayerScore iPlayerOneScore;
	private int playerTwoScore;

	public Score(int playerOneScore, int playerTwoScore) {
		this.iPlayerOneScore = new IndividualPlayerScore(playerOneScore);
		this.playerTwoScore = playerTwoScore;
	}
	
	public void setPlayerTwoScore(int playerTwoScore) {
		this.playerTwoScore = playerTwoScore;
	}

	public boolean equals(Object o) {
		
		if (!(o instanceof Score))
			return false;
		
		Score targetScore = (Score)o;
		return targetScore.iPlayerOneScore.equals(iPlayerOneScore) && playerTwoScore == targetScore.playerTwoScore;
	}
	
	public void incrementPlayerOneScore() {
		iPlayerOneScore.method();
		
	}
	public void incrementPlayerTwoScore() {
		
		if (playerTwoScore == 15)
			playerTwoScore = 30;
		else
			playerTwoScore = 15;
	}
}
