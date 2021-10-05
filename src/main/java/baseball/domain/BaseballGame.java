package baseball.domain;

public class BaseballGame {
    private static final int NUM_LEN = 3;

    private final String userNumber;
    private final String targetNumber;
    private int strike;
    private int ball;
    private boolean isNothing;
    private boolean isWinning;

    public BaseballGame(String userNumber, String targetNumber) {
        this.userNumber = userNumber;
        this.targetNumber = targetNumber;
        setGameResult();
    }

    private void setGameResult() {
        setStrike();
    }

    public int getStrike() {
        return strike;
    }

    private void setStrike() {
        for (int i = 0; i < NUM_LEN; i++) {
            int strikeResult = isStrikeIdx(i);
            strike += strikeResult;
        }
    }

    private int isStrikeIdx(int idx) {
        if (targetNumber.charAt(idx) == userNumber.charAt(idx)) {
            return 1;
        }
        return 0;
    }
}
