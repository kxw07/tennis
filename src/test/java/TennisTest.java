import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.tools.tree.AssignShiftLeftExpression;

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

    @Test
    public void given_b_scores_one_then_return_love_fifteen() {
        bScores(1);
        Assert.assertEquals("love fifteen", tennis.getScores());
    }

    @Test
    public void given_a_and_b_scores_one_then_return_fifteen_all() {
        aScores(1);
        bScores(1);
        Assert.assertEquals("fifteen all", tennis.getScores());
    }

    @Test
    public void given_a_and_b_scores_three_then_return_deuce() {
        aScores(3);
        bScores(3);
        Assert.assertEquals("deuce", tennis.getScores());
    }

    private void aScores(int times) {
        for (int i = 0; i < times; i++) {
            tennis.aScores();
        }
    }

    private void bScores(int times) {
        for (int i = 0; i < times; i++) {
            tennis.bScores();
        }
    }
}