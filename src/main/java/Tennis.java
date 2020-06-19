import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private int aScore = 0;
    private Map scoresMap;
    private int bScore = 0;

    public Tennis() {
        scoresMap = new HashMap();
        scoresMap.put(0, "love");
        scoresMap.put(1, "fifteen");
        scoresMap.put(2, "thirty");
        scoresMap.put(3, "forty");
    }

    public String getScores() {
        if (aScore == bScore) {
            if (aScore == 3) {
                return "deuce";
            } else {
                return scoresMap.get(aScore) + " all";
            }
        } else {
            if (aScore >= 3 && bScore >= 3) {
                return aScore > bScore ? "advantage a" : "advantage b";
            }
            return scoresMap.get(aScore) + " " + scoresMap.get(bScore);
        }
    }

    public void aScores() {
        aScore++;
    }

    public void bScores() {
        bScore++;
    }
}
