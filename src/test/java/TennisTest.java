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
    public void given_init_game_then_return_love_all() {
        Assert.assertEquals(tennis.getScores(), "love all");
    }

    @Test
    public void given_a_score_one_then_return_fifteen_love () {
        aScoreTimes(1);
        Assert.assertEquals(tennis.getScores(), "fifteen love");
    }

    @Test
    public void given_a_score_two_then_return_thirty_love () {
        aScoreTimes(2);
        Assert.assertEquals(tennis.getScores(), "thirty love");
    }

    @Test
    public void given_a_score_three_then_return_forty_love () {
        aScoreTimes(3);
        Assert.assertEquals(tennis.getScores(), "forty love");
    }

    @Test
    public void given_b_score_one_then_return_love_fifteen () {
        bScoreTimes(1);
        Assert.assertEquals(tennis.getScores(), "love fifteen");
    }

    @Test
    public void given_a_and_b_score_one_then_return_fifteen_all () {
        aScoreTimes(1);
        bScoreTimes(1);
        Assert.assertEquals(tennis.getScores(), "fifteen all");
    }

    @Test
    public void given_a_and_b_score_two_then_return_thirty_all () {
        aScoreTimes(2);
        bScoreTimes(2);
        Assert.assertEquals(tennis.getScores(), "thirty all");
    }

    @Test
    public void given_a_and_b_score_three_then_return_deuce () {
        aScoreTimes(3);
        bScoreTimes(3);
        Assert.assertEquals(tennis.getScores(), "deuce");
    }

    @Test
    public void given_deuce_when_a_score_then_return_advantage_a () {
        aScoreTimes(3);
        bScoreTimes(3);
        aScoreTimes(1);
        Assert.assertEquals(tennis.getScores(), "advantage a");
    }

    @Test
    public void given_deuce_when_b_score_then_return_advantage_b () {
        aScoreTimes(3);
        bScoreTimes(3);
        bScoreTimes(1);
        Assert.assertEquals(tennis.getScores(), "advantage b");
    }

    @Test
    public void given_deuce_when_b_score_two_then_return_win_b () {
        aScoreTimes(3);
        bScoreTimes(3);
        bScoreTimes(2);
        Assert.assertEquals(tennis.getScores(), "win b");
    }

    @Test
    public void given_deuce_when_a_score_two_then_return_win_a () {
        aScoreTimes(3);
        bScoreTimes(3);
        aScoreTimes(2);
        Assert.assertEquals(tennis.getScores(), "win a");
    }

    @Test
    public void given_a_score_four_then_return_win_a () {
        aScoreTimes(4);
        Assert.assertEquals(tennis.getScores(), "win a");
    }

    @Test
    public void given_b_score_four_then_return_win_b () {
        bScoreTimes(4);
        Assert.assertEquals(tennis.getScores(), "win b");
    }

    @Test
    public void given_deuce_when_a_score_and_b_score_then_return_deuce () {
        aScoreTimes(3);
        bScoreTimes(3);
        aScoreTimes(1);
        bScoreTimes(1);
        Assert.assertEquals(tennis.getScores(), "deuce");
    }

    public void aScoreTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.aScore();
        }
    }

    public void bScoreTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.bScore();
        }
    }
}