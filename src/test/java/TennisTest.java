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
        Assert.assertEquals("Love All", tennis.score());
    }

    @Test
    public void when_a_score_one_times_then_fifteen_love() {
        aScoreMultiTimes(1);
        Assert.assertEquals("Fifteen Love", tennis.score());
    }

    @Test
    public void when_a_score_two_times_then_thirty_love() {
        aScoreMultiTimes(2);
        Assert.assertEquals("Thirty Love", tennis.score());
    }

    @Test
    public void when_a_score_three_times_then_forty_love() {
        aScoreMultiTimes(3);
        Assert.assertEquals("Forty Love", tennis.score());
    }

    @Test
    public void when_b_score_one_times_then_love_fifteen() {
        bScoreMultiTimes(1);
        Assert.assertEquals("Love Fifteen", tennis.score());
    }

    @Test
    public void when_b_score_two_times_then_love_thirty() {
        bScoreMultiTimes(2);
        Assert.assertEquals("Love Thirty", tennis.score());
    }

    @Test
    public void when_b_score_three_times_then_love_forty() {
        bScoreMultiTimes(3);
        Assert.assertEquals("Love Forty", tennis.score());
    }

    @Test
    public void when_a_score_one_time_b_score_one_times_then_fifteen_all () {
        aScoreMultiTimes(1);
        bScoreMultiTimes(1);
        Assert.assertEquals("Fifteen All", tennis.score());
    }

    @Test
    public void when_a_score_two_time_b_score_two_times_then_thirty_all () {
        aScoreMultiTimes(2);
        bScoreMultiTimes(2);
        Assert.assertEquals("Thirty All", tennis.score());
    }

    @Test
    public void when_a_score_three_time_b_score_three_times_then_deuce () {
        aScoreMultiTimes(3);
        bScoreMultiTimes(3);
        Assert.assertEquals("Deuce", tennis.score());
    }

    @Test
    public void when_a_score_four_times_b_score_three_times_then_a_advantage() {
        aScoreMultiTimes(4);
        bScoreMultiTimes(3);
        Assert.assertEquals("A Advantage", tennis.score());
    }

    @Test
    public void when_a_score_three_times_b_score_four_times_then_a_advantage() {
        aScoreMultiTimes(3);
        bScoreMultiTimes(4);
        Assert.assertEquals("B Advantage", tennis.score());
    }

    @Test
    public void when_a_score_five_times_b_score_three_times_then_a_win() {
        aScoreMultiTimes(5);
        bScoreMultiTimes(3);
        Assert.assertEquals("A Wins", tennis.score());
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