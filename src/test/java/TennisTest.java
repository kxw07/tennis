import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisTest {

    private Tennis tennis;

    @Before
    public void initGame() {
        tennis = new Tennis();
    }

    @Test
    public void init_game_then_return_love_all() {
        Assert.assertEquals("love all", tennis.getScores());
    }

    @Test
    public void given_a_scores_one_then_return_fifteen_love() {
        aScores(1);
        Assert.assertEquals("fifteen love", tennis.getScores());
    }

    @Test
    public void given_a_scores_two_then_return_thirty_love() {
        aScores(2);
        Assert.assertEquals("thirty love", tennis.getScores());
    }

    private void aScores(int times) {
        for (int i = 0; i < times; i++) {
            tennis.aScores();
        }
    }
}