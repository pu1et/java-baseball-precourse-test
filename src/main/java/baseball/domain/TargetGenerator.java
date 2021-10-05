package baseball.domain;

import nextstep.utils.Randoms;

public class TargetGenerator {
    private static final int NUM_LEN = 3;
    private static final int MAX_NUM = 9;
    private static final int MIN_NUM = 1;

    private final String targetNumber;

    public TargetGenerator() {
        this.targetNumber = setTargetNumber();
    }

    public String getTargetNumber() {
        return this.targetNumber;
    }

    private String setTargetNumber() {
        String tmpTargetNumber = null;

        do {
            tmpTargetNumber = generateRandomNumber();
        } while (!isDuplicated(tmpTargetNumber));

        return tmpTargetNumber;
    }

    private String generateRandomNumber() {
        StringBuilder targetBuilder = new StringBuilder();

        while (targetBuilder.length() < NUM_LEN) {
            targetBuilder.append(Randoms.pickNumberInRange(MIN_NUM, MAX_NUM));
        }

        return targetBuilder.toString();
    }

    private static boolean isDuplicated(String number) {
        if (number.charAt(0) == number.charAt(1)) {
            return false;
        }
        if (number.charAt(1) == number.charAt(2)) {
            return false;
        }
        if (number.charAt(0) == number.charAt(2)) {
            return false;
        }
        return true;
    }
}
