
public class IndividualPlayerScore {

	private int score;
	
	public int getScore() {
		return score;
	}

	void method(Score score) {
		if (score.playerOneScore == 15)
			score.playerOneScore = 30;
		else
			score.playerOneScore = 15;
	}

	
}
