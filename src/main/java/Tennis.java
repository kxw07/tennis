import java.util.HashMap;
import java.util.Map;

public class Tennis {
    int a = 0;
    int b = 0;
    private Map<Integer, String> scoreMap;

    public Tennis() {
        scoreMap = new HashMap<Integer, String>();
        scoreMap.put(0, "Love");
        scoreMap.put(1, "Fifteen");
        scoreMap.put(2, "Thirty");
        scoreMap.put(3, "Forty");
    }

    public String score() {
        if (a == b) {
            return getSameScore();
        } else {
            if ((a > 3 || b > 3)) {
                return Math.abs(a - b) == 1 ? getWhoAdvantage() : getWhoWins();
            }

            return scoreLookUp(a) + " " + scoreLookUp(b);
        }
    }

    public void aScore() {
        a++;
    }

    public void bScore() {
        b++;
    }

    public String scoreLookUp(int score) {
        return scoreMap.get(score);
    }

    public String getSameScore() {
        if (a >= 3) {
            return "Deuce";
        } else {
            return scoreLookUp(a) + " All";
        }
    }

    public String getWhoAdvantage() {
        if (a > 3) {
            return "A Advantage";
        } else {
            return "B Advantage";
        }
    }

    public String getWhoWins() {
        if (a > 3) {
            return "A Wins";
        } else {
            return "B Wins";
        }
    }
}
