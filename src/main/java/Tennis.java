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
        if (a_score != b_score) {
            if (a_score >= 3 && b_score >= 3) {
                if (a_score > 4 || b_score > 4) {
                    return getWinner();
                }

                return a_score > b_score? "advantage a":"advantage b";
            }

            if (a_score == 4 || b_score == 4) {
                return getWinner();
            }

            return scoreMap.get(a_score) + " " + scoreMap.get(b_score);
        } else {
            if (a_score == 3) {
                return "deuce";
            } else {
                return scoreMap.get(a_score) + " " + "all";
            }
        }
    }

    public String getWinner() {
        return a_score > b_score ? "win a":"win b";
    }

    public void aScore() {
        a_score += 1;
    }

    public void bScore() {
        b_score += 1;
    }
}
