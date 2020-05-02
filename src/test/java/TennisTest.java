import org.junit.Assert;
import org.junit.Test;

public class TennisTest {
    @Test
    public void initGame_when_getScores_then_love_all() {
        Tennis tennis = new Tennis();
        Assert.assertEquals(tennis.getScores(), "love all");
    }

    @Test
    public void given_A_score_one_when_getScores_then_fifteen_love () {
        Tennis tennis = new Tennis();
        tennis.aScore();
        Assert.assertEquals(tennis.getScores(), "fifteen love");
    }
}