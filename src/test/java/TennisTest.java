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
    public void given_a_scores_two_then_return_thirty_love () {
        aScoresTimes(2);
        Assert.assertEquals("thirty love", tennis.getScores());
    }

    private void aScoresTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.aScores();
        }
    }
}