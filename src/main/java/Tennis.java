import java.util.HashMap;
import java.util.Map;

public class Tennis {
    int a = 0;
    int b = 0;

    public String score() {
        if (a > 0) {
            return scoreLookUp(a) + " Love";
        }

        if (b > 0) {
            return "Love " + scoreLookUp(b);
        }

        return "Love All";
    }

    public void aScore() {
        a++;
    }

    public void bScore() {
        b++;
    }

    public String scoreLookUp(int score) {
        Map<Integer, String> scoreMap = new HashMap<Integer, String>();
        scoreMap.put(0, "Love");
        scoreMap.put(1, "Fifteen");
        scoreMap.put(2, "Thirty");
        scoreMap.put(3, "Forty");

        return scoreMap.get(score);
    }

}
