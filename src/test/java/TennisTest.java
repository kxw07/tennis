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
    public void given_a_score_one_then_return_fifteen_love() {
        aScoresTimes(1);
        Assert.assertEquals(tennis.getScores(), "fifteen love");
    }

    @Test
    public void given_b_score_one_then_return_love_fifteen() {
        bScoresTimes(1);
        Assert.assertEquals(tennis.getScores(), "love fifteen");
    }

    @Test
    public void given_a_and_b_score_one_then_return_fifteen_all() {
        aScoresTimes(1);
        bScoresTimes(1);
        Assert.assertEquals(tennis.getScores(), "fifteen all");
    }

    @Test
    public void given_a_score_two_then_return_thirty_love() {
        aScoresTimes(2);
        Assert.assertEquals(tennis.getScores(), "thirty love");
    }

    @Test
    public void given_a_and_b_score_three_then_return_deuce() {
        aScoresTimes(3);
        bScoresTimes(3);
        Assert.assertEquals(tennis.getScores(), "deuce");
    }

    @Test
    public void given_deuce_when_a_scores_one_then_return_advantage_a() {
        aScoresTimes(3);
        bScoresTimes(3);
        aScoresTimes(1);
        Assert.assertEquals(tennis.getScores(), "advantage a");
    }

    @Test
    public void given_deuce_when_b_scores_one_then_return_advantage_b() {
        aScoresTimes(3);
        bScoresTimes(3);
        bScoresTimes(1);
        Assert.assertEquals(tennis.getScores(), "advantage b");
    }

    @Test
    public void given_deuce_when_a_scores_two_then_return_win_b() {
        aScoresTimes(3);
        bScoresTimes(3);
        aScoresTimes(2);
        Assert.assertEquals(tennis.getScores(), "win a");
    }

    @Test
    public void given_a_scores_four_then_return_win_a() {
        aScoresTimes(4);
        Assert.assertEquals(tennis.getScores(), "win a");
    }

    @Test
    public void given_b_scores_four_then_return_win_b() {
        bScoresTimes(4);
        Assert.assertEquals(tennis.getScores(), "win b");
    }

    @Test
    public void given_deuce_when_a_and_b_score_one_then_return_deuce() {
        aScoresTimes(3);
        bScoresTimes(3);
        aScoresTimes(1);
        bScoresTimes(1);
        Assert.assertEquals(tennis.getScores(), "deuce");
    }

    public void aScoresTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.aScores();
        }
    }

    public void bScoresTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.bScores();
        }
    }
}