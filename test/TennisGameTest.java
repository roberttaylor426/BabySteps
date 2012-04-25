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
		Score expectedScore = new Score(15, 0);
		
		tennisGame.playerOneWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(expectedScore));
	}

	@Test
	public void whenPlayer2Wins_thenScoreShouldBe0_15() {
		Score expectedScore = new Score(0, 15);
		
		tennisGame.playerTwoWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(expectedScore));
	}
	
	@Test
	public void whenPlayer1Wins2Points_thenScoreShouldBe30_0() {
		Score expectedScore = new Score(30, 0);
		
		tennisGame.playerOneWinsPoint();
		tennisGame.playerOneWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(expectedScore));
	}
	
	@Test
	public void whenPlayer2Wins2Points_thenScoreShouldBe0_30() {
		Score expectedScore = new Score(0, 30);
		
		tennisGame.playerTwoWinsPoint();
		tennisGame.playerTwoWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(expectedScore));
	}
}
