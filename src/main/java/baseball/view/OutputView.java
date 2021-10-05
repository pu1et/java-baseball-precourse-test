package baseball.view;

public class OutputView {
    private static final String STRIKE_MSG = "스트라이크";
    private static final String BALL_MSG = "볼";
    private static final String NOTHING_MSG = "낫싱";
    private static final String WINNING_MSG = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";

    public static void printStringAndBall(int strikeResult, int ballResult) {
        if (strikeResult != 0 && ballResult != 0) {
            System.out.println(strikeResult + STRIKE_MSG + " " + ballResult + BALL_MSG);
            return;
        }
        if (strikeResult != 0) {
            System.out.println(strikeResult + STRIKE_MSG);
        }
        if (ballResult != 0) {
            System.out.println(ballResult + BALL_MSG);
        }
    }

    public static void printNothing() {
        System.out.println(NOTHING_MSG);
    }

    public static void printWinning() {
        System.out.println(WINNING_MSG);
    }
}
