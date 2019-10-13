import java.util.HashMap;
import java.util.Map;

public class Tennis {
    int a = 0;

    public String score() {
        if (a == 1) {
            return scoreLookUp(a) + " Love";
        } else if (a == 2) {
            return scoreLookUp(a) + " Love";
        }

        return "Love All";
    }

    public void aScore() {
        a++;
    }

    public String scoreLookUp(int score) {
        Map<Integer, String> scoreMap = new HashMap<Integer, String>();
        scoreMap.put(0, "Love");
        scoreMap.put(1, "Fifteen");
        scoreMap.put(2, "Thirty");

        return scoreMap.get(score);
    }
}
