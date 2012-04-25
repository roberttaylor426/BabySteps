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
		OldScore expectedScore = new OldScore(15, 0);
		
		tennisGame.playerOneWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(expectedScore));
	}

	@Test
	public void whenPlayer2Wins_thenScoreShouldBe0_15() {
		OldScore expectedScore = new OldScore(0, 15);
		
		tennisGame.playerTwoWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(expectedScore));
	}
	
	@Test
	public void whenPlayer1Wins2Points_thenScoreShouldBe30_0() {
		OldScore expectedScore = new OldScore(30, 0);
		
		tennisGame.playerOneWinsPoint();
		tennisGame.playerOneWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(expectedScore));
	}
	
	@Test
	public void whenPlayer2Wins2Points_thenScoreShouldBe0_30() {
		OldScore expectedScore = new OldScore(0, 30);
		
		tennisGame.playerTwoWinsPoint();
		tennisGame.playerTwoWinsPoint();
		
		assertThat(tennisGame.getScore(), equalTo(expectedScore));
	}
}
