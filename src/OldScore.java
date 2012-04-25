
public class OldScore {

	private final Score playerOneScore;
	private final Score playerTwoScore;

	public OldScore(int playerOneScore, int playerTwoScore) {
		this.playerOneScore = new Score(playerOneScore);
		this.playerTwoScore = new Score(playerTwoScore);
	}

	public boolean equals(Object o) {
		if (!(o instanceof OldScore))
			return false;
		
		OldScore targetScore = (OldScore)o;
		return targetScore.playerOneScore.equals(playerOneScore) && targetScore.playerTwoScore.equals(playerTwoScore);
	}
	
	public void incrementPlayerOneScore() {
		playerOneScore.incrementScore();
		
	}
	public void incrementPlayerTwoScore() {
		playerTwoScore.incrementScore();
	}
}
