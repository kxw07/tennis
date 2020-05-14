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

    public String getScores() {
        if (a_score == b_score) {
            if (a_score == 3) {
                return "deuce";
            } else {
                return scoreMap.get(a_score) + " all";
            }
        } else {
            if (a_score > 3 || b_score > 3) {
                if (Math.abs(a_score - b_score) == 1) {
                    return a_score > b_score ? "advantage a" : "advantage b";
                } else {
                    return a_score > b_score ? "win a" : "win b";
                }
            } else {
                return scoreMap.get(a_score) + " " + scoreMap.get(b_score);
            }
        }
    }

    public void aScores() {
        a_score++;
    }

    public void bScores() {
        if ((a_score >= 3 && b_score >= 3) && (a_score > b_score)) {
            a_score--;
        } else {
            b_score++;
        }
    }
}
