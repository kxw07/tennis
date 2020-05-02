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
        aScores(1);
        Assert.assertEquals(tennis.getScores(), "fifteen love");
    }

    @Test
    public void given_A_score_two_when_getScores_then_thirty_love () {
        aScores(2);
        Assert.assertEquals(tennis.getScores(), "thirty love");
    }

    @Test
    public void given_A_score_three_when_getScores_then_forty_love () {
        aScores(3);
        Assert.assertEquals(tennis.getScores(), "forty love");
    }

    public void aScores(int times) {
        for (int i=0; i<times; i++) {
            tennis.aScore();
        }
    }
}