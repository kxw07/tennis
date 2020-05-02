import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private int a_score = 0;
    private int b_score = 0;

    Map scoreMap = new HashMap<Integer, String>();

    public Tennis() {
        scoreMap.put(0, "love");
        scoreMap.put(1, "fifteen");
        scoreMap.put(2, "thirty");
        scoreMap.put(3, "forty");
    }

    public String getScores() {
        if (a_score > 0 || b_score > 0) {
            return scoreMap.get(a_score) + " " + scoreMap.get(b_score);
        }

        return "love all";
    }

    public void aScore() {
        a_score += 1;
    }

    public void bScore() {
        b_score += 1;
    }
}
