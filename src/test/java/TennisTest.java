import org.junit.Assert;
import org.junit.Test;

public class TennisTest {
    @Test
    public void given_init_game_then_return_love_all() {
        Tennis tennis = new Tennis();
        Assert.assertEquals("love all", tennis.getScore());
    }

    @Test
    public void given_a_scores_one_then_return_fifteen_all() {
        Tennis tennis = new Tennis();
        tennis.aScores();
        Assert.assertEquals("fifteen love", tennis.getScore());
    }

}