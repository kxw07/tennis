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
        Assert.assertEquals(tennis.getScores(), "love all");
    }

    @Test
    public void given_a_scores_one_then_return_fifteen_love () {
        aScoresTimes(1);
        Assert.assertEquals(tennis.getScores(), "fifteen love");
    }

    @Test
    public void given_a_scores_two_then_return_thirty_love () {
        aScoresTimes(2);
        Assert.assertEquals(tennis.getScores(), "thirty love");
    }

    @Test
    public void given_b_scores_one_then_return_love_fifteen () {
        bScoresTimes(1);
        Assert.assertEquals(tennis.getScores(), "love fifteen");
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