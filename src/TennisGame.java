
public class TennisGame {

	private GameScore score = new GameScore(0, 0);

	public GameScore getGameScore() {
		return score;
	}
	
	public void playerOneWinsPoint() {
		score.incrementPlayerOneScore();
	}

	public void playerTwoWinsPoint() {
		score.incrementPlayerTwoScore();
	}

	public boolean hasPlayer2Won() {
		return true;
	}

}
