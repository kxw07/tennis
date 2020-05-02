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
            if (a_score >= 4 || b_score >= 4) {
                if (Math.abs(a_score - b_score) == 1) {
                    return getWhoAdvantage();
                }

                return getWhoWinner();
            }

            return scoreMap.get(a_score) + " " + scoreMap.get(b_score);
        } else {
            return a_score == 3?"deuce":scoreMap.get(a_score) + " " + "all";
        }
    }

    public String getWhoWinner() {
        return a_score > b_score ? "win a":"win b";
    }

    public String getWhoAdvantage() {
        return a_score > b_score? "advantage a":"advantage b";
    }

    public void aScore() {
        a_score += 1;
    }

    public void bScore() {
        b_score += 1;
    }
}
