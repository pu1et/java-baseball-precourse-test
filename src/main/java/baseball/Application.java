package baseball;

import baseball.domain.BaseballGame;
import baseball.domain.TargetGenerator;
import baseball.domain.UserInputValidator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {

    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        do {
            String targetNumber = setTargetNumber();
            startNewGame(targetNumber);
        } while (isNewGame());
    }

    private static void startNewGame(String targetNumber) {
        String userNumber = setUserNumber();
        BaseballGame baseballGame = new BaseballGame(userNumber, targetNumber);

        printGameResult(baseballGame);
        if (!baseballGame.getIsWinning()) {
            startNewGame(targetNumber);
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

    private static boolean isNewGame() {
        final int NEW_GAME = 1;
        final int QUIT = 2;

        int userInput = InputView.getNewGameOrQuitGameInput();

        while (userInput != NEW_GAME && userInput != QUIT) {
            InputView.printInputErrorMsg();
            userInput = InputView.getNewGameOrQuitGameInput();
        }
        return userInput == NEW_GAME;
    }
}
