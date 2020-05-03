public class Tennis {

    private int a_score = 0;

    public String getScores() {
        if (a_score > 0) {
            return "fifteen love";
        }

        return "love all";
    }

    public void aScore() {
        a_score++;
    }
}
