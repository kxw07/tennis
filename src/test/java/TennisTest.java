import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisTest {
    private Tennis tennis;

    @Before
    public void initTennis() {
        tennis = new Tennis();
    }

    @Test
    public void initGame_when_getScores_then_love_all() {
        Assert.assertEquals(tennis.getScores(), "love all");
    }

    @Test
    public void given_A_score_one_when_getScores_then_fifteen_love () {
        tennis.aScore();
        Assert.assertEquals(tennis.getScores(), "fifteen love");
    }
}