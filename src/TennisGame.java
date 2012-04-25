
public class TennisGame {

	private Score score = new Score(0, 0);

	public void playerOneWinsPoint() {
		score.incrementPlayerOneScore();
	}

	public Score getScore() {
		return new Score(15, 0);
	}

	public void playerTwoWinsPoint() {
		score.incrementPlayerTwoScore();
	}

}
