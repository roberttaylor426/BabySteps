
public class PlayerScore {

	private int score;
	
	public PlayerScore(int playerOneScore) {
		score = playerOneScore;
	}

	public int getScore() {
		return score;
	}

	void incrementScore() {
		if (score == 15)
			score = 30;
		else if (score ==  30)
			score = 40;
		else 
			score = 15;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayerScore other = (PlayerScore) obj;
		if (score != other.score)
			return false;
		return true;
	}

	
}
