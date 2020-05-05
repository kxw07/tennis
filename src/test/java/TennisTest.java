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
        tennis.aScores();
        Assert.assertEquals(tennis.getScores(), "fifteen love");
    }

    @Test
    public void given_a_scores_two_then_return_thirty_love () {
        tennis.aScores();
        tennis.aScores();
        Assert.assertEquals(tennis.getScores(), "thirty love");
    }
}