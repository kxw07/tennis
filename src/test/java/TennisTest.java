import org.junit.Assert;
import org.junit.Test;

public class TennisTest {
    @Test
    public void game_start_then_love_all() {
        Tennis tennis = new Tennis();
        Assert.assertEquals(tennis.score(), "Love All");
    }

    @Test
    public void when_a_score_one_then_fifteen_love() {
        Tennis tennis = new Tennis();
        tennis.aScore();
        Assert.assertEquals(tennis.score(), "Fifteen Love");
    }
}