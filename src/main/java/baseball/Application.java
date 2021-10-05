package baseball;

import baseball.domain.TargetGenerator;

public class Application {

    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        startNewGame();
    }

    private static void startNewGame() {
        String targetNumber = setTargetNumber();
    }

    static String setTargetNumber() {
        TargetGenerator targetGenerator = new TargetGenerator();
        return targetGenerator.getTargetNumber();
    }
}
