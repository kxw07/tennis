import org.junit.Assert;
import org.junit.Test;

public class TennisTest {
    @Test
    public void initGame() {
        Tennis tennis = new Tennis();
        Assert.assertEquals(tennis.getScores(), "Zero Love");
    }
}