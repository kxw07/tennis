public class Tennis {
    int a = 0;

    public String score() {
        if (a > 0) {
            return "Fifteen Love";
        }
        return "Love All";
    }

    public void aScore() {
        a++;
    }
}
