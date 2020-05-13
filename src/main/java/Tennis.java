public class Tennis {
    private int a_score = 0;

    public String getScores() {
        if (a_score > 0) {
            return "fifteen love";
        } else {
            return "love all";
        }
    }

    public void aScores() {
        a_score++;
    }
}
