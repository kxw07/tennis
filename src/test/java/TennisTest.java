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

    @Test
    public void given_B_score_one_when_getScores_then_love_fifteen () {
        bScores(1);
        Assert.assertEquals(tennis.getScores(), "love fifteen");
    }

    @Test
    public void given_B_score_two_when_getScores_then_love_thirty () {
        bScores(2);
        Assert.assertEquals(tennis.getScores(), "love thirty");
    }

    @Test
    public void given_B_score_three_when_getScores_then_love_forty () {
        bScores(3);
        Assert.assertEquals(tennis.getScores(), "love forty");
    }

    @Test
    public void give_A_score_one_B_score_one_when_getScores_then_fifteen_all () {
        aScores(1);
        bScores(1);
        Assert.assertEquals(tennis.getScores(), "fifteen all");
    }

    @Test
    public void give_A_score_two_B_score_two_when_getScores_then_thirty_all () {
        aScores(2);
        bScores(2);
        Assert.assertEquals(tennis.getScores(), "thirty all");
    }

    @Test
    public void give_A_score_one_B_score_two_when_getScores_then_fifteen_thirty () {
        aScores(1);
        bScores(2);
        Assert.assertEquals(tennis.getScores(), "fifteen thirty");
    }

    public void aScores(int times) {
        for (int i=0; i<times; i++) {
            tennis.aScore();
        }
    }

    public void bScores(int times) {
        for (int i=0; i<times; i++) {
            tennis.bScore();
        }
    }
}