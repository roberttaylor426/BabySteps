import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class TennisGameTest {

	private TennisGame tennisGame;
	
	@Before
	public void setUp() {
		tennisGame = new TennisGame();
	}
	
	@Test
	public void whenPlayer1Wins_thenScoreShouldBe15_0() {
		Score score = new Score(15, 0);
		
		tennisGame.playerOneWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(score));
	}

	@Test
	public void whenPlayer2Wins_thenScoreShouldBe0_15() {
		Score score = new Score(0, 15);
		
		tennisGame.playerTwoWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(score));
	}
}
