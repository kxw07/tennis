public class Tennis {

    private int aScore = 0;

    public String getScores() {
        if (aScore > 0) {
            return "fifteen love";
        }
        return "love all";
    }

    public void aScores() {
        aScore++;
    }
}
