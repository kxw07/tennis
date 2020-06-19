import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private int aScore = 0;
    private Map scoresMap;

    public Tennis() {
        scoresMap = new HashMap();
        scoresMap.put(0, "love");
        scoresMap.put(1, "fifteen");
        scoresMap.put(2, "thirty");
        scoresMap.put(3, "forty");
    }

    public String getScores() {
        if (aScore > 0) {
            return scoresMap.get(aScore) + " love";
        }
        return "love all";
    }

    public void aScores() {
        aScore++;
    }
}
