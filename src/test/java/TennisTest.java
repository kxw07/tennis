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
    public void when_a_score_one_times_then_fifteen_love() {
        aScoreMultiTimes(1);
        Assert.assertEquals(tennis.score(), "Fifteen Love");
    }

    @Test
    public void when_a_score_two_times_then_thirty_love() {
        aScoreMultiTimes(2);
        Assert.assertEquals(tennis.score(), "Thirty Love");
    }

    @Test
    public void when_a_score_three_times_then_forty_love() {
        aScoreMultiTimes(3);
        Assert.assertEquals(tennis.score(), "Forty Love");
    }

    @Test
    public void when_b_score_one_times_then_love_fifteen() {
        bScoreMultiTimes(1);
        Assert.assertEquals(tennis.score(), "Love Fifteen");
    }

    @Test
    public void when_b_score_two_times_then_love_fifteen() {
        bScoreMultiTimes(2);
        Assert.assertEquals(tennis.score(), "Love Thirty");
    }

    @Test
    public void when_b_score_three_times_then_love_fifteen() {
        bScoreMultiTimes(3);
        Assert.assertEquals(tennis.score(), "Love Forty");
    }

    public void aScoreMultiTimes(int times) {
        for (int idx = 0; idx < times; idx++) {
            tennis.aScore();
        }
    }

    public void bScoreMultiTimes(int times) {
        for (int idx = 0; idx < times; idx++) {
            tennis.bScore();
        }
    }
}