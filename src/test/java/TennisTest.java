import org.junit.Assert;
import org.junit.Test;

public class TennisTest {
    @Test
    public void given_init_game_then_return_love_all () {
        Tennis tennis = new Tennis();
        Assert.assertEquals(tennis.getScores(), "love all");
    }

    @Test
    public void given_a_scores_one_then_return_fifteen_love () {
        Tennis tennis = new Tennis();
        tennis.aScores();
        Assert.assertEquals(tennis.getScores(), "fifteen love");
    }

    @Test
    public void given_a_scores_two_then_return_thiry_love () {
        Tennis tennis = new Tennis();
        tennis.aScores();
        tennis.aScores();
        Assert.assertEquals(tennis.getScores(), "thirty love");
    }
}