
public class Score {

	private int playerOneScore;
	private int playerTwoScore;

	public Score(int playerOneScore, int playerTwoScore) {
		this.playerOneScore = playerOneScore;
		this.playerTwoScore = playerTwoScore;
	}
	public void setPlayerOneScore(int playerOneScore) {
		this.playerOneScore = playerOneScore;
	}
	
	public void setPlayerTwoScore(int playerTwoScore) {
		this.playerTwoScore = playerTwoScore;
	}

	public boolean equals(Object o) {
		
		if (!(o instanceof Score))
			return false;
		
		Score targetScore = (Score)o;
		return targetScore.playerOneScore == playerOneScore && playerTwoScore == targetScore.playerTwoScore;
	}
	
	public void incrementPlayerOneScore() {
		playerOneScore = 15;
		
	}
	public void incrementPlayerTwoScore() {
		playerTwoScore = 15;
	}
}
