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
            }
            return scoresMap.get(aScore) + " all";
        } else {
            if (aScore >= 3 && bScore >= 3) {
                if (Math.abs(aScore - bScore) == 1) {
                    return aScore > bScore ? "advantage a" : "advantage b";
                } else {
                    return aScore > bScore ? "win a" : "win b";
                }
            }
            return scoresMap.get(aScore) + " " + scoresMap.get(bScore);
        }
    }

    public void aScores() {
        if (aScore == 3 && bScore == 4) {
            bScore--;
        } else {
            aScore++;
        }
    }

    public void bScores() {
        if (aScore == 4 && bScore == 3) {
            aScore--;
        } else {
            bScore++;
        }
    }
}
