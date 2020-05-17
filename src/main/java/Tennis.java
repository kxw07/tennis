import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private int a_score = 0;
    private int b_score = 0;
    private final Map scoreMap;

    public Tennis() {
        scoreMap = new HashMap<Integer, String>();
        scoreMap.put(0, "love");
        scoreMap.put(1, "fifteen");
        scoreMap.put(2, "thirty");
        scoreMap.put(3, "forty");
    }

    public String getScore() {
        if (a_score == b_score) {
            return scoreMap.get(a_score) + " all";
        } else {
            return scoreMap.get(a_score) + " " + scoreMap.get(b_score);
        }
    }

    public void aScores() {
        a_score++;
    }

    public void bScores() {
        b_score++;
    }
}
