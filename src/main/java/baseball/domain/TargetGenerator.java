package baseball.domain;

import baseball.utils.NumberValidator;
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
        } while (!NumberValidator.isDuplicated(tmpTargetNumber));

        return tmpTargetNumber;
    }

    private String generateRandomNumber() {
        StringBuilder targetBuilder = new StringBuilder();

        while (targetBuilder.length() < NUM_LEN) {
            targetBuilder.append(Randoms.pickNumberInRange(MIN_NUM, MAX_NUM));
        }

        return targetBuilder.toString();
    }
}
