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
        setStrikeAndBall();
        setIsNothing();
        setIsWinning();
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean getIsNothing() {
        return isNothing;
    }

    public boolean getIsWinning() {
        return isWinning;
    }

    private void setStrikeAndBall() {
        for (int i = 0; i < NUM_LEN; i++) {
            int strikeResult = isStrikeIdx(i);
            strike += strikeResult;
            ball += isBallIdx(strikeResult, i);
        }
    }

    private int isStrikeIdx(int idx) {
        if (targetNumber.charAt(idx) == userNumber.charAt(idx)) {
            return 1;
        }
        return 0;
    }

    private int isBallIdx(int strikeResult, int idx) {
        if (strikeResult == 1) return 0;
        if (targetNumber.contains(String.valueOf(userNumber.charAt(idx)))) {
            return 1;
        }
        return 0;
    }

    private void setIsNothing() {
        if (strike == 0 && ball == 0){
            isNothing = true;
        }
    }

    private void setIsWinning() {
        if (strike == NUM_LEN) {
            isWinning = true;
        }
    }
}
