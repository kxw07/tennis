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
            if (a >= 3) {
                return "Deuce";
            } else {
                return scoreLookUp(a) + " All";
            }
        } else {
            if (Math.abs(a - b) == 1) {
                if (a > 3 ){
                    return "A Advantage";
                } else if (b > 3) {
                    return "B Advantage";
                }
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

}
