import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisTest {
    private Tennis tennis;

    @Before
    public void setup() {
        tennis = new Tennis();
    }

    @Test
    public void when_game_start_then_love_all() {
        Assert.assertEquals(tennis.score(), "Love All");
    }

    @Test
    public void when_a_score_one_then_fifteen_love() {
        tennis.aScore();
        Assert.assertEquals(tennis.score(), "Fifteen Love");
    }

    @Test
    public void when_a_score_two_then_thirty_love() {
        tennis.aScore();
        tennis.aScore();
        Assert.assertEquals(tennis.score(), "Thirty Love");
    }
}