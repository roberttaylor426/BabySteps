
public class GameScore {

	private final PlayerScore playerOneScore;
	private final PlayerScore playerTwoScore;

	public GameScore(int playerOneScore, int playerTwoScore) {
		this.playerOneScore = new PlayerScore(playerOneScore);
		this.playerTwoScore = new PlayerScore(playerTwoScore);
	}

	public boolean equals(Object o) {
		if (!(o instanceof GameScore))
			return false;
		
		GameScore targetScore = (GameScore)o;
		return targetScore.playerOneScore.equals(playerOneScore) && targetScore.playerTwoScore.equals(playerTwoScore);
	}
	
	public void incrementPlayerOneScore() {
		playerOneScore.incrementScore();
		
	}
	public void incrementPlayerTwoScore() {
		playerTwoScore.incrementScore();
	}
}
