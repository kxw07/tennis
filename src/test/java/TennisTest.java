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
    public void given_init_game_then_return_love_all () {
        Assert.assertEquals("love all", tennis.getScores());
    }

    @Test
    public void given_a_scores_one_then_return_fifteen_love () {
        aScoresTimes(1);
        Assert.assertEquals("fifteen love", tennis.getScores());
    }

    @Test
    public void given_a_scores_two_then_return_thiry_love () {
        aScoresTimes(2);
        Assert.assertEquals("thirty love", tennis.getScores());
    }

    @Test
    public void given_b_scores_one_then_return_love_fifteen () {
        bScoresTimes(1);
        Assert.assertEquals("love fifteen", tennis.getScores());
    }

    @Test
    public void given_a_and_b_scores_one_then_return_fifteen_all () {
        aScoresTimes(1);
        bScoresTimes(1);
        Assert.assertEquals("fifteen all", tennis.getScores());
    }

    @Test
    public void given_a_and_b_scores_three_then_return_deuce () {
        aScoresTimes(3);
        bScoresTimes(3);
        Assert.assertEquals("deuce", tennis.getScores() );
    }

    @Test
    public void given_deuce_when_a_scores_one_then_return_advantage_a () {
        aScoresTimes(3);
        bScoresTimes(3);
        aScoresTimes(1);
        Assert.assertEquals("advantage a", tennis.getScores());
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