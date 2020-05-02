public class Tennis {
    private int a_score = 0;

    public String getScores() {
        if (a_score == 1) {
            return "fifteen love";
        } else if (a_score == 2) {
            return "thirty love";
        }

        return "love all";
    }

    public void aScore() {
        a_score += 1;
    }
}
