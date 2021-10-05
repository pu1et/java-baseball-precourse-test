package baseball;

import baseball.domain.BaseballGame;
import baseball.domain.TargetGenerator;
import baseball.domain.UserInputValidator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {

    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        startNewGame();
    }

    private static void startNewGame() {
        String targetNumber = setTargetNumber();
        String userNumber = setUserNumber();

        BaseballGame baseBallGame = new BaseballGame(userNumber, targetNumber);
        printGameResult(baseBallGame);
        if (!baseBallGame.getIsWinning()) {
            startNewGame();
            return;
        }
        OutputView.printWinning();
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

    private static void printGameResult(BaseballGame baseballGame) {
        if (baseballGame.getIsNothing()) {
            OutputView.printNothing();
            return;
        }
        OutputView.printStringAndBall(baseballGame.getStrike(), baseballGame.getBall());
    }
}
