
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
		if (playerOneScore == 15)
			playerOneScore = 30;
		else
			playerOneScore = 15;
		
	}
	public void incrementPlayerTwoScore() {
		
		if (playerTwoScore == 15)
			playerTwoScore = 30;
		else
			playerTwoScore = 15;
	}
}
