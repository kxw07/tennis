import org.junit.Assert;
import org.junit.Test;

public class TennisTest {
    @Test
    public void game_start_then_love_all() {
        Tennis tennis = new Tennis();
        Assert.assertEquals(tennis.score(), "Love All");
    }

}