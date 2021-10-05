package baseball;

import baseball.domain.BaseballGame;
import baseball.domain.TargetGenerator;
import baseball.domain.UserInputValidator;
import baseball.view.InputView;

public class Application {

    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        startNewGame();
    }

    private static void startNewGame() {
        String targetNumber = setTargetNumber();
        String userNumber = setUserNumber();

        BaseballGame baseBallGame = new BaseballGame(userNumber, targetNumber);
    }

    static String setTargetNumber() {
        TargetGenerator targetGenerator = new TargetGenerator();
        return targetGenerator.getTargetNumber();
    }

    private static String setUserNumber() {
        String userInput = InputView.getUserInput();
        UserInputValidator userInputValidator = new UserInputValidator(userInput);

        while (!userInputValidator.getIsValid()) {
            InputView.printInputErrorMsg();
            userInput = InputView.getUserInput();
            userInputValidator = new UserInputValidator(userInput);
        }
        return userInput;
    }
}
