
public class TennisGame {

	private OldScore score = new OldScore(0, 0);

	public void playerOneWinsPoint() {
		score.incrementPlayerOneScore();
	}

	public OldScore getScore() {
		return score;
	}

	public void playerTwoWinsPoint() {
		score.incrementPlayerTwoScore();
	}

}
