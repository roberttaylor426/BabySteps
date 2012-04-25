
public class TennisGame {

	private Score score = new Score(0, 0);

	public void playerOneWinsPoint() {
		score.incrementPlayerOneScore();
	}

	public Score getScore() {
		return score;
	}

	public void playerTwoWinsPoint() {
		score.incrementPlayerTwoScore();
	}

}
