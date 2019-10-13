public class Tennis {
    int a = 0;

    public String score() {
        if (a == 1) {
            return "Fifteen Love";
        } else if (a == 2) {
            return "Thirty Love";
        }

        return "Love All";
    }

    public void aScore() {
        a++;
    }
}
